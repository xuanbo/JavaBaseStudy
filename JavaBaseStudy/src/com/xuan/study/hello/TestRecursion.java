package com.xuan.study.hello;

/**
 * 测试递归:自己调用自己，要有结束的时候
 * 
 * @author xuanbo
 * @date 2016年4月2日 下午6:22:40
 * @version 1.0
 */
public class TestRecursion {

	/*
	 * 递归求阶乘,要有结束的时候 消耗时间和空间： 每调用一次方法要重新开辟空间，之前的方法还没结束，要等待调用的方法结束
	 */
	public static int f(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * f(n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(f(5));
	}
}
