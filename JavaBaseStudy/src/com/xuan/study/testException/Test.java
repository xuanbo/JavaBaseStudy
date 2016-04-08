package com.xuan.study.testException;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 方法重写时，不能超过父类声明异常的范围
 * 父类方法没有抛出异常，子类重写时也不能抛出范围
 * 出现问题编译通不过
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class Test {

}

class A {
	public void hello() throws IOException {

	}
}

class B extends A {
	public void hello() throws FileNotFoundException {

	}
}

class C extends A {
	public void hello() {

	}
}

/*
 * 超了父类的范围
 * 
 * class D extends A { public void hello() throws Exception {
 * 
 * } }
 */

class E extends A {
	public void hello() throws IOException, FileNotFoundException {

	}
}

class F extends A {
	public void hello() throws IOException, ArithmeticException {

	}
}

/*
 * class G extends A { public void hello() throws IOException, ParseException {
 * 
 * } }
 */
