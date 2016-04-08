package com.xuan.study.generic.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型入门 1.标签，泛化类型 2.作用：省心，安全，只能某种类型的数据
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class Simple {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		/*
		 * 如何安全,编译的时候进行类型检查
		 * 
		 * list.add(1);
		 */
		list.add("sss");
		/*
		 * 取出来还是声明的类型
		 */
		String sss = list.get(0);
		System.out.println(sss);
	}
}
