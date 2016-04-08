package com.xuan.study.frame;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 窗口 java不擅长桌面软件，所以awt，swing用的很少，了解就行
 * 
 * @author xuanbo
 * @date 2016年4月4日
 * @version 1.0
 */
public class MyFrame extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	Image img = MyUtil.getImage("images/bg.jpg");
	
	/**
	 * 加载窗口
	 */
	public void launchFrame() {
		setSize(500, 500);
		setLocation(100, 100);
		// 设置窗口可见
		setVisible(true);
		
		/*
		 * 窗口可关闭
		 */
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	/*
	 * 画图，利用了多态，调用子类重写的paint()
	 * 用了什么颜色、字体，最后最好改回去
	 */
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 500, 500, null);
	}


	public static void main(String[] args){
		MyFrame mf = new MyFrame();
		mf.launchFrame();
	}
}
