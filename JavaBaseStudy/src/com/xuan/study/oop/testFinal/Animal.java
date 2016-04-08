package com.xuan.study.oop.testFinal;

/**
 * final修饰一个类，那么这个类不能被继承
 * 
 * @author xuanbo
 * @date 2016年4月3日 下午2:06:18
 * @version 1.0
 */
public class Animal {

	/**
	 * final修饰的方法，不能被子类重写
	 */
	public final void run() {
		System.out.println("跑");
	}
}

class Bird extends Animal {

	/**
	 * 无法重写父类的run()方法
	 */
	/*
	 * public void run() { System.out.println("飞啊飞"); }
	 */

}
