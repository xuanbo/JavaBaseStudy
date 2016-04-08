package com.xuan.study.refence;

import java.lang.ref.WeakReference;

/**
 * 引用的分类:强、弱、软、虚
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class Simple {

	public static void main(String[] args) {
		// str引用常量池中yyq的地址
		String str = new String("yyq");
		// 弱引用管理对象
		WeakReference<String> wr = new WeakReference<>(str);
		System.out.println("gc运行前：" + wr.get());
		// 断开引用
		str = null;
		// 通知回收
		System.gc();
		System.runFinalization();
		// 对象被回收
		System.out.println("gc运行后：" + wr.get());
	}

	public static void hello() {
		// 存放在字符串常量池中，共享，不能回收
		String str = "yyq";
		// 弱引用管理对象
		WeakReference<String> wr = new WeakReference<>(str);
		System.out.println("gc运行前：" + wr.get());
		// 断开引用
		str = null;
		// 通知回收
		System.gc();
		System.runFinalization();
		System.out.println("gc运行后：" + wr.get());
	}
}
