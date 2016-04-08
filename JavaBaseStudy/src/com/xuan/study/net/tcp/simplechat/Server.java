package com.xuan.study.net.tcp.simplechat;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8888);
		Socket socket = server.accept();

		// 接收数据
		DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		String msg = dis.readUTF();
		System.out.println(msg);

		// 发送数据
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
		dos.writeUTF("server->" + msg);
		dos.flush();
	}
}
