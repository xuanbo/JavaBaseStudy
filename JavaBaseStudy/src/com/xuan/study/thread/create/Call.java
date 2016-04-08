package com.xuan.study.thread.create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 实现线程的方式三：实现Callable接口(可以有返回值，可以抛出异常)
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class Call {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// 创建线程
		ExecutorService service = Executors.newFixedThreadPool(2);
	    Race rabbit = new Race("兔子",1000);
	    Race tortoise = new Race("乌龟",500);
		// 获取值
		Future<Integer> result1 = service.submit(rabbit);
		Future<Integer> result2 = service.submit(tortoise);
		
		Thread.sleep(2000);
		rabbit.setFlag(false);
		tortoise.setFlag(false);
		
		int num1 = result1.get();
		int num2 = result2.get();
		System.out.println("兔子跑了" + num1);
		System.out.println("乌龟跑了" + num2);
		// 停止服务
		service.shutdown();
	}
}


class Race implements Callable<Integer>{

	private String name;//名字
	private long time;//延时时间
	private int distance;//跑的步数
	private boolean flag = true;//标志
	
	public Race(String name, long time) {
		super();
		this.name = name;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}



	public int getDistance() {
		return distance;
	}



	public void setDistance(int distance) {
		this.distance = distance;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}


	/*
	 * 有返回值，能抛出异常
	 */
	@SuppressWarnings("static-access")
	@Override
	public Integer call() throws Exception {
		while (flag){
			distance ++;
			Thread.currentThread().sleep(time);
		}
		return distance;
	}
	
}
