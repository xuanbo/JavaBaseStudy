package com.xuan.study.testException;

/**
 * 自定义异常，继承Exception，也叫声明异常，调用它的方法必须try catch或throws传递异常
 * 
 * RuntimeException：可以不使用try...catch进行处理，但是如果有异常产生，则异常将由JVM进行处理
 * 对于RuntimeException的子类最好也使用异常处理机制。虽然RuntimeException的异常可以不使用try...catch进行处理，
 * 但是如果一旦发生异常，则肯定会导致程序中断执行，所以，为了保证程序再出错后依然可以执行，在开发代码时最好使用try...catch的异常处理机制进行处理。
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2965850827092026534L;

	public MyException() {

	}

	public MyException(String message) {
		super(message);
	}
}

class TestMyException {

	public static void hello() throws MyException {

	}

	/*
	 * 跟平常的异常没有什么两样
	 */
	public static void main(String[] args) {
		try {
			hello();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}