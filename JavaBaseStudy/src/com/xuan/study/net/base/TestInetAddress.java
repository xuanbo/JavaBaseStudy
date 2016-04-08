package com.xuan.study.net.base;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress:并没有区分端口
 * 
 * @author xuanbo
 * @date 2016年4月7日
 * @version 1.0
 */
public class TestInetAddress {

	public static void main(String[] args) throws UnknownHostException {
		// 获取本机InetAddress对象
		InetAddress address = InetAddress.getLocalHost();
		// 输出计算机名 xuan
		System.out.println(address.getHostName());
		// 输出计算机地址 100.64.157.7
		System.out.println(address.getHostAddress());

		// 根据域名得到InetAddress对象
		address = InetAddress.getByName("www.hao123.com");
		// 输出www.hao123.com的域名 www.hao123.com
		System.out.println(address.getHostName());
		// 输出www.hao123.com的地址 61.135.162.10
		System.out.println(address.getHostAddress());

		// 根据ip得到InetAddress对象，地址不存在抛异常
		address = InetAddress.getByName("61.135.162.10");
		// 输出www.hao123.com的地址 61.135.162.10
		System.out.println(address.getHostName());
		// 输出www.hao123.com的地址 61.135.162.10，如果dns解析才会返回域名
		System.out.println(address.getHostAddress());
	}
}
