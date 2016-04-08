package com.xuan.study.io.printStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * 打印流：PrintStream，是处理流
 * System.in:标准输入，即键盘输入 
 * System.out：标准输出，即控制台输出；默认是调用的PrintStream
 * System.err
 * 可以通过System提供的setIn、setOut重新分配标准的输入和输出流
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class TestPrintStream {

	/**
	 * PrintStream修改为文件输出
	 */
	public static void hello() {
		// 使用的就是打印流PrintStream
		System.out.println("yyq今天是个好日子");

		PrintStream ps = System.out;
		ps.println("yyq");

		// 输出到文件
		File dis = new File("d:/print.txt");
		try {
			ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(dis)));
			ps.println("yyq今天是个好日子");
			ps.println("花好月圆");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			ps.close();
		}
	}
	
	/**
	 * Scanner修改为文件输入
	 * @throws FileNotFoundException 
	 */
	public static void world() throws FileNotFoundException{
		// 接收键盘输入
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println(str);
		/*
		 * 下面修改为Scanner文件输入
		 */
		File src = new File("d:/ScannerVideo.java");
		scanner = new Scanner(new BufferedInputStream(new FileInputStream(src)));
		while(scanner.hasNext()){
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}

	public static void main(String[] args) {
		hello();
		try {
			world();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
