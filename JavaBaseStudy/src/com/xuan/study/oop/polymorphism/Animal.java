package com.xuan.study.oop.polymorphism;

public class Animal {
	
	public String name;
	
	public void play(){
		System.out.println("动物玩耍");
	}
}

class Dog extends Animal{
	
	public String name;
	
	public void play(){
		this.name = "dog";
		System.out.println("汪汪");
	}
}

class Cat extends Animal{
	public void play(){
		System.out.println("喵喵");
	}
}
