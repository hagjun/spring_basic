package com.ict.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		// DI 는 Spring Container 에서 객체(Bean) 생성하고 관리한다.
		// Spring Container 에게 필요한 정보를 제공해야 한다. => 설정정보(Configuration Metadata)
		// 설정정보(Configuration Metadata) => 기본적으로 XML 파일 형태이다. 
		// 추가적으로 Annotation 을 이용한다. (Spring Boot 에서는 무조건 Annotation 사용)
		
		// Spring Container => BeanFactory => ApplicationContext
		//                                 => WebApplicationContext (WEB)
		
		// ApplicationContext context = 
		//		new GenericXmlApplicationContext("설정정보위치");
			
		// config.xml 에서 읽는 순간
		// 여기서 읽어야지 객체 생성이 된다.
		ApplicationContext context = 
				new GenericXmlApplicationContext("com/ict/ex02/config.xml"); 
		// 생성한 놈을 얻어내서 메서드를 실행해야 되기 때문에 형변환을 해줘야 한다.
		Service service = (Service) context.getBean("service");
		service.biz();
	}
}
