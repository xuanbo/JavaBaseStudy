package com.xuan.study.io.byteStream;

import java.io.File;

/**
 * 文件夹拷贝 思路：递归遍历源文件夹，是文件夹就创建，是文件就用IO流读写
 * 最好是把异常抛出，调用时一起处理
 * 
 * @author xuanbo
 * @date 2016年4月5日
 * @version 1.0
 */
public class DirCopy {

	public static void main(String[] args) {
		String srcPath = "d:/src";
		String disPath = "d:/dis";
		copy(srcPath, disPath);
	}
	
	
	/**
	 * copy文件夹的方法
	 * 
	 * @param srcPath 源路径
	 * @param disPath 目标路径
	 */
	public static void copy(String srcPath, String disPath){
		copy(new File(srcPath), new File(disPath));
	}
	
	/**
	 * copy文件夹
	 * 
	 * @param src 源文件
	 * @param dis 目标文件
	 */
	public static void copy(File src, File dis){
		if (!src.exists()) {
			System.out.println("源文件夹不存在");
			return;
		}
		// 是一个目录就在目标文件夹下创建一个File
		if (src.isDirectory()) {
			dis = new File(dis, src.getName());
		}
		copyDetail(src, dis);
		System.out.println("copy结束");
	}
	
	/**
	 * copy的具体递归遍历实现
	 * 
	 * @param src 源文件
	 * @param dis "目标路径/源文件名"创建的文件
	 */
	private static void copyDetail(File src, File dis){
		if (src.isFile()) {
			/*
			 * 调用拷贝文件的方法
			 */
			FileCopy.copy(src, dis);
		}else if(src.isDirectory()){
			//确保目标文件夹存在
			dis.mkdirs();
			/*
			 * 遍历文件夹
			 */
			for (File file : src.listFiles()) {
				copyDetail(file, new File(dis, file.getName()));
			}
		}
	}
}
