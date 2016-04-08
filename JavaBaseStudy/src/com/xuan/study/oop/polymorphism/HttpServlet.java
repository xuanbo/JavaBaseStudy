package com.xuan.study.oop.polymorphism;

public class HttpServlet {

	public void service() {
		System.out.println("HttpServlet:service");
		doGet();
	}

	public void doGet() {
		System.out.println("HttpServlet:doGet()");
	}
}
