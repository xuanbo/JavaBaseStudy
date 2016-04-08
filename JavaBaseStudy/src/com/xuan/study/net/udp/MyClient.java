package com.xuan.study.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 客户端
 * 
 * @author xuanbo
 * @date 2016年4月7日
 * @version 1.0
 */
public class MyClient {

	public static void main(String[] args) throws IOException {
		/*
		 * 非面向连接的，是数据找服务器，而不是客户端与服务器连接好
		 */

		// 创建客户端 + 端口
		DatagramSocket client = new DatagramSocket(6666);
		// 准备数据
		String msg = "UDP 编程，yyq今天是个好日子";
		byte[] data = msg.getBytes();
		// 打包 + 服务器的地址以及端口
		DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 8888);
		// 发送数据
		client.send(packet);
		// 关闭
		client.close();
	}
}
