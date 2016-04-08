package com.xuan.study.oop.callback;

/**
 * 利用了运行时的多态实现回调
 * 相当于模板模式，传递什么对象，执行同一个套路
 * 
 * @author xuanbo
 * @date 2016年4月3日 下午6:10:27
 * @version 1.0
 */
public class CallBackTest {

	public static void printFrame(MyFrame f) {
		System.out.println("步骤1");
		System.out.println("步骤2");

		// 画窗口，在这里并不知道画什么窗口
		f.printFrame();

		System.out.println("步骤3");
		System.out.println("步骤4");
	}

	public static void main(String[] args) {
		printFrame(new Frame1());
		printFrame(new Frame2());
	}
}

/*
 * 最好换成接口或抽象类
 */
class MyFrame {
	public void printFrame() {
		System.out.println("画一个窗口");
	}
}

class Frame1 extends MyFrame {
	public void printFrame() {
		System.out.println("画一个窗口1");
	}
}

class Frame2 extends MyFrame {
	public void printFrame() {
		System.out.println("画一个窗口2");
	}
}
