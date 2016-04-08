package com.xuan.study.oop.abstractClass;

/**
 * 抽象类：有时候我们只想为一个类定义一些方法，让子类去重写，自己不想提供一个方法体 抽象类不能实例化，但可以引用子类的对象
 * 设计的意义：将方法的设计和实现分离
 * @author xuanbo
 * @date 2016年4月3日 下午4:33:42
 * @version 1.0
 */
public abstract class Animal {

	/*
	 * 抽象类可以有属性、方法（包含构造器）、但是不能通过new来调用构造器创建对象
	 */
	public Animal() {
		System.out.println("animal");
	}
	
	// 抽象方法，有抽象方法的类一定是抽象类
	public abstract void run();

	/*
	 * 那么这里调用的run方法是调用的父类的呢，还是子类的？
	 * 记住this和super就显而易见的知道，调用的是调用play方法的对象的run方法了
	 */
	public void play() {
		run();
	}
}

/**
 * 子类要实现抽象方法，哪怕是一个空方法，否则子类也要声明为一个抽象类
 * 
 * @author xuanbo
 * @date 2016年4月3日 下午4:36:26
 * @version 1.0
 */
class Dog extends Animal {

	// 记住默认第一行调用super()
	public Dog() {
		System.out.println("dog");
	}
	
	@Override
	public void run() {
		System.out.println("跑");
	}

}
