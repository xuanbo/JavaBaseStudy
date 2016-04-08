package com.xuan.study.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 服务端，基于UDP，面向无连接
 * 我们可以把数据+类型写入字节数组，客户端发送，服务端获取，解析字节数组
 * 
 * @author xuanbo
 * @date 2016年4月7日
 * @version 1.0
 */
public class MyServer {

	public static void main(String[] args) throws IOException {
		// 创建服务端 + 端口
		DatagramSocket server = new DatagramSocket(8888);
		// 接收容器
		byte[] container = new byte[1024];
		// 封装成包
		DatagramPacket packet = new DatagramPacket(container, container.length);
		// 接收数据
		server.receive(packet);
		// 获取分析数据
		byte[] data = packet.getData();
		int len = packet.getLength();
		System.out.println(new String(data, 0, len));
		// 释放资源
		server.close();
	}
}
