package com.xuan.study.oop.encapsulation;

/**
 * private:本类可以访问. 
 * default:本类可以访问，这个包可以访问. 
 * protect:本类可以访问，这个包可以访问，子类可以访问(哪怕不是一个包的子类).
 * public:公开.
 * 
 * 封装的一些原则：
 * 属性一般私有，提供公开的get和set（注意boolean的get方法开头是'is'）
 * 静态或常量一般设置为public
 * 
 * @author xuanbo
 * @date 2016年4月3日 下午2:32:56
 * @version 1.0
 */
public class User {

	public String name;
	protected String studentNumber;
	String classroom;
	@SuppressWarnings("unused")
	private String password;
	
}
