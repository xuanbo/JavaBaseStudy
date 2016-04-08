package com.xuan.study.oop;

/**
 * 测试静态属性和静态方法:
 * 静态方法和静态属性是属于这个类的信息，每个对象在创建的时候不会包含静态部分. 静态信息是所有以这个类为模板创建的对象共享的
 * 
 * @author xuanbo
 * @date 2016年4月3日 上午10:58:29
 * @version 1.0
 */
public class TestStatic {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		/*
		 * 静态属性和方法如果访问权限允许时，可以通过类名调用
		 */
		People.country = "地球";
		People.printCountry();

		People p = new People();
		/*
		 * 静态属性和方法如果访问权限允许时，也可以通过对象调用
		 */
		System.out.println(p.country);
		p.printCountry();
	}
}

class People {
	String name;

	static String country;

	/**
	 * 非静态方法可以调用静态方法和属性。非静态同过对象找到这个对象的类的静态信息，所以非静态能访问静态的
	 */
	public void printName() {
		country = "中国";
		printCountry();
		System.out.println(name);
	}

	/**
	 * 静态方法不能调用非静态方法和属性
	 * 因为对象在创建的时候，不包含静态信息，静态信息是属于这个类的，而类并不知道哪一个对象会调用静态信息，所以静态不能调用非静态的
	 */
	public static void printCountry() {
		// name = "张三";
		// printName();
		System.out.println(country);
	}
}
