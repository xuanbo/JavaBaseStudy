package com.xuan.study.collection.base;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 迭代器Iterator遍历容器
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class TestIterator {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args){
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		/*
		 * 只适合List，Set没有index
		 */
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Set set = new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		/*
		 * 通过迭代器遍历
		 */
		Iterator it = set.iterator();
		/*
		 * 删除第一个元素
		 * 只能删掉刚遍历的那个元素
		 */
		it.next();
		it.remove();
		/*
		 * 使用迭代器可以在遍历时删掉元素
		 */
		while (it.hasNext()) {
			/*
			 * 可以认为有个游标在元素中间，只有执行完next后，才能删掉这个元素
			 * 比如，删掉第二个元素，要两次next后执行remove
			 */
			System.out.println(it.next());
		}
		/*
		 * 使用迭代器删掉第一个元素后，Set集合中的那个元素也没了
		 */
		for (Object object : set) {
			System.out.print(object + "\t");
		}
	}
}
