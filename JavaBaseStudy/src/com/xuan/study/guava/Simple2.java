package com.xuan.study.guava;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * 函数式编程 Predicate Function
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class Simple2 {

	public static void hello() {
		// 初始化一个List<String>
		List<String> list = Lists.newArrayList("moom", "son", "dad", "moon");
		// 找出回文
		Collection<String> palindromeList = Collections2.filter(list, new Predicate<String>() {

			@Override
			public boolean apply(String input) {
				/*
				 * 反转等于自身则是回文
				 */
				return new StringBuilder(input).reverse().toString().equals(input);
			}
		});

		for (String temp : palindromeList) {
			System.out.println(temp);
		}
	}

	public static void world() {
		Set<Long> timeSet = Sets.newHashSet();
		timeSet.add(111234536735L);
		timeSet.add(997945235346L);
		timeSet.add(465766565577L);

		Collection<String> time = Collections2.transform(timeSet, new Function<Long, String>() {

			@Override
			public String apply(Long input) {

				return new SimpleDateFormat("yyyy-MM-dd").format(input);
			}

		});

		for (String temp : time) {
			System.out.println(temp);
		}
	}

	public static void main(String[] args) {
		hello();
		world();
	}
}
