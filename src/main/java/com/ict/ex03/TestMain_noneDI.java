package com.ict.ex03;

public class TestMain_noneDI {
	public static void main(String[] args) {
		
		// 방법1
		MyProcess process = new MyProcess();
		process.prn();
		
		System.out.println("================");
		
		// 클래스의 상태값 변경
		// 방법2 : 생성자를 이용한 DI
		MyProcess process2 = new MyProcess("둘리", 17);
		process2.prn();
		
		System.out.println("================");
		
		// 방법3 : setter 를 이용한 DI
		MyProcess process3 = new MyProcess();
		process3.setName("희동이");
		process3.setAge(3);
		process3.prn();
	}
}
