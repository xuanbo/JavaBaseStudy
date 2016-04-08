package com.xuan.study.generic.base;

/**
 * 泛型的使用
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class TestStudent {
	public static void main(String[] args) {
		/*
		 * 在声明的时候指定具体类型，不能是基本类型
		 */
		Student<Integer> student = new Student<>();
		student.setId(1);
		System.out.println(student.getId());
	}
}
