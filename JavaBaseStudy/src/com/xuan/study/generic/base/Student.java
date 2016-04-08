package com.xuan.study.generic.base;

/**
 * <> --> 泛型，一般用大写字母代表泛型类，T、E、K、V
 * 后面可以跟多个
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class Student<T> {

	/*
	 * 泛型不能使用在静态属性上
	 */
	private T id;

	public Student() {

	}

	public Student(T id) {
		super();
		this.id = id;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}
}
