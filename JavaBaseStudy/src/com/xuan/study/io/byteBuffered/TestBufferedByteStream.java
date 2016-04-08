package com.xuan.study.io.byteBuffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 字节处理流 
 * 套一个处理流即可，提高效率
 * 
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class TestBufferedByteStream {

	public static void main(String[] args) {
		File src = new File("d:/QQ.png");
		File dis = new File("d:/QQ1.png");
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new BufferedInputStream(new FileInputStream(src));
			os = new BufferedOutputStream(new FileOutputStream(dis));
			byte[] bytes = new byte[1024];
			int hasRead = 0;
			while ((hasRead = is.read(bytes)) != -1) {
				os.write(bytes, 0, hasRead);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
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
