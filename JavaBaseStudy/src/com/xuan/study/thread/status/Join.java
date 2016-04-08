package com.xuan.study.thread.status;

/**
 * 等待join的线程执行完才调用自己的线程方法
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class Join extends Thread{

	public static void main(String[] args) throws InterruptedException {
		Join j = new Join();
		j.start();
		
		for (int i = 0; i < 1000; i++) {
			if (i == 100) {
				// 等待调用join的线程执行完才执行自己的
				j.join();
			}
			System.out.println("main..." + i);
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("join...." + i);
		}
	}
	
	
}
