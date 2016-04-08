package com.xuan.study.io.byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件拷贝
 * 最好是把异常抛出，调用时一起处理
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class FileCopy {

	/**
	 * 根据文件路径进行copy
	 * 
	 * @param src
	 * @param dis
	 */
	public static void copy(String src, String dis) {
		copy(new File(src), new File(dis));
	}

	/**
	 * 根据File对象进行copy
	 * 
	 * @param src
	 *            源文件
	 * @param dis
	 *            目标文件
	 */
	public static void copy(File src, File dis) {
		if (!src.isFile()) {
			System.out.println("源文件不存在或不是一个文件");
			return;
			/*
			 * 也可以抛出异常，抛出后就不能用return了，因为已经结束运行了
			 */
		}
		if (dis.isDirectory()) {
			System.out.println();
			try {
				throw new IOException(dis.getAbsolutePath() + "已经存在同名文件夹");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dis);
			byte[] bytes = new byte[1024];
			int hasRead = 0;
			while ((hasRead = is.read(bytes)) != -1) {
				// 读多少个写多少个
				os.write(bytes, 0, hasRead);
				// 强制刷新出去
				os.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭原则：先打开的后关闭
				if (os != null) {
					os.close();
				}
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
