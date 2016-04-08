package com.xuan.study.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 测试队列，先进先出
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class TestQueue {

	public static void main(String[] args) {
		/**
		 * 模拟银行排队
		 */
		Queue<Request> que = new ArrayDeque<>();
		for (int i = 0; i < 10; i++) {
			/*
			 * 匿名内部类只能访问final修饰的变量
			 */
			final int number = i+1;
			que.offer(new Request() {
				
				@Override
				public void diposit() {
					System.out.println("第" + number + "个人办理业务");
				}

			});
		}

		dealWith(que);
	}
	
	public static void dealWith(Queue<Request> que){
		Request req = null;
		/*
		 * poll():Retrieves and removes the head of this queue, or returns null if this queue is empty.
		 */
		while(null != (req = que.poll())){
			req.diposit();
		}
	}
}

interface Request {
	// 存款
	void diposit();
}
