package com.xuan.study.oop;

/**
 * 类的使用
 * 
 * @author xuanbo
 * @date 2016年4月2日 下午10:48:38
 * @version 1.0
 */
public class Point {

	private double x;
	private double y;
	private double z;

	public Point() {
		super();
	}

	public Point(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	/**
	 * 距离原点的距离
	 * 
	 * @return
	 */
	public double getDistinct() {
		return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(getZ(), 2));
	}

	/**
	 * 两点之间的距离
	 * 
	 * @param p
	 * @return
	 */
	public double getDistinct(Point p) {
		return Math
				.sqrt(Math.pow(getX() - p.getX(), 2) + Math.pow(getY() - p.getY(), 2) + Math.pow(getZ() - p.getZ(), 2));
	}

	public static void main(String[] args) {
		Point p1 = new Point(3, 4, 12);
		// private 对整个类谁课件的
		System.out.println("p1到原点之间的距离：" + p1.getDistinct());
		Point p2 = new Point(3, 4, 5);
		System.out.println("p1到p2之间的距离：" + p1.getDistinct(p2));
	}
}
