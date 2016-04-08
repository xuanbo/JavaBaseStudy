package com.xuan.study.collection.base;

/**
 * 两个对象通过Equals方法返回true，那么hashcode也应该相等 我们可以依据对象的某些属性来重写这两个方法
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class TestHashCodeAndEquals {

}

/**
 * 根据自己的需求判断两个对象是否equals返回true 
 * 下面我认为两个学生的id相同，那么这两个学生相同
 * 一般重写equals那么hashcode也要重写
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
class Student {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
