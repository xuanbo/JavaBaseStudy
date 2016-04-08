package com.xuan.study.oop.polymorphism;

public class TestPolymorphism {

	public static void animalPlay(Animal animal) {
		animal.play();
	}

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.name = "animal";
		Animal cat = new Cat();
		/*
		 * 编译的时候，只看父类有没有该方法，有则通过编译
		 * 运行的时候，看子类有没有重写该方法，重写了就调用子类的，否则找父类的
		 * 这也说明了非静态方法中默认传入了this和super
		 */
		animalPlay(dog);
		animalPlay(cat);
		/*
		 * 输出animal，而不是dog，为什么？
		 */
		System.out.println(dog.name);
	}
}
