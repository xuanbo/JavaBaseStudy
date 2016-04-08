package com.xuan.study.hello;

/**
 * 测试方法：尽量保持方法的原子性，一个方法只完成某一个功能，这样利于扩展
 * 
 * @author xuanbo
 * @date 2016年4月2日 下午6:04:30
 * @version 1.0
 */
public class TestMethod {

	/*
	 * 方法的定义
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int add(int a, int b) {
		return a + b;
	}

	/*
	 * 测试方法是值传递还是地址（引用）传递
	 * 
	 * @param a
	 */
	public static void test(int a) {
		a++;
	}

	public static void main(String[] args) {
		// 调用方法
		int sum = add(1, 2);
		System.out.println(sum);

		/*
		 * 可以看到java的方法中参数传递是值传递（对于基本类型而言）
		 */
		int a = 2;
		test(a);
		System.out.println(a);
	}
}
