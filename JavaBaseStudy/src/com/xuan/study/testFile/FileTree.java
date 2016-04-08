package com.xuan.study.testFile;

import java.io.File;

/**
 * 通过递归打印文件夹下的文件
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class FileTree {
	public static void main(String[] args) {

		File file = new File("d:/Java");
		printFile(file, 0);
	}

	private static void printFile(File file, int level) {
		for (int i = 0; i < level; i++) {
			System.out.print("-");
		}
		System.out.println(file.getName());

		if (file.isDirectory()) {
			File[] files = file.listFiles();
			/*
			 * 目录下为空则结束
			 */
			if (files == null) {
				return;
			}
			for (File f : files) {
				printFile(f, level + 1);
			}
		}
	}
}
