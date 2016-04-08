package com.xuan.study.net.udp;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
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
public class Client {

	public static void main(String[] args) throws IOException {
		/*
		 * 非面向连接的，是数据找服务器，而不是客户端与服务器连接好
		 */

		// 创建客户端 + 端口
		DatagramSocket client = new DatagramSocket(6666);
		// 准备数据
		byte[] data = convert(3.14159);
		// 打包 + 服务器的地址以及端口
		DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 8888);
		// 发送数据
		client.send(packet);
		// 关闭
		client.close();
	}

	/**
	 * 将数据写入到数据+类型字节数组
	 * 
	 * @param data
	 * @return
	 * @throws IOException
	 */
	public static byte[] convert(double data) throws IOException {
		// 使用新增的方法，不是使用多态，创建时关联数据源
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(bos));
		dos.writeDouble(data);
		dos.flush();
		dos.close();
		byte[] msg = bos.toByteArray();
		return msg;
	}
}
