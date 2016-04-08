package com.xuan.study.generic.deep;

/**
 * 泛型的嵌套
 * 一层一层的剥开
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class GenericInsert {
	public static void main(String[] args) {
		User<Integer> user = new User<>();
		user.setId(100);
		Role<User<Integer>> role = new Role<>();
		role.setObj(user);
		
		User<Integer> u = role.getObj();
		Integer id = u.getId();
		System.out.println(id);
	}
}

class User<T> {
	private T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}
}

class Role<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}