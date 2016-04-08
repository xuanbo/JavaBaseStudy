package com.xuan.study.net.tcp.chatToSomeone;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.xuan.study.io.close.FileUtil;

public class Server {
	
	// 存放已连接的客户端
	private List<MyChannal> clients = new ArrayList<MyChannal>();

	public static void main(String[] args) throws IOException {
		new Server().start();
	}

	/**
	 * 启动服务器
	 * @throws IOException
	 */
	@SuppressWarnings("resource")
	public void start() throws IOException {
		ServerSocket server = new ServerSocket(9999);
		while (true) {
			Socket socket = server.accept();
			MyChannal channal = new MyChannal(socket);
			// 将连接上服务器的客户端加入List
			clients.add(channal);
			new Thread(channal).start();
		}
	}

	/**
	 * 为每一个客户端分配一个线程 设置为内部类便于访问Server类的信息
	 */
	private class MyChannal implements Runnable {
		
		// 输入流
		private DataInputStream dis;
		// 输出流
		private DataOutputStream dos;
		// 线程是否可运行的标志
		private boolean isRunning = true;

		public MyChannal(Socket socket) {
			try {
				dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
				dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
			} catch (IOException e) {
				// e.printStackTrace();
				/*
				 * 创建线程出现异常，设置标志为不可运行，关闭流
				 */
				isRunning = false;
				FileUtil.close(dos, dis);
			}
		}

		/**
		 * 接收客户端的数据
		 * 
		 * @return
		 */
		private String receiveMessage() {
			String msg = "";
			try {
				msg = dis.readUTF();
			} catch (IOException e) {
				// e.printStackTrace();
				isRunning = false;
				FileUtil.close(dis);
				
				// 出现异常移除自身
				clients.remove(this);
			}
			return msg;
		}

		/**
		 * 向客户端发送数据
		 * 
		 * @param msg
		 */
		private void sendMessage(String msg) {
			if (msg == null || msg == "") {
				return;
			}
			try {
				dos.writeUTF(msg);
				// 写完最好flush()下
				dos.flush();
			} catch (IOException e) {
				// e.printStackTrace();
				isRunning = false;
				FileUtil.close(dos);
				
				// 出现异常移除自身
				clients.remove(this);
			}
		}

		/**
		 * 将某个客户端发送的信息，发送给其他客户端
		 */
		private void sendMessageToOthers(){
			String msg = receiveMessage();
			// 遍历容器
			for (MyChannal other : clients) {
				if (other == this) {
					continue;
				}
				other.sendMessage(msg);
			}
		}
		
		
		@Override
		public void run() {
			while (isRunning) {
				sendMessageToOthers();
			}
		}

	}
}
