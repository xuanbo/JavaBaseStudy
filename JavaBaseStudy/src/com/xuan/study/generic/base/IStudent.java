package com.xuan.study.generic.base;

/**
 * 泛型接口
 * 后面可以跟多个泛型参数
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public interface IStudent<T> {

	int MAX_VALUE = 1024;;

	// 这也说明了泛型不能修饰静态属性；接口中的常量默认是public static final
	/* T MAX_VALUE = 1024; */

	T get();

	void update(T t);
}
