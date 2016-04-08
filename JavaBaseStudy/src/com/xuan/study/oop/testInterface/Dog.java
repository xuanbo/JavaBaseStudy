package com.xuan.study.oop.testInterface;

/**
 * 定义一个接口
 * 接口可以用来解决java类的单继承问题，可以实现多个接口
 * 注意：一个接口可以继承多个接口
 * 
 * @author xuanbo
 * @date 2016年4月3日 下午5:17:19
 * @version 1.0
 */
public interface Dog {

	/**
	 * 接口中只能有常量和抽象方法
	 */

	// public static final 写不写总是默认的
	public static final int MAX_YEAR = 15;
	String name = "狗";

	// 方法总是默认声明为public abstract
	void run();

	public int speed();
}
