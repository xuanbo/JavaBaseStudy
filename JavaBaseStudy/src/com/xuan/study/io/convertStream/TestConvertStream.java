package com.xuan.study.io.convertStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * 转换流：将字节转为字符 ；处理乱码的问题 输出流：OutputStreamWriter 输入流：InputStreamReader
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class TestConvertStream {
	public static void main(String[] args) {
		/*
		 * 源文件的编码是GBK
		 * 源文件是什么编码就用什么编码解码
		 */
		File src = new File("d:/ScannerVideo.java");
		File dis = new File("d:/h.java");
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			/**
			 * 节点流使用FileInputStream直接跟文件打交道 缓冲流是用BufferedReader，它是缓冲字符流
			 * 所以需要一个转换流做桥梁，让字节流向字符，即InputStreamReader,解码的时候可以指定字符集，
			 * 不指定就使用平台默认的字符集进行解码
			 */
			br = new BufferedReader(new InputStreamReader(new FileInputStream(src), "GBK"));
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dis)));
			String line = null;
			while ((line = br.readLine()) != null) {
				/*
				 * 这里使用平台默认的编码进行编码，将字符串line编码为二进制
				 */
				//System.out.println(line);
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null){
					bw.close();
				}
				if(br != null){
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
