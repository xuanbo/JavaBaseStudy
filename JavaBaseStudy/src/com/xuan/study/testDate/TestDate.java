package com.xuan.study.testDate;

import java.util.Date;

/**
 * 测试Date date也是数字，从1970年1月1日0点为原点，每一毫秒为刻度，类型为Long
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class TestDate {
	public static void main(String[] args) {
		/*
		 * 可以看到Date类中很多方法都被废弃掉了，以后时间的计算用Calendar，时间和字符的转换用DateFormat
		 * Date类中注意比较时间的大小：befor，after，equals方法
		 */
		// 看源码发现调用一个传入long型（获取当前时间，转为long）的构造器初始化时间
		Date d = new Date();
		System.out.println(d);
		
		/*
		 * 比较时间用Date类，本质上是用long型的数字比较
		 */
		Date a = new Date();
		Date b = new Date();
		System.out.println(a.compareTo(b));
		System.out.println(a.after(b));
		System.out.println(a.getTime() < b.getTime());
	}
}
