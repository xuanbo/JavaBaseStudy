package com.xuan.study.array.mutilate;

/**
 * 测试二维数组
 * 
 * @author xuanbo
 * @date 2016年4月4日 上午12:18:39
 * @version 1.0
 */
public class TestMutilateArray {

	public static void main(String[] args) {
		/*
		 * 二维数组并一定是矩阵 二维数组每一行相当于一个一维数组
		 */
		// 静态初始化
		int[][] a = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };
		System.out.println(a.length);

		/*
		 * 只需要指定二维中一维的长度就行了
		 */
		int[][] b = new int[4][];
		b[0] = new int[3];
		b[1] = new int[4];
		b[2] = new int[5];
		b[3] = new int[6];
		// 创建了一个新的长度为7的int型数组，然后将地址赋给b[4]
		b[3] = new int[7];
		System.out.println(b[3].length);
		
		// int[][] c = new int[][4];非法
		
		/*
		 * 一般二维数组就行了，简单的矩阵练习
		 */
	}
	
	/**
	 * Arrays工具类的使用，排序、打印
	 */
}
