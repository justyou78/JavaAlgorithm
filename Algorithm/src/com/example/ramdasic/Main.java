package com.example.ramdasic;

public class Main {
	public static void main(String[] args) {
		//기본 인터페이스를 이용한 메서드
		Func t2 = new Func() {
			
			@Override
			public int calc(int a, int b) {
				return a+b;
			}
		};
		System.out.println(t2.calc(1, 2));
		
		//람다식을 이용한 메서드 호출
		Func t = (a,b) ->{return a+b;};
		
		System.out.println(t.calc(1, 2));
		
	}
}
