package com.xuan.study.oop;

/**
 * 测试 this： 非静态方法的参数默认会传入this
 * 	在非静态方法中，this总是指向正在调用该方法的对象 
 *	在构造方法中，this总是指向正在初始化的对象
 *	在静态方法中，没有this，这也就解释了为什么静态方法不能调用非静态
 * 
 * @author xuanbo
 * @date 2016年4月3日 上午11:20:30
 * @version 1.0
 */
public class TestThis {

	public static void main(String[] args) {
		Car c = new Car();
		c.printBrand();
	}
}

class Car {
	String brand;
	String price;
	
	public Car() {
		System.out.println("创建对象");
	}

	/**
	 * 在构造方法中，this执行正在创建的对象
	 * @param brand
	 * @param price
	 */
	public Car(String brand, String price){
		//调用无参数的构造方法，这是特殊用法，只能放到第一行
		this();
		this.brand = brand;
		this.price = price;	
	}
	
	/**
	 * 输出'大奔'，说明非静态方法里隐含this
	 */
	public void printBrand() {
		brand = "奔驰";
		this.brand = "大奔";
		System.out.println(brand);
	}

	public void printPrice() {
		System.out.println(price);
	}
}
