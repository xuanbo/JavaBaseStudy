package com.xuan.study.testFile;

import java.io.File;

/**
 * File类
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class TestFile {
	public static void main(String[] args) {
		/*
		 * File既可以代表一个文件也可以代表一个目录（可以使存在的也可以是不存在的）
		 */
		File f1 = new File("D:/Spring/spring+hibernate+mysql（jar）");
		File f2 = new File("D:/Spring/spring+hibernate+mysql（jar）/antlr-2.7.7.jar");
		File f3 = new File(f1, "antlr-2.7.7.jar");

		/*
		 * 判断File是一个文件还是一个目录
		 */
		if (f1.isDirectory()) {
			System.out.println(f1.getAbsolutePath() + " is directory");
		}
		if (f2.isDirectory()) {
			System.out.println(f2.getAbsolutePath() + " is directory");
		}
		if (f3.isFile()) {
			System.out.println(f3.getAbsolutePath() + " is file");
		}

		/*	
		 * 创建一个文件
		 * 
		 * File temp = new File(f1, "helloworld.txt"); try {
		 * temp.createNewFile(); } catch (IOException e) { e.printStackTrace();
		 * }
		 * 
		 * 删除文件或目录（是空的目录才能删）
		 * 
		 * temp.delete();
		 */
	}
}
