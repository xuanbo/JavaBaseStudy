package com.xuan.study.hello;

/**
 * 测试switch语句
 * @author xuanbo
 * @date 2016年4月2日 下午3:42:33
 * @version 1.0
 */
public class TestSwitch {
	public static void main(String[] args) {
		double d = Math.random();
		int i = (int) (d * 6) + 1;

		/*
		 * int型，或者其他可以自动转为int型的数据类型（byte，short，char）,以及枚举 
		 * jdk7中新特性：表达式可以为字符串
		 * 没有break，会继续执行下面的case，知道遇到break才跳出switch
		 */
		switch (i) {
		case 1:
			System.out.println("1点");
			break;
		case 2:
			System.out.println("2点");
			break;
		case 3:
			System.out.println("3点");
			break;
		case 4:
			System.out.println("4点");
			break;
		case 5:
			System.out.println("5点");
			break;
		case 6:
			System.out.println("6点");
			break;
		default:
			System.out.println("没点");
			break;
		}

		/*
		 * 利用break穿透现象
		 */
		System.out.println("----------是否是元音------------");
		char a = 'a';
		int n = (int) (26 * Math.random());
		char ch = (char) (a + n);
		System.out.println(ch);
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("元音");
			break;
		case 'y':
		case 'w':
			System.out.println("半元音");
			break;
		default:
			System.out.println("辅音");
			break;
		}
		
		/*
		 * jdk7switch新特性，表达式可以使用字符串
		 */
		String name = "王漩波";
		switch (name) {
		case "王漩波":
			System.out.println("王漩波");
			break;
		default:
			System.out.println("yyq");
			break;
		}
	}
}
