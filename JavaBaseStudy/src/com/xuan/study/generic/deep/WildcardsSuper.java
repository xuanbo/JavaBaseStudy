package com.xuan.study.generic.deep;

import java.util.ArrayList;
import java.util.List;

/**
 * 通配符的下限 super
 * 能够添加数据，但是只能是它自己或者子类型
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class WildcardsSuper {
	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<>();
		hello(list);
		List<Apple> list2 = new ArrayList<>();
		hello(list2);
		/*
		 * 编译错误，因为RedApple不是Apple类或父类
		 * List<RedApple> list3 = new ArrayList<>();
		 * hello(list3);
		 */
		
		List<? super Apple> list3 = new ArrayList<Apple>();
		hello(list3);
		List<? super Apple> list4 = new ArrayList<Fruit>();
		hello(list4);
		List<? super Fruit> list5 = new ArrayList<Fruit>();
		hello(list5);
		List<? super Fruit> list6 = new ArrayList<Object>();
		hello(list6);
		/*
		 * 编译错误，因为? super RedApple 比 ? super Apple的范围大
		 * List<? super RedApple> list7 = new ArrayList<Apple>(); 
		 * hello(list7);
		 */
		/*
		 * 编译错误，因为pear不属于? super RedApple
		 * List<? super RedApple> list7 = new ArrayList<Pear>(); 
		 * hello(list7);
		 */
	}
	
	/*
	 * >= Apple;是Apple类或父类
	 */
	public static void hello(List<? super Apple> list){
		/**
		 * 这里可以添加Apple类或Apple子类
		 * 因为编译器虽然不知道？是什么类型，但是知道？绝对是Apple类或者Apple类的父类
		 * 所以就可以添加Apple类或Apple子类
		 */
		list.add(new Apple());
		list.add(new RedApple());
		/* 
		 * 编译错误
		 * list.add(new Fruit()); 
		 */
	}
}
