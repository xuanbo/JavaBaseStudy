package com.xuan.study.guava;

import java.util.List;

import com.google.common.collect.ImmutableList;

/**
 * 只读List
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class Simple {

	public static void main(String[] args) {
		/*
		 * 只读List，jdk的Collections工具提供的unmodifyList()返回一个新的List，这个新的不能进行修改
		 * 但是原来的list可以进行修改，不安全
		 */
		List<String> list = ImmutableList.of("a", "b", "c");
		// 运行报错
		list.add("d");
	}
}
