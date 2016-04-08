package com.xuan.study.thread.create;

/**
 * 创建线程的
 * 第二种方式 ：实现Runnable接口,重写run()
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class Programmer implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}

}
