package com.xuan.study.io.byteArrayStream;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 字节数组节点流：FileInputStream是操作文件，它是操作字节数组（一般是其他电脑或服务器上的字节数组），所以close方法无效
 * ByteArrayOutputStream新增方法：toByteArray();想用新增方法就不能使用多态
 * 以程序为中心，流向程序为输入流
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class TestByteArrayStream {

	public static void main(String[] args) {
		String data = "yyq今天是个好日子";
		byte[] dis = null;
		/**
		 * ByteArrayInputStream没有新增方法，可以使用多态
		 */
		InputStream is = new BufferedInputStream(new ByteArrayInputStream(data.getBytes()));
		/*
		 * ByteArrayOutputStream有新增的方法，要使用就不能使用多态
		 * 跟FileOutputStream有些不同，创建的时候不能关联目的地
		 * 默认长度为32个字节数组
		 */
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		// 将字节数组写入字节数组管道
		bo.write(data.getBytes(), 0, data.getBytes().length);
		// 获取管道中的数据
		dis = bo.toByteArray();
		try {
			bo.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println(new String(dis, 0, dis.length));
		
		
		/*
		 * 读跟之前一样
		 */
		byte[] bytes = new byte[1024];
		int hasRead = 0;
		try {
			while((hasRead = is.read(bytes))!= -1){
				String content = new String(bytes, 0, hasRead);
				System.out.println(content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
