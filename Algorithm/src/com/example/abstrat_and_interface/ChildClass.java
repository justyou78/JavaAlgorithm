package com.example.abstrat_and_interface;

public class ChildClass extends Abstract implements TestInterface, TestInterface02{

	@Override
	public void test02() {
		System.out.println("상속받았습니다.");
	}
	

	@Override
	public void testinterface() {
		System.out.println("첫번째 인터페이스 상속.");
	}
	
	


	
}
