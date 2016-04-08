package com.xuan.study.hello;

/**
 * if语句的学习
 * @author xuanbo
 * @date 2016年4月2日 下午3:08:09
 * @version 1.0
 */
public class TestIf {
	public static void main(String[] args) {
//		随机数的使用
		double d = Math.random();	//[0,1)之间的小数
		int i = (int)(d * 5);	//[0,4]之间的整数
		System.out.println(d * 5);
		System.out.println(i);
		
//		不加{}时if语句的控制范围只有第一句
		if (i == 3) {
			System.out.println("符合条件才执行");
		}
		
		if (i == 3) {
			System.out.println("符合条件才执行");
		}else {
			System.out.println("不符合条件才执行");
		}
		
		/*
		 *	对于if语句，我们进行判断时，先判断小范围，
		 *		再判断大范围，这样大范围中就不包含小范围了 
		 */
		if (i >= 3) {
			System.out.println("i >= 3");
		}else if (i >= 1) {
			System.out.println("1<= i < 3");
		}else {
			System.out.println("i = 0");
		}
	}
}
