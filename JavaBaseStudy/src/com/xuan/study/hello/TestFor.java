package com.xuan.study.hello;

/**
 * 测试for循环语句
 * 
 * @author xuanbo
 * @date 2016年4月2日 下午4:52:38
 * @version 1.0
 */
public class TestFor {
	public static void main(String[] args) {

		/*
		 * for循环进行迭代
		 */
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}

		/*
		 * 100以内偶数和
		 */
		int sum = 0;
		for (int i = 0; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);

		/*
		 * 1000以内能被5整除的数，每行输出3个
		 */
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 5 == 0) {
				count++;
				System.out.print(i + "\t");
				if (count == 3) {
					System.out.println();
					count = 0;
				}
			}
		}
		System.out.println();
		/*
		 * 优化：15的倍数换行
		 */
		for (int i = 1; i <= 1000; i++) {
			if (i % 5 == 0) {
				System.out.print(i + "\t");
				if (i % 15 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();

		/*
		 * 九九乘法表
		 */
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
