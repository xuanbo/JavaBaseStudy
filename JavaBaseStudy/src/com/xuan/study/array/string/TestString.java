package com.xuan.study.array.string;

/**
 * 测试String字符串
 * 
 * @author xuanbo
 * @date 2016年4月3日 下午9:07:00
 * @version 1.0
 */
public class TestString {
	public static void main(String[] args) {
		/*
		 * 通过这个例子可以看到final修饰的引用变量地址不能修改，但引用变量指向的值可以修改
		 */
		final String[] a = { "yyq", "wxb" };
		a[1] = "zzz";
		System.out.println(a[1]);

		/*
		 * 使用String提供的方法，略
		 */

		
		
		/*
		 * 执行这个语句，首先在常量池中创建一个'a'字符串
		 * 然后，创建一个字符串引用，地址指向'a'字符串
		 * 最后，创建栈中一个str引用指向这个字符串引用
		 */
		String str = new String("a");
		/*
		 * 对于这个循环，每次执行str += i;会创建一个字符串（字符串为原来的加i），然后将这个字符串的地址放在str
		 * 既浪费时间也浪费空间
		 */
		for (int i = 0; i < 10; i++) {
			str += i;
		}
		System.out.println(str);
	}
}
