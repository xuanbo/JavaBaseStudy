package com.xuan.study.net.base;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * URL:统一资源定位符 
 * URI:统一资源 
 * 协议 域名 端口 资源
 * 
 * @author xuanbo
 * @date 2016年4月7日
 * @version 1.0
 */
public class TestURL {

	public static void main(String[] args) throws IOException {
		// 有时候端口号默认为80，可以省略不写，协议也是
		// 绝对路径构建URL
		URL url = new URL("http://www.baidu.com:80/index.html#aa?uname='yyq'");
		System.out.println("协议:" + url.getProtocol());
		System.out.println("域名:" + url.getHost());
		System.out.println("端口:" + url.getPort());
		System.out.println("资源:" + url.getFile());
		System.out.println("相对路径" + url.getPath());
		System.out.println("锚点:" + url.getRef());
		// 存在锚点参数为null
		System.out.println("参数:" + url.getQuery());

		// 相对路径构建URL
		url = new URL(url, "/index.html");
		System.out.println(url.toString());

		/**
		 * 获取资源，源代码 网络流
		 */
		InputStream is = url.openStream();
		byte[] bytes = new byte[1024];
		int hasRead = 0;
		while ((hasRead = is.read(bytes)) != -1) {
			String content = new String(bytes, 0, hasRead);
			System.out.print(content);
		}
		is.close();
	}
}
