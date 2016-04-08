package com.xuan.study.thread.create;

/**
 * 模拟12306
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class Web12306 implements Runnable {

	private int num;
	
	public Web12306(int num) {
		super();
		this.num = num;
	}

	@Override
	public void run() {
		while (true) {
			if (num <= 0) {
				break;
			}
			System.out.println(Thread.currentThread().getName() + "抢票,剩余" + (--num));
		}
	}

}

class Main{
	public static void main(String[] args) {
		/*
		 * 从打印结果中，我们能到有的数字重复，这是因为没有做同步控制
		 */
		Web12306 w = new Web12306(100);
		new Thread(w, "窗口1").start();
		new Thread(w, "窗口2").start();
		new Thread(w, "窗口3").start();
	}
}