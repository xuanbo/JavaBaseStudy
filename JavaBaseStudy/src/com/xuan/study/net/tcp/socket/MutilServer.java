package com.xuan.study.net.tcp.socket;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器 接收多个客户端的请求
 * 
 * @author xuanbo
 * @date 2016年4月7日
 * @version 1.0
 */
public class MutilServer {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// 创建服务端，指定端口
		ServerSocket server = new ServerSocket(8888);
		while (true) {
			/*
			 * 如果某次连接阻塞，其他的连接都会阻塞
			 */
			// 接收客户端连接，阻塞式
			Socket socket = server.accept();
			System.out.println("客户端建立连接");
			String msg = "Hello World";
			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
			dos.writeUTF(msg);
			dos.flush();
		}
	}
}
