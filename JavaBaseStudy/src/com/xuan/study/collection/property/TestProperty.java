package com.xuan.study.collection.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties:Hashtable的子类
 * 用于加载配置文件
 * 只能存储字符串，因此key-value均为String
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class TestProperty {

	public static void main(String[] args) {
		Properties pro = new Properties();
		pro.setProperty("driver", "com.mysql.jdbc.Driver");
		pro.setProperty("url", "jdbc:localhost:3030/test");
		pro.setProperty("user", "root");
		pro.setProperty("password", "123456");
		
		/*
		 * 不存在使用"test"
		 */
		String url = pro.getProperty("url", "test");
		System.out.println(url);
		
		/*
		 * 写入到文件,默认以.properties后缀名
		 */
		try {
			//pro.store(new FileOutputStream(new File("d:/test.properties")), "hello");
			//pro.storeToXML(new FileOutputStream(new File("d:/test.xml")), "hello");
			
			/*
			 * 相对路径，工程下
			 */
			pro.store(new FileOutputStream(new File("db.properties")), "hello");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		/*
		 * 读取配置文件
		*/
		try {
			pro.load(new FileInputStream(new File("db.properties")));
			System.out.println(pro.getProperty("url"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		/*
		 * 相对类的路径
		 * "/"代表根目录，不加代表本目录
		 */
		Properties properties = new Properties();
		try {
			properties.load(TestProperty.class.getResourceAsStream("/"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * 线程来获取
		 * 不加"/"代表根目录
		 */
		Properties properties1 = new Properties();
		try {
			properties1.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(""));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
