package com.xuan.study.array.string;

/**
 * 模拟实现ArrayList
 * 
 * @author xuanbo
 * @date 2016年4月3日 下午11:26:02
 * @version 1.0
 */
public class MyArrayList {

	/**
	 * the value is used for objects storage.
	 */
	private Object[] values;

	/**
	 * the size is the number of objects used.
	 */
	private int size;

	public MyArrayList() {
		// values = new Object[16];
		this(16);
	}

	public MyArrayList(int size) {
		if (size < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		values = new Object[size];
	}

	public void add(Object obj) {
		values[size] = obj;
		size++;
		/**
		 * 扩容
		 */
		if (size > values.length - 1) {
			int capacity = values.length * 2 + 2;
			Object[] newValues = new Object[capacity];
			for (int i = 0; i < values.length; i++) {
				newValues[i] = values[i];
			}
			values = newValues;
		}
	}

	public Object get(int index) {
		/*
		 * 越界
		 */
		if (index < 0 || index > size - 1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return values[index];
	}

	public int size() {
		return size;
	}

	/*
	 * delete方法就不提供了，需要把数组中的数据往前移
	 */

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		list.add("yyq");
		list.add(1314);
		list.add(5.20);
		/*
		 * 从中我们可以看到不管放入的是什么类型，最后取出来都变成了Object类型 因此，jdk引入了泛型的概念
		 */
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		System.out.println(list.size());

		System.out.println(list.get(9));
	}
}
