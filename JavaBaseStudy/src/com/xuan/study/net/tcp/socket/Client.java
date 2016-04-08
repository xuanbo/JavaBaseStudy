package com.xuan.study.net.tcp.socket;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端,指定服务器端+端口,此时就在连接
 * 
 * @author xuanbo
 * @date 2016年4月7日
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 创建客户端，跟服务器建立连接
		Socket client = new Socket("127.0.0.1", 8888);
		/*
		 * BufferedReader br = new BufferedReader(new
		 * InputStreamReader(client.getInputStream())); 
		 * char[] chars = new
		 * char[1024]; int hasRead = 0; 
		 * while ((hasRead = br.read(chars)) != -1){ 
		 * 		String content = new String(chars, 0, hasRead);
		 * 		System.out.print(content); 
		 * } 
		 * client.close();
		 */
		DataInputStream dis = new DataInputStream(new BufferedInputStream(client.getInputStream()));
	    String content = dis.readUTF();
	    System.out.println(content);
	    dis.close();
	    client.close();
	}
}
