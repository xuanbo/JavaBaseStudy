package com.xuan.study.testDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class VisualCalendar {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("请输入时间（例如：2016-04-04）");
		Scanner in = new Scanner(System.in);
		String temp = in.nextLine();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = df.parse(temp);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			int dayOfMouth = calendar.get(Calendar.DAY_OF_MONTH);
			// 将日期设置为该月的1号
			calendar.set(Calendar.DATE, 1);
			// 获取1号是这周的哪一天
			int startDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			// 获取这个月的天数,Calendar.DAY_OF_MONTH 跟 Calendar.DATE 一样
			int maxDayOfMouth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

			System.out.println("日\t一\t二\t三\t四\t五\t六");
			// 前面补"\t"
			for (int i = 1; i < startDayOfWeek; i++) {
				System.out.print("\t");
			}
			for (int i = 1; i <= maxDayOfMouth; i++) {
				if (i == dayOfMouth) {
					System.out.print("*");
				}
				System.out.print(i + "\t");
				// 遇到周六换行
				if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
					System.out.println();
				}
				// 循环一次加一天
				calendar.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
