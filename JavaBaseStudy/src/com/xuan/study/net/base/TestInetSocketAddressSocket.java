package com.xuan.study.net.base;

import java.net.InetSocketAddress;

/**
 * InetAddress + 端口
 * 
 * @author xuanbo
 * @date 2016年4月7日
 * @version 1.0
 */
public class TestInetSocketAddressSocket {
	public static void main(String[] args) {
		InetSocketAddress address = new InetSocketAddress("localhost", 9999);
		
		// 如果输入ip地址，dns不解析则输出ip
		System.out.println(address.getHostName());
		// 返回InetAddress对象
		System.out.println(address.getAddress());
		System.out.println(address.getPort());
	}
}
