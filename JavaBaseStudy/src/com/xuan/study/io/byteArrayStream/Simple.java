package com.xuan.study.io.byteArrayStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 与文件流对接
 * 文件 -> 程序 ->字节数组
 * 字节数组 -> 程序 -> 文件
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class Simple {

	public static void main(String[] args) throws IOException {
		toFileFromByteArray(getByteArrayFromFile("d:/h.java"), "d:/hh.java");
	}
	
	public static byte[] getByteArrayFromFile(String srcPath) throws IOException{
		File src = new File(srcPath);
		byte[] dis = null;
		
		InputStream is = new BufferedInputStream(new FileInputStream(src));
		// 要使用ByteArrayOutputStream的方法，不能使用多态
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		byte[] bytes = new byte[1024];
		int hasRead = 0;
		while((hasRead = is.read(bytes)) != -1){
			// 写入到字节数组流
			bo.write(bytes, 0, hasRead);
		}
		bo.flush();
		dis = bo.toByteArray();
		
		bo.close();
		is.close();
		return dis;
	}
	
	/**
	 * 将字节数组写入到文件
	 * 
	 * @param src
	 * @param disPath
	 * @throws IOException
	 */
	public static void toFileFromByteArray(byte[] src, String disPath) throws IOException{
		File dis = new File(disPath);
		InputStream is = new BufferedInputStream(new ByteArrayInputStream(src));
		OutputStream os = new BufferedOutputStream(new FileOutputStream(dis));
		
		byte[] bytes = new byte[1024];
		int hasRead = 0;
		while((hasRead = is.read(bytes)) != -1){
			os.write(bytes, 0, hasRead);
		}
		os.flush();
		
		os.close();
		is.close();
	}
}
