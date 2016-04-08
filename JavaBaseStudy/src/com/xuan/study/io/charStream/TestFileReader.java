package com.xuan.study.io.charStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 字符流读取
 * 只能读取可见的纯文本，.txt,.html等
 * 图片、视频、音频等无法处理
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class TestFileReader {

	public static void main(String[] args) {
		File file = new File("d:/ScannerVideo.java");
		Reader reader = null;
		try {
			reader = new FileReader(file);
			char[] chars = new char[1024];
			int hasRead = 0;
			while((hasRead = reader.read(chars)) != -1){
				String content = new String(chars, 0, hasRead);
				System.out.println(content);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
