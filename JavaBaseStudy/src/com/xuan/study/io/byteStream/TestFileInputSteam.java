package com.xuan.study.io.byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * 读取文件,字节
 * 字节可以读取一切文本文件
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class TestFileInputSteam {
	public static void main(String[] args) {
		File file = new File("d:/ScannerVideo.java");
		if (!file.exists()) {
			System.out.println("文件不存在");
			return;
		}
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			byte[] bytes = new byte[1024];
			int hasRead = 0;
			while ((hasRead = is.read(bytes)) != -1) {
				/*
				 * 将每次读取的字节转为字符串，用GBK编码
				 */
				String content = new String(bytes, 0, hasRead, Charset.forName("GBK"));
				System.out.println(content);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
