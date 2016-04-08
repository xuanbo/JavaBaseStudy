package com.xuan.study.oop.inherit;

/**
 * 定义一个类时，如果指定继承哪一个类，那么默认继承Object类
 * 
 * @author xuanbo
 * @date 2016年4月3日 下午12:25:40
 * @version 1.0
 */
public class Animal {

	String eye;

	public Animal() {
		System.out.println("创建一个Animal");
	}

	public Animal(String eye) {
		System.out.println("创建一个Animal:" + eye);
	}

	public void run() {
		System.out.println("跑");
	}

	public void eat() {
		System.out.println("吃");
	}

	public static void main(String[] args) {
		// 总是先调用父类的构造方法，然后实例化父类的对象（省略父类继续调用父类的构造器）
		Mammal m = new Mammal();
		// 调用自己重写的eat()方法。首先看自己有没有没这个方法，如果有调用自己的，如果没有，调用父类的，都没有就报错
		m.eat();
	}
}

/**
 * 子类继承父类，可以得到父类的全部属性跟方法（除了构造方法） 
 * java只有单继承（直接父类只能有一个）。但可以实现多个接口
 * 
 * @author xuanbo
 * @date 2016年4月3日 下午12:11:25
 * @version 1.0
 */
class Mammal extends Animal {

	/*
	 * 第一行总是调用父类的构造器，即使自己没有加 
	 * 如果自己显示加了父类的构造器，就会调用父类相应的构造器
	 * 如果没有显示的加父类的构造器，那么会默认调用父类的无参构造器，如果没有无参构造器，会编译错误
	 */
	public Mammal() {
		super("blue");
		System.out.println("创建一个Mammal");
	}

	/*
	 * 重写父类的eat()方法 重写之后，外部就调用不到父类的方法了，内部可以调用的
	 */
	public void eat() {
		System.out.println("吃啊吃啊");
	}

	public void paly() {
		System.out.println("zzzzz");
	}
}
