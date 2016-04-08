package com.xuan.study.io.DataStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * 有时需要将数据和数据类型写入字节数组中
 * 通过这个例子，要知道哪些流是节点流，哪些是处理流；节点流直接跟源打交道，处理流套用节点流
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class DataToByteArray {

	public static void main(String[] args) {
		try {
			byte[] data = writer();
			read(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 从字节数组中获取数据和类型
	 * 
	 * @param src
	 * @throws IOException
	 */
	public static void read(byte[] src) throws IOException {
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(src)));
		// 读取的顺序必须与写入的一致，必须存在才能读取
		int a = dis.readInt();
		String str = dis.readUTF();
		double pi = dis.readDouble();
		long b = dis.readLong();
		dis.close();
		System.out.println(a + " " + str + " " + pi + " " + b);
	}

	/**
	 * 将数据和数据类型写入字节数组
	 * 
	 * @return
	 * @throws IOException
	 */
	public static byte[] writer() throws IOException {
		int a = 11;
		String str = "yyq今天是一个好日子";
		double pi = 3.14;
		long b = 124L;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		// 将节点流赋为字节数组流
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(bos));
		dos.writeInt(a);
		dos.writeUTF(str);
		dos.writeDouble(pi);
		dos.writeLong(b);
		dos.flush();

		byte[] dis = null;
		dis = bos.toByteArray();

		dos.close();
		return dis;
	}
}
