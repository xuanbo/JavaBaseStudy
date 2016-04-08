package com.xuan.study.testDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间和字符串的转换
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class TestDateFormat {
	public static void main(String[] args) {
		/*
		 * DateFormat是一个抽象类，只能实例化它的子类SimpleDateFormat（唯一子类）
		 * 格式化时间字符串：yyyy年MM月dd日 hh:mm:ss 或 yyyy-MM-dd hh:mm:ss
		 * 具体的一些表示方法可以看api文档
		 */ 
		DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
		Date d = new Date();
		// formate 将时间转为字符串，parse将字符串转为时间（格式化字符串必须对应时间字符串）
		System.out.println(df.format(d));
		
		/*
		 * 字符串转为时间对象
		 */
		String birthday = "1995-04-09";
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			 date = df2.parse(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(date);
	}
}
