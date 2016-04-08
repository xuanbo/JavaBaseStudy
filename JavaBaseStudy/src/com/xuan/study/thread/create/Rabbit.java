package com.xuan.study.thread.create;

/**
 * 创建线程 方式一：继承Thread，重写run()，相当于线程体
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class Rabbit extends Thread {

	public Rabbit() {
		super();
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("兔子跑了" + i + "步");
		}
	}

}

class Tortoise extends Thread {

	public Tortoise() {
		super();
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("乌龟跑了" + i + "步");
		}
	}

}
