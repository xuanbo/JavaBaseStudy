package com.xuan.study.io.byteBuffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符处理流 有新增的方法：BufferedReader：readLine()读取一行；BufferedWriter：newLine()换行
 * 要使用新增的方法就不能发生多态；下面使用新增方法
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class TestBufferedCharStream {
	public static void main(String[] args) {
		File src = new File("d:/TestBufferedByteStream.java");
		File dis = new File("d:/hell.java");
		/*
		 * 使用新增的方法，就不能发生多态
		 */
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader(src));
			bw = new BufferedWriter(new FileWriter(dis));

			String line = null;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				// 换行
				bw.newLine();
			}
			// 强制刷出
			bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
