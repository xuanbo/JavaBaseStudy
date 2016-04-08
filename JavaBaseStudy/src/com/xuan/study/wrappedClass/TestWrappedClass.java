package com.xuan.study.wrappedClass;

/**
 * 包装类：有时候需要把基本数据类型当做一个对象来处理 
 * 基本数据类型 	包装类 
 * byte 		Byte 
 * short		Short 
 * int 			Integer 
 * long			Long 
 * float 		Float 
 * double 		Double 
 * boolean 		Boolean 
 * char 		Character
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class TestWrappedClass {

	public static void main(String[] args) {
		Integer i = new Integer(200);
		System.out.println(i);
		//	System.out.println(i.MAX_VALUE);
		//	转为16进制
		System.out.println(Integer.toHexString(i));
		
		//	将字符创数字转化为10进制的整数
		Integer ii = Integer.parseInt("123");
		Integer iii = new Integer("1234");
		System.out.println(ii);
		System.out.println(iii);
		
		//	将Integer转为int
		int a = iii.intValue();
		System.out.println(a);
	}
}
