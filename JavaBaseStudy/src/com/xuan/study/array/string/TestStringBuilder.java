package com.xuan.study.array.string;

/**
 * 测试StringBuilder：字符串可变，线程不安全，效率高 
 * StringBuffer线程安全，效率低
 * 
 * @author xuanbo
 * @date 2016年4月3日 下午10:28:57
 * @version 1.0
 */
public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		
		/*
		 * 看下源码
		 */
		
		/*
		 * 通过源码发现，append方法返回this（相当于一个方法链），容量不够时，扩容（2倍加2），然后用新数组替换旧数组（旧数组的数据复制进去），把新数组的地址传给引用变量
		 * 跟String相比的话，节省了空间也节省了时间
		 * 跟StringBuffer相比，速度更快，只是不是线程安全。
		 */
		sb.append("world").append("王漩波");
		System.out.println(sb);
		
		/*
		 * 一些常用方法
		 */
		StringBuilder sbd = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		sbd.delete(0, 2);
		System.out.println(sbd);
	}
}
