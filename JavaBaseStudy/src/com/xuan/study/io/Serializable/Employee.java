package com.xuan.study.io.Serializable;

import java.io.Serializable;

/**
 * 对象可序列化，实现Serializable接口
 * transient修饰的属性，不序列化
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2899743149234035335L;
	
	private String name;
	private transient int age;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
