package com.xuan.study.collection.base;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Map key-value
 * 可以自己实现Map接口
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class TestMap {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("1", 1);
		map.put("2", new Date());
		/*
		 * key不能相同，相同则覆盖
		 */
		map.put("1", "222");
		/**
		 * 遍历
		 */
		for (Map.Entry<String, Object> entry : map.entrySet()){
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
	}
}
