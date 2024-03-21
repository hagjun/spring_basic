package com.ict.ex05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain_DI {
	public static void main(String[] args) {
		ApplicationContext context =
				new GenericXmlApplicationContext("com/ict/ex05/config.xml");
		
		// getBean을 이용해서 값 가져오기 : 객체가 object여서 형변환 해줘야됨
		MyProcess myProcess = (MyProcess) context.getBean("mp");
		myProcess.prn();
	}
}
