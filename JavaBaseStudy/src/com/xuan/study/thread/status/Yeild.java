package com.xuan.study.thread.status;

/**
 * 暂时放弃cup，人品好的话，有可以调度到自己
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class Yeild extends Thread {

	public static void main(String[] args) {
		Yeild y = new Yeild();
		y.start();

		for (int i = 0; i < 1000; i++) {
			if (i % 10 == 0) {
			    // 谁调用，谁放弃
				yield();
			}
			System.out.println("main...." + i);
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("yeild...." + i);
		}
	}
}
