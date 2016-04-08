package com.xuan.study.wrappedClass;

/**
 * 测试自动装箱和自动拆箱
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class TestAutoBoxAndUnbox {

	public static void main(String[] args) {
		Integer i = new Integer(100);
		// jdk5.0之后引入自动装箱，编译器帮我们修改代码为上面的形式
		Integer ii = 100;
		System.out.println(i);
		System.out.println(ii);

		// 自动拆箱，编译器帮我们修改代码为:int a = ii.intValue()
		int a = ii;
		System.out.println(a);

		/*
		 * Integer c = null; 
		 * // 下面自动拆箱，编译器帮我们修改代码：int d = c.intValue(),会出现空指针异常
		 * @SuppressWarnings("null") int d = c; System.out.println(d);
		 */

		/*
		 * 自动装箱为两个Integer对象，所以输出false
		 */
		Integer x = 1234;
		Integer y = 1234;
		System.out.println(x == y);
		System.out.println(x.equals(y));
		/*
		 * 下面为什么会输出true呢？
		 * 原来jdk的开发人员，把[-128, 127]之间的整数自动装箱时仍当做基本数据类型处理
		 */
		Integer x1 = 123;
		Integer y1 = 123;
		System.out.println(x1.equals(y1));
	}
}
