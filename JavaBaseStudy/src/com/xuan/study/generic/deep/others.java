package com.xuan.study.generic.deep;

import java.util.ArrayList;
import java.util.List;

/**
 * jdk1.7泛型的简化
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class others {

	public static void main(String[] args) {
		
		/*
		 * jdk1.7之后创建对象的泛型类型不写就跟申明的类型一样了
		 */
		List<String> list = new ArrayList<>();
		list.add("111");
		System.out.println(list.get(0));
	}
}
