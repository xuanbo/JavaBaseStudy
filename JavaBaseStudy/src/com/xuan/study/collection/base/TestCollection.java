package com.xuan.study.collection.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * 看Collection的源码 主要有两个常用的子接口Set和List 
 * List：有序，可重复 
 * Set： 无序，不可重复
 * 可以自己实现ArrayList和LinkedList，跟自己c写的链表类似，只是指针换成了对象的引用
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class TestCollection {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		/*
		 * 底层是用数组实现的
		 * 查询快，数组是查询最快的，因为根据索引查地址，删除，修改和插入慢
		 * 一般情况下用它就够了
		 */
		List list = new ArrayList();
		list.add(1);// 包装类
		list.add(new Date());
		System.out.println(list.size());
		/*
		 * 可以根据index获取到放入的元素，这也说明了是有序的
		 * 取出来都变成了Object，所以引入了泛型
		 */
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		/*
		 * LinkedList：底层使用链表实现的
		 * 插入，修改和删除快，查询慢
		 */
		List list2 = new LinkedList();
		list2.add(1);
		
		/*
		 * Vector底层也是用数组实现的，但是线程安全的，故而效率低
		 */
	}
	
}
