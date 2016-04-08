package com.xuan.study.testDate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日历类 注意：一月是0，周日是1
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class TestCalendar {

	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		/*
		 * 3代表四月。。
		 * 
		 * c.set(1995, 3, 9);
		 * 注意set(int filed, int)filed分别为每一个日历属性设置值
		 */
		c.set(Calendar.YEAR, 1995);
		c.set(Calendar.MONTH, Calendar.APRIL);
		c.set(Calendar.DAY_OF_MONTH, 9);
		Date d = c.getTime();
		System.out.println(d);
		System.out.println(c.get(Calendar.YEAR));
		
		/*
		 * 日期计算,负数代表减
		 */
		c.add(Calendar.YEAR, 24);
		System.out.println(c.getTime());
	}
}
