package com.xuan.study.net.tcp.chatToSomeone;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端
 * 
 * @author xuanbo
 * @date 2016年4月7日
 * @version 1.0
 */
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("127.0.0.1", 9999);
		// 开启发送消息线程
		new Thread(new Send(client)).start();
		// 开启接收消息 
		new Thread(new Receive(client)).start();;
	}
}
