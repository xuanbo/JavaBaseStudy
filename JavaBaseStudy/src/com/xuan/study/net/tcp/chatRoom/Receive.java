package com.xuan.study.net.tcp.chatRoom;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

import com.xuan.study.io.close.FileUtil;

/**
 * 客户端接收数据线程
 * 
 * @author xuanbo
 * @date 2016年4月7日
 * @version 1.0
 */
public class Receive implements Runnable {

	// 管道输入流
	private DataInputStream dis;
	// 控制线程运行的标志
	private boolean isRunning = true;

	public Receive(Socket client) {
		try {
			dis = new DataInputStream(new BufferedInputStream(client.getInputStream()));
		} catch (IOException e) {
			//e.printStackTrace();
			isRunning = false;
			FileUtil.close(dis);
		}
	}

	/**
	 * 接收服务端的数据
	 * 
	 * @return
	 */
	public String receiveMessage() {
		String msg = "";
		try {
			msg = dis.readUTF();
		} catch (IOException e) {
			//e.printStackTrace();
			/*
			 * IOException则修改线程标志，关闭流
			 */
			isRunning = false;
			FileUtil.close(dis);
		}
		return msg;
	}

	@Override
	public void run() {
		while (isRunning) {
			// 每次运行时会阻塞，等待来自服务端的输入
			System.out.println(receiveMessage());
		}
	}
}
