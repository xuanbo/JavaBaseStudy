package com.xuan.study.generic.base;

import java.util.List;

/**
 * 泛型方法 可以不再泛型类中
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class GenericMethod {
	
	/*
	 * 泛型方法，可以是静态方法
	 * 在方法的返回值前面加<字母>，使用的时候，直接在方法的形参类型中使用
	 */
	public static <T> void hello(T t){
		System.out.println(t);
	}
	
	/*
	 * 要求只能是List的实现类或List
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T extends List> void hello(T t){
		t.add("yyq");
	}
	
	public static void main(String[] args) {
		hello("yyq");
	}
}
