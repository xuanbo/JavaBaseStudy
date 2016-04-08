package com.xuan.study.collection.base;

import java.util.EnumMap;

/**
 * EnumMap:要求key为枚举
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class EnumMapDemo {

	public static void main(String[] args) {
		EnumMap<Role,String> map = new EnumMap<>(Role.class);
		map.put(Role.USER, "user");
		map.put(Role.ADMIN, "admin");
		System.out.println(map.size());
	}
}

enum Role{
	USER,ADMIN
}