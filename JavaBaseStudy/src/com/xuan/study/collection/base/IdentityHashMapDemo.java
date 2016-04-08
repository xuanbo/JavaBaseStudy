package com.xuan.study.collection.base;

import java.util.IdentityHashMap;

/**
 * IdentityHashMap：key的地址不允许重复
 * HashMap的key是根据equals和hashcode比较的
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class IdentityHashMapDemo {

	public static void main(String[] args) {
		IdentityHashMap<String, String> map = new IdentityHashMap<>();
		/*
		 * key地址相同, 则覆盖
		 */
		map.put("a", "a");
		map.put("a", "b");
		System.out.println(map.size());
		/*
		 * 匿名string的引用地址都是a
		 * 但它们的地址不同
		 */
		map.put(new String("a"), "c");
		map.put(new String("a"), "d");
		System.out.println(map.size());
	}
}
