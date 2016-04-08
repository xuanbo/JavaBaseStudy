package com.xuan.study.net.tcp.chatRoom;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import com.xuan.study.io.close.FileUtil;

/**
 * 客户端发送数据线程
 * 
 * @author xuanbo
 * @date 2016年4月7日
 * @version 1.0
 */
public class Send implements Runnable {
	
	// 控制台输入流
	private BufferedReader console;
	// 管道输出流
	private DataOutputStream dos;
	// 控制线程运行的标志
	private boolean isRunning = true;
	
	//发送的用户名
	@SuppressWarnings("unused")
	private String name;

	public Send(Socket client, String name) {
		console = new BufferedReader(new InputStreamReader(System.in));
		try {
			dos = new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
			this.name = name;
			sendMessage(name);
		} catch (IOException e) {
			//e.printStackTrace();
			isRunning = false;
			// 使用工具类关闭流
			FileUtil.close(dos, console);
		}
	}

	/**
	 * 从控制台接收输入
	 * 
	 * @return
	 */
	public String getMessageFromConsole() {
		try {
			return console.readLine();
		} catch (IOException e) {
			//e.printStackTrace();
			isRunning = false;
			// 使用工具类关闭流
			FileUtil.close(console);
		}
		return "";
	}

	/**
	 * 发送数据 先从控制台接收，然后发送给服务器
	 */
	public void sendMessage(String msg) {
		if (msg == "" || msg == null) {
			return;
		}
		try {
			dos.writeUTF(msg);
			dos.flush();
		} catch (IOException e) {
			//e.printStackTrace();
			/*
			 * Socket管道出现问题，直接关闭流
			 */
			isRunning = false;
			// 使用工具类关闭流
			FileUtil.close(dos);
		}
	}

	@Override
	public void run() {
		while (isRunning) {
			// 每次调用时，会阻塞，等待用户从控制台输入，然后发送
			sendMessage(getMessageFromConsole());
		}
	}

}
