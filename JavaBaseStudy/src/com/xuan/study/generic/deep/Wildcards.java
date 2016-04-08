package com.xuan.study.generic.deep;

import java.util.ArrayList;
import java.util.List;

/**
 * 通配符：? 表示类型不确定，用于声明的变量（或形参）上 不能用于：创建对象；创建泛型类、泛型接口、泛型方法上
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class Wildcards {

	// ?用于形参
	public static void hello(List<?> list) {

	}

	public static void main(String[] args) {
		// ?用于声明（右边创建对象）,类型不确定，可以接收多种类型
		List<?> list = new ArrayList<Integer>();
		list = new ArrayList<String>();
		/*
		 * 编译错误，为什么？想想多态的知识就明白了。
		 * list.add("sss");
		 */
		list = new ArrayList<Object>();
		hello(list);
		hello(new ArrayList<Character>());

		/*
		 * 不能用于创建对象上，这样就不知道对象的具体类型了 list = new ArrayList<?>();编译错误
		 */

		/*
		 * 不能用于泛型类、泛型接口、泛型方法上 class Test<?> {
		 * 
		 * }
		 */
	}
}
