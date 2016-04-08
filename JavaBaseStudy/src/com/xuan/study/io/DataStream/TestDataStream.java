package com.xuan.study.io.DataStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 数据类型处理流：保留基本数据类型+String
 * DataInputStream
 * DataOutputStream
 * 要使用新增方法就不能使用多态,可以传入缓冲处理流
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class TestDataStream {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException, InterruptedException {
		writer("d:/data.txt");
		Thread.currentThread().sleep(3000);
		read("d:/data.txt");
	}
	
	/**
	 * 从文件中读取数据+数据的类型（基本数据类型+String）
	 * 
	 * @param srcPath
	 * @throws IOException 
	 */
	public static void read(String srcPath) throws IOException{
		File src = new File(srcPath);
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(src)));
		// 读取的顺序必须与写入的一致，必须存在才能读取
		int a =dis.readInt();
		String str = dis.readUTF();
		double pi = dis.readDouble();
		long b = dis.readLong();
		dis.close();
		System.out.println(a + " " + str + " " + pi + " " + b);
	}
	
	
	/**
	 * 将基本数据类型+String写入到文件
	 * 保留了数据+类型，所以人是看不懂的，用DataInputStream读取
	 * @param disPath
	 * @throws IOException 
	 */
	public static void writer(String disPath) throws IOException{
		File dis = new File(disPath);
		int a =11;
		String str = "yyq今天是一个好日子";
		double pi = 3.14;
		long b = 124L;
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dis)));
		// 写出，跟读取的顺序要一致，不然就发生数据类型转化错误
		dos.writeInt(a);
		dos.writeUTF(str);
		dos.writeDouble(pi);
		dos.writeLong(b);
		// 输出流flush下，养成习惯
		dos.flush();
		// 释放资源
		dos.close();
	}
}
