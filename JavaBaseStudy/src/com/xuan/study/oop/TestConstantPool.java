package com.xuan.study.oop;

/**
 * 测试常量池
 * 
 * @author xuanbo
 * @date 2016年4月3日 上午10:37:35
 * @version 1.0
 */
public class TestConstantPool {
	public static void main(String[] args) {
		Student s = new Student();
		Teacher t = new Teacher();
		s.name = "王漩波";
		t.name = "王漩波";
		System.out.println(s.name == t.name);
		System.out.println(s.classRoom == t.classRoom);
	}
}

class Student {
	String name;
	String classRoom = "软件zy1301";
}

class Teacher {
	String name;
	String classRoom = "软件zy1301";
}
