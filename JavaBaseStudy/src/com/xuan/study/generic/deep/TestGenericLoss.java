package com.xuan.study.generic.deep;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型擦除： 类似于Object
 * 1）继承父类或者实现接口时没有指定具体的类型，一律按Object擦除 
 * 2）使用的时候，没有指定具体的类型，一律按Object擦除
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class TestGenericLoss {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		/*
		 * 使用的时候没有指定具体的类型，按Object擦除
		 */
		List list = new ArrayList();
		list.add("s");
		System.out.println(list.get(0));
		
		/*
		 * 继承泛型父类或实现泛型接口时没有指定具体类型或保留泛型，按Object擦除
		 */
		
		/*
		 * 泛型类的泛型类型继承问题
		 * Integer是Object的子类，但是List<Ineger>不是List<Object>的子类
		 */
		hello(list);// 一旦不适用泛型，编译不会类型检查
		List<Integer> list2 = new ArrayList<>();
		/*hello(list2);使用了泛型，编译就会类型检查*/
		list2.add(2);// 自动装箱
	}
	
	public static void hello(List<Object> list) {
		
	}
}
