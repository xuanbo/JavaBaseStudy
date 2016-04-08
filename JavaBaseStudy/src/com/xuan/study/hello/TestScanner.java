package com.xuan.study.hello;

import java.util.Scanner;

/**
 * 测试键盘输入
 * 
 * @author xuanbo
 * @date 2016年4月2日 下午7:14:03
 * @version 1.0
 */
public class TestScanner {
	/**
	 * 键盘输入测试
	 */
	public static void input() {
		System.out.println("请输入内容：");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		// 程序运行到scanner.next();会阻塞，等待用户输入
		String inputString = scanner.next();
		System.out.println("输入的字符串：" + inputString);
	}

	/**
	 * 键盘输入两个输入，返回相加的结果
	 * 如果输入的不是整型会报异常
	 * @return
	 */
	public static int add() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个被加数：");
		int a = in.nextInt();
		System.out.println("请输入一个加数：");
		int b = in.nextInt();
		return a + b;
	}

	public static void main(String[] args) {
		input();
		System.out.println(add());
	}
}
