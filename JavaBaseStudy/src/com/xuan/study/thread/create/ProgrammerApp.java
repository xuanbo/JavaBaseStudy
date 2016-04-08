package com.xuan.study.thread.create;

/**
 * 使用Runnable创建线程的好处
 * 1）避免单继承的问题，继承Thread类就不能继承其他类了
 * 2）便于共享资源
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class ProgrammerApp {

	public static void main(String[] args) {
		/*
		 * 相当于静态代理模式
		 * 共同实现了Runnable接口，传入执行的对象
		 */
		Programmer p = new Programmer();
		new Thread(p).start();
	}
}
