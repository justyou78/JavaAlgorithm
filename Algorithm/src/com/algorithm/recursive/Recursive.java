package com.algorithm.recursive;

//기본적인 재귀함수
public class Recursive {
	Recursive() {
		int size = 5;
		for (int i = 0; i < size; i++) {
			recursive(i + 1, size);
		}
	}
	//1차적인 재귀함수
	void recursive01(int number) {
		if (number == 10) {
			return;
		} else {
			System.out.println(number);
			recursive01(number + 1);
			System.out.println("갔다옴");
		}
	}
	//팩토리얼
	int recursive02(int number) {
		if(number==1) {
			return 1;
		}
		else {
			return number*recursive02(number-1);
		}
	}
	
	//for문 재귀함수
	String st = "";
	void recursive03(int number, int dep) {
		if(number == 0) {
			return;
		}
		else {
			for (int i = 0; i < number; i++) {
				st =st + i;
				
				
				if(number == 1) {
					System.out.println(st);
						
				}
				if(number == i) {
				
				}
				
				recursive03(number-1, dep-1);
			}
			
		}
		
		
	}
	
	
	
	

	void recursive(int i, int size) {
		if (i == size) {
			return;
		} else {
		}
	}
}
