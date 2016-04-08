package com.xuan.study.net.tcp.chatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端私聊
 * 约定：@用户名:私聊内容
 * 
 * @author xuanbo
 * @date 2016年4月7日
 * @version 1.0
 */
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 请输入用户名
		System.out.println("请输入用户名:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		if (name.equals("")) {
			return;
		}
		
		Socket client = new Socket("127.0.0.1", 9999);
		// 开启发送消息线程
		new Thread(new Send(client, name)).start();
		// 开启接收消息 
		new Thread(new Receive(client)).start();;
	}
}
