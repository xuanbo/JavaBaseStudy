package com.xuan.study.net.tcp.simplechat;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端：可以接收数据和发送数据
 * 存在问题：只能先发送信息，才能接收服务器的返回信息，需要让他们彼此独立，这就要求使用线程
 * 
 * @author xuanbo
 * @date 2016年4月7日
 * @version 1.0
 */
public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("127.0.0.1", 8888);
		
		// 从控制台输入信息
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		
		// 发送数据
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
		dos.writeUTF(data);
		dos.flush();
		
		// 接收数据
		DataInputStream dis = new DataInputStream(new BufferedInputStream(client.getInputStream()));
		String msg = dis.readUTF();
		System.out.println(msg);
	}
}
