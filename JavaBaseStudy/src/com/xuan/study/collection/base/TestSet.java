package com.xuan.study.collection.base;

import java.util.HashSet;
import java.util.Set;

/**
 * Set接口:底层是用hashMap实现的
 * 看源码我们知道，Set是把HashMap的key作为自己存放对象的值，value始终是同一个对象
 * hashSet,add元素才会进行排序
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class TestSet {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		/*
		 * 注意Set的add方法返回值是boolean
		 * 而list的add方法没有返回值
		 */
		Set set = new HashSet();
		/*
		 * 可以发现Set不允许重复，是根据equals方法判断的
		 * 而且Set不能直接取到某一个元素，只能拿来遍历
		 */
		set.add(123);
		set.add(123);
		
		/*
		 * 虽然两个对象的地址值不同，但是Set是根据equals来判断你的
		 * String的equals方法是根据值比较的
		 */
		set.add("123");
		set.add(new String("123"));
		
		for (Object object : set) {
			System.out.println(object);
		}
	}
}
