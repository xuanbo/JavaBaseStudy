package com.xuan.study.collection.synchronize;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 只读设置
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class OnlyRead {
	
	public static Set<String> hello(Set<String> set) {
		/*
		 * 返回一个空的Set，防止空指针异常
		 */
		if (null == set) {
			return Collections.emptySet();
		}
		return set;
	}

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("a", "a");
		map.put("b", "b");
		/*
		 * 不能修改的容器
		 */
		Map<String, String> unmodifiableMap = Collections.unmodifiableMap(map);
		// 异常
		unmodifiableMap.put("c", "c");

		/*
		 * 一个元素的容器
		 */
		List<String> list = Collections.singletonList(new String());
		// 异常
		list.add("yyq");
	}
}
