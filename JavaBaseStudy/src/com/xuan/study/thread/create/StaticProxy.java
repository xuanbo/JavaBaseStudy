package com.xuan.study.thread.create;

/**
 * 静态代理 设计模式 
 * 共同的接口 代理类持有真实角色的引用
 * 
 * @author xuanbo
 * @date 2016年4月6日
 * @version 1.0
 */
public class StaticProxy {

	public static void main(String[] args) {
		// 使用多态
		Marry you = new You();
		Marry mc = new MarryCompany(you);
		// 实际上调用的是you的marry()方法
		mc.marry();
	}
}

interface Marry {
	void marry();
}

class You implements Marry {

	@Override
	public void marry() {
		System.out.println("marry with yyq...");
	}

}

// 代理对象，持有目标对象的引用
class MarryCompany implements Marry {

	private Marry you;

	public MarryCompany(Marry you) {
		super();
		this.you = you;
	}

	private void befor() {
		System.out.println("start..");
	}

	private void after() {
		System.out.println("end..");
	}

	@Override
	public void marry() {
		befor();
		you.marry();
		after();
	}

}