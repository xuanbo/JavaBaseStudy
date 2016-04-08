package com.xuan.study.frame;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class MyUtil {

	/**
	 * 加载图片
	 * @param path
	 * @return
	 */
	public static Image getImage(String path){
		URL url = MyUtil.class.getClassLoader().getResource(path);
		BufferedImage img = null;
		try {
			img = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return img;
	}
}
