package com.algorithm.programers.siliconvalleydemo;

public class Main {

}

class Solution {
	public int[] solution(int[][] v) {
		int[] answer = new int[2];
		int x = v[0][0];
		int y = v[0][1];
		int total01 = x;
		int total02 = y;

		for (int i = 1; i < v.length; i++) {
			if (x != v[i][0]) {
				total01 += v[i][0];
				break;
		
			}
		}
		for (int i = 1; i < v.length; i++) {
			if (y != v[i][1]) {
				total02 += v[i][1]; 
				break;
				
			}
		}
		total01 = total01*2;
		total02 = total02*2;
		for (int i = 0; i < v.length; i++) {
			total01 -= v[i][0];
			total02 -= v[i][1];
			
		}
		answer[0] = total01;
		answer[1] = total02;
		

		

		return answer;
	}

}