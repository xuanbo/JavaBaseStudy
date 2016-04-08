package com.xuan.study.net.tcp.socket;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器
 * 
 * @author xuanbo
 * @date 2016年4月7日
 * @version 1.0
 */
public class Server {

	public static void main(String[] args) throws IOException {
		// 创建服务端，指定端口
		ServerSocket server = new ServerSocket(8888);
		// 接收客户端连接，阻塞式
		Socket socket = server.accept();
		System.out.println("客户端建立连接");
		String msg = "yyq今天是个好日子";
		/*
		 * BufferedWriter bw = new BufferedWriter(new
		 * OutputStreamWriter(socket.getOutputStream())); 
		 * bw.write(msg);
		 * bw.flush();
		 */
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
		dos.writeUTF(msg);
		dos.flush();
		server.close();
	}
}
