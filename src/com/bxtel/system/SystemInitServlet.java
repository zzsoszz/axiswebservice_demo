package com.bxtel.system;
import javax.servlet.http.HttpServlet;


public class SystemInitServlet extends HttpServlet{
	public void init() {
		try {
			//SmsClient.sendSms("13730666347","测试短信");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void destroy() {
		
	}
}