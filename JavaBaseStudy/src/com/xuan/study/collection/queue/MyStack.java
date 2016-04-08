package com.xuan.study.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 模拟Stack:使用Deque
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class MyStack<E> {

	private Deque<E> container = new ArrayDeque<E>();

	private int size;

	public MyStack(int size) {
		super();
		this.size = size;
	}

	/*
	 * 进栈
	 */
	public boolean push(E e) {
		if (container.size() + 1 > size) {
			return false;
		}
		container.offerLast(e);
		return true;
	}

	/*
	 * 出栈，删除最后一个 poll()，删除 peek()，不会删除
	 */
	public E pop() {
		return container.pollLast();
	}

	/*
	 * 获取最后一个，不会删除
	 */
	public E peek() {
		return container.peekLast();
	}

	/*
	 * 大小
	 */
	public int size() {
		return container.size();
	}
}

class App {
	public static void main(String[] args) {
		MyStack<String> history = new MyStack<>(3);
		history.push("百度");
		history.push("谷歌");
		history.push("bing");

		history.push("hao123");
		System.out.println(history.size());

		String item = null;
		while (null != (item = history.pop())) {
			System.out.println(item);
		}
	}
}
