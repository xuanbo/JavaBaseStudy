package com.xuan.study.io.charStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 字符流写入
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class TestWriter {

	public static void main(String[] args) {
		File file = new File("d:/DirCopy.java");
		File dis = new File("d:/hello2.java");
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader(file);
			writer = new FileWriter(dis);
			char[] chars = new char[1];
			int hasRead = 0;
			while((hasRead = reader.read(chars)) != -1){
				writer.write(chars, 0, hasRead);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
