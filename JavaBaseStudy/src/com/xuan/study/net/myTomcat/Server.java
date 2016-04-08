package com.xuan.study.net.myTomcat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * 服务器
 * 
 * @author xuanbo
 * @date 2016年4月7日
 * @version 1.0
 */
public class Server {

	private ServerSocket server;
	
	private static final String CRLF = "\r\n";
	private static final String BLANK = " ";

	public static void main(String[] args) {
		new Server().start();
	}

	/**
	 * 开启服务器
	 */
	private void start() {
		try {
			server = new ServerSocket(8888);
			receive();
			stop();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 接收客户端的请求
	 */
	private void receive() {
		try {
			Socket client = server.accept();
			/*
			 * 真实情况是读字节，然后分析请求
			 */
			byte[] bytes = new byte[1024000];
			// 输出客户端的请求
			int len = client.getInputStream().read(bytes);
			String requestInfo = new String(bytes, 0, len);
			System.out.println(requestInfo);
			
			/*
			 * 服务器的响应
			 */
			// 响应内容
			StringBuilder resposeContent = new StringBuilder("<html><head><title>index</title></head><body><p>我的服务器</p></body></html>");

			// 发送响应头
			StringBuilder respose = new StringBuilder();
			respose.append("HTTP/1.1").append(BLANK).append("200").append(BLANK).append("OK").append(CRLF);
			respose.append("Server:xuan Server/1.0beta").append(CRLF);
			respose.append("Date:").append(new Date()).append(CRLF);
			respose.append("Content-type:text/html;charset=UTF-8").append(CRLF);
			// 正文长度(字节长度)
			respose.append("Content-Length:").append(resposeContent.toString().getBytes().length).append(CRLF);
			respose.append(CRLF);
			// 正文
			respose.append(resposeContent);
			
			
			// 将响应输出到客户端
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			bw.write(respose.toString());
			bw.flush();
			
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 停止服务器
	 */
	private void stop() {
	
	}
}
