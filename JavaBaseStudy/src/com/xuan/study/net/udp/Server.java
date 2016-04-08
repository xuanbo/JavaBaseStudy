package com.xuan.study.net.udp;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 服务端
 * 我们可以把数据+类型写入字节数组，客户端发送，服务端获取，解析字节数组
 * 
 * @author xuanbo
 * @date 2016年4月7日
 * @version 1.0
 */
public class Server {

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
		double number = convert(packet.getData());
		System.out.println(number);
		// 释放资源
		server.close();
	}
	
	/**
	 * 将数据+类型的字节数组读取
	 * 
	 * @param data
	 * @return
	 * @throws IOException
	 */
	public static double convert(byte[] data) throws IOException{
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(data)));
		double number = dis.readDouble();
		dis.close();
		return number;
	}
}
