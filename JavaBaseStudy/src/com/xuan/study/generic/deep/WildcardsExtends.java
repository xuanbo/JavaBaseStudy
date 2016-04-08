package com.xuan.study.generic.deep;

import java.util.ArrayList;
import java.util.List;

/**
 * 通配符的上限，接口也用extends
 * 不能用于添加数据
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class WildcardsExtends {
	public static void main(String[] args) {
		/*
		 * extends 设置上限
		 */
		Test<Fruit> t1 = new Test<>();
		Test<Apple> t2 = new Test<>();
		Test<Pear> t3 = new Test<>();
		Test<RedApple> t4 = new Test<>();
		hello(t1);
		hello(t2);
		hello(t3);
		hello(t4);
		
		List<Fruit> list = new ArrayList<>();
		hello(list);
		List<Apple> list2 = new ArrayList<>();
		hello(list2);
		List<? extends Fruit> list3 = new ArrayList<Apple>();
		hello(list3);
		List<? extends Apple> list4 = new ArrayList<RedApple>();
		hello(list4);
		/*
		 * 编译错误，因为？等同于 ? extends Object, 显然范围比？ extends Fruit大 
		 * List<?> list5 = new
		 * ArrayList<RedApple>(); 
		 * hello(list5);
		 */
	}

	public static void hello(Test<? extends Fruit> test) {

	}

	public static void hello(List<? extends Fruit> list) {
		/*
		 * 为什么都不能添加？因为编译的时候并不知道是？是什么类型，只知道上限是Fruit
		 * list.add(new Fruit()); 
		 * list.add(new Apple()); 
		 * list.add(new Pear());
		 * list.add(new RedApple()); 
		 * list.add(new Object());
		 * 除了add（null）以外都不能添加
		 */
	}
}

/*
 * 注意T不能用？代替
 * 记住创建对象、定义泛型类、泛型接口、泛型方法都不能使用？
 * 只有声明时和形参可以使用
 */
class Test<T extends Fruit> {

}

/*
 * 继承链
 */

class Fruit {

}

class Apple extends Fruit {

}

class Pear extends Fruit {

}

class RedApple extends Apple {

}
