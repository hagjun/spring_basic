package com.ict.ex06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new GenericXmlApplicationContext("com/ict/ex06/config.xml"); 
		// 생성한 놈을 얻어내서 메서드를 실행해야 되기 때문에 형변환을 해줘야 한다.
		Service service = (Service) context.getBean("service");
		service.biz();
	}
}
