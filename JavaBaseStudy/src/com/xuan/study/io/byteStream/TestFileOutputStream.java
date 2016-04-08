package com.xuan.study.io.byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 写入文件，字节
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class TestFileOutputStream {
	public static void main(String[] args) {

		File file = new File("d:/ScannerVideo.java");
		File distinct = new File("d:/test.java");

		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(file);
			os = new FileOutputStream(distinct);
			byte[] bytes = new byte[1024];
			int hasRead = 0;
			while ((hasRead = is.read(bytes)) != -1) {
				// 读多少个写多少个
				os.write(bytes, 0, hasRead);
				// 强制刷新出去
				os.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭原则：先打开的后关闭
				if (os != null) {
					os.close();
				}
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
