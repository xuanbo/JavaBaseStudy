package com.xuan.study.thread.create;

public class RabbitApp {

	public static void main(String[] args) {
		Rabbit r = new Rabbit();
		Tortoise t = new Tortoise();
		// 启动线程
		r.start();
		t.start();
	}
}
