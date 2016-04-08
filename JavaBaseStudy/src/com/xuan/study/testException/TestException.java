package com.xuan.study.testException;

/**
 * 测试异常：CheckedException RuntimeException 
 * 把异常抛出去之后，自己不处理，谁调用谁处理，告诉调用者该方法都用什么问题
 * 
 * 不要把错误当异常处理，比如抛出什么密码错误异常，用户名不符合条件异常啊，这些都是逻辑部分，用if条件判断就行了
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class TestException {

	public static void main(String[] args) {
		/*
		 * 运行时会抛出异常 空指针怎么办？前面判断下是否为空，再调用。 类型转化错误怎么办？instance判断下，再转。
		 */
		int a = 2 / 0;
		System.out.println(a);

		/*
		 * 编译的时候编译器会检查异常
		 */
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
