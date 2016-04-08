package com.xuan.study.thread.synchronize;

/**
 * 生产者消费者 一般加一个标志
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class ProductCustom {
	public static void main(String[] args) {
		Factory factory = new Factory();
		new Thread(new Product(factory), "生产者1").start();
		new Thread(new Product(factory), "生产者2").start();
		new Thread(new Custom(factory), "消费者1").start();
		new Thread(new Custom(factory), "消费者2").start();
	}
}

class Factory {

	// flag为true生产者生产
	private boolean flag;

	// 生产方法
	public synchronized void product() {
		if (flag) {
			System.out.println(Thread.currentThread().getName() + "生产...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			flag = !flag;
			notifyAll();
			return;
		}
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// 消费方法
	public synchronized void custom() {
		if (!flag) {
			System.out.println(Thread.currentThread().getName() + "消费...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			flag = !flag;
			notifyAll();
			return;
		}
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

/**
 * 生产者
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
class Product implements Runnable {

	private Factory factory;

	public Product(Factory factory) {
		super();
		this.factory = factory;
	}

	@Override
	public void run() {
		while (true) {
			factory.product();
		}

	}

}

/**
 * 消费者
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
class Custom implements Runnable {

	private Factory factory;

	public Custom(Factory factory) {
		super();
		this.factory = factory;
	}

	@Override
	public void run() {
		while (true) {
			factory.custom();
		}
	}

}
