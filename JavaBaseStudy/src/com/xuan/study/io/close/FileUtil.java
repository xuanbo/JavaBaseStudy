package com.xuan.study.io.close;

import java.io.Closeable;
import java.io.IOException;

/**
 * 关闭工具类
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class FileUtil {

	/**
	 * 使用可变参数关闭
	 * 
	 * @param ios
	 */
	public static void close(Closeable... ios){
		for (Closeable io : ios) {
			try {
				io.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 使用泛型
	 * 
	 * @param ios
	 */
	public static <T extends Closeable> void closeAll(@SuppressWarnings("unchecked") T... ios){
		for (T io : ios) {
			try {
				io.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
