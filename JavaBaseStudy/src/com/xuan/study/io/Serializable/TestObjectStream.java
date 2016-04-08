package com.xuan.study.io.Serializable;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * 对象序列化
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class TestObjectStream {

	public static void main(String[] args) {
		try {
			writer("d:/obj.txt");
			read("d:/obj.txt");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 反序列化
	 * 
	 * @param srcPath
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void read(String srcPath) throws IOException, ClassNotFoundException {
		File src = new File(srcPath);
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(src)));
		Object obj = ois.readObject();
		if (obj instanceof Employee) {
			Employee em = (Employee) obj;
			/*
			 * age声明为不可序列化，所以其值为默认值，即0
			 */
			System.out.println(em.getName() + " " + em.getAge() + " " + em.getSalary());
		}
		obj = ois.readObject();
		if (obj instanceof int[]) {
			int[] a = (int[]) obj;
			System.out.println(Arrays.toString(a));
		}

		ois.close();
	}

	/**
	 * 将对象序列化
	 * 
	 * @throws IOException
	 */
	public static void writer(String disPath) throws IOException {
		Employee em = new Employee("yyq", 20, 10000);
		int[] a = { 11, 12, 13, 14 };
		File dis = new File(disPath);

		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dis)));

		oos.writeObject(em);
		oos.writeObject(a);
		oos.flush();

		oos.close();
	}
}
