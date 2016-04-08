package com.xuan.study.collection.base;

import java.util.WeakHashMap;

/**
 * WeakHashMap的key弱类型
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class WeakHashMapDemo {

	public static void main(String[] args) {
		WeakHashMap<String, String> map = new WeakHashMap<>();
		// 常量池对象不会被回收
		map.put("a", "a");
		map.put("b", "b");
		// gc运行被回收
		map.put(new String("c"), "c");
		map.put(new String("d"), new String("d"));
		// 通知回收
		System.gc();
		System.runFinalization();
		System.out.println(map.size());
	}
}
