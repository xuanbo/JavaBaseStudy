package com.xuan.study.collection.synchronize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections工具类提供的同步方法
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class Simple {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		/*
		 * 使list变为同步的
		 */
		List<Integer> synList = Collections.synchronizedList(list);
		System.out.println(synList.size());
	}
}
