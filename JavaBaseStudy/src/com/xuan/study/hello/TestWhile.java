package com.xuan.study.hello;

/**
 * 测试while语句
 * 其中do while先执行再判断，一半不用
 * @author xuanbo
 * @date 2016年4月2日 下午4:25:42
 * @version 1.0
 */
public class TestWhile {
	public static void main(String[] args) {
		int i = 1;
		/*
		 * 满足条件一直执行
		 */
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
		
		/*
		 * 1加到100
		 */
		i = 0;
		int sum = 0;
		while (i <= 100) {
			sum += i;
			i ++;
		}
		System.out.println(sum);
	}
}
