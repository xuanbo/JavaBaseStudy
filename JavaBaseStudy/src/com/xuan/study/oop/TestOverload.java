package com.xuan.study.oop;

/**
 * 	测试方法的重载: 同一个类，方法名相同，形参类型不同或形参个数不同或者，仅返回值不同不能重载。 
 *	构造方法也能重载 
 *	重载要不造成歧义，重载不合法编译器会提示
 * 
 * @author xuanbo
 * @date 2016年4月2日 下午11:14:56
 * @version 1.0
 */
public class TestOverload {
	public static void main(String[] args) {
		MyMath math = new MyMath();
		System.out.println(math.add(2, 3));
		System.out.println(math.add(2, 3, 4));
		// 下面调用的是double型的add，小数默认是double
		System.out.println(math.add(2.1, 2.1));
		// 下面调用的是float型的add
		System.out.println(math.add(2.1f, 2.1f));
		// 下面调用的是double型的add
		System.out.println(math.add(2.1f, 2.1));
	}
}

/**
 * 自定自己的数学类
 * 
 * @author xuanbo
 * @date 2016年4月2日 下午11:16:38
 * @version 1.0
 */
class MyMath {
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public float add(float a, float b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}
}