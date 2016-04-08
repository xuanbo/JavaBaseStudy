package com.xuan.study.oop.innerClass;

/**
 * 内部类：静态内部类和非静态内部类
 * 
 * 内部类一般是为外部类服务的，跟它相关，其他类不怎么跟它打交道。
 * 内部类可以直接访问外部类的属性和方法，哪怕是private修饰的
 * 外部类不能直接访问内部类的属性和方法，哪怕是public修饰的
 * 
 * 内部类也可以定义在方法内，这样就相当于一个局部的类，只能在该方法内起作用
 * 
 * 匿名内部类：在一个类里new一个对象的时候直接写出这个类的属性和方法
 * 
 * @author xuanbo
 * @date 2016年4月3日 下午6:54:34
 * @version 1.0
 */
public class Outer {

	private int age;
	
	private String name;

	public void hello() {
		// System.out.println(name);
		// System.out.println(password);
		/*
		 * 要通过外部类来使用内部类
		 */
		Outer.Inner inner = new Outer.Inner();
		inner.say();
	}
	/*
	 * 内部类可以直接访问外部类的属性和方法，哪怕是private修饰的。内部类相当于外部类的属性，所以可以直接访问
	 * 外部类不能直接访问内部类的属性和方法，哪怕是public修饰的
	 */
	class Inner {

		private String name;

		public String password;
		
		public void say() {
			// 访问外部类相同的name属性
			System.out.println(Outer.this.name);
			// 访问内部内的name属性
			System.out.println(name + " " + age);
		}
	}
}
