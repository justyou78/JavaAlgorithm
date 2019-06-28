package com.example.test;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		example e= new example();
		e.t();
		
		
	}
	
}

class example{
	public void t() {
		int number[] = {1,2,3};	
		s(number);
		
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		
	}
	public void s(int[] number) {
		number[2] = 7;
	}
}





