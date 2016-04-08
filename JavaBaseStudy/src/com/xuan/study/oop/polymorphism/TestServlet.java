package com.xuan.study.oop.polymorphism;

public class TestServlet {

	public static void main(String[] args){
		HttpServlet servlet = new MyHttpServlet();
		/*
		 * 子类没有重写service()，调用的是父类的service()
		 * 但父类中service()调用的是谁的doGet()呢？
		 * 
		 * service()中调用doGet()默认是this.doGet(),this执行调用方法的对象，
		 * 即servlet，这样就知道是调用子类中的doGet()
		 * 
		 * 记住：非静态方法中默认传入this和super，调用方法时，可以省略不写。
		 */
		servlet.service();
	}
}
