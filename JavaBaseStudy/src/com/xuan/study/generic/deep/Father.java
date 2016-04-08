package com.xuan.study.generic.deep;

/**
 * 泛型父类
 * 子类可以选择按需保留或擦除父类的泛型，当然，也可以自己添加自己的泛型声明
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public abstract class Father<T1, T2> {

	/*
	 * 父类声明的属性类型，在子类中随父类而定
	 */
	T1 age;
	public abstract void hello(T2 name);
}

/*
 * 部分保留泛型,子类要保留父类的全部泛型，不然编译通不过
 * C1也可以添加自己的泛型声明
 * T1, T2位置可以换的
 */
class C1<T1, T2> extends Father<T1, T2> {

	@Override
	public void hello(T2 name) {
		/*this.age --> T1*/
	}

}

/*
 * 部分保留泛型,子类要声明保留的泛型，不然编译通不过
 * C2也可以添加自己的泛型声明
 */
class C2<T2> extends Father<Integer, T2> {

	@Override
	public void hello(T2 name) {
		/*this.age --> Integer*/
	}

}

/*
 * 不保留泛型，指定具体类型
 * C3也可以添加自己的泛型声明
 */
class C3<T> extends Father<Integer, String> {

	/*
	 * 子类中新增的属性类型由自己定
	 */
	T id;
	
	@Override
	public void hello(String name) {
		/*this.age --> Integer*/
	}

}

/*
 * 没有泛型，擦除，相当于T1，T2都为Object
 * C4也可以添加自己的泛型声明
 */
@SuppressWarnings("rawtypes")
class C4 extends Father {

	@Override
	public void hello(Object name) {
		/*this.age --> Object*/
	}

}
