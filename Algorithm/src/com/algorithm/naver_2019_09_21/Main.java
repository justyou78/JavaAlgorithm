package com.algorithm.naver_2019_09_21;

public class Main {
	public static void main(String[] args) {
		
	}
}

class Solution{
	public int Solution(String st[]) {
		
		/*
		 * 소문자
		 * @1개이상, .com이 마지막에 존재.
		 * 일단 스트링 배열만큼 돌리면서  대문자있는지 확인.
		 * @있는지 확인
		 * 마지막 .com있는지 확인.
		
		*/
		
		for (int i = 0; i < st.length; i++) {
			
			String email = st[i];
			for (int j = 0; j < email.length(); j++) {
				if(email.charAt(j) < 97 || email.charAt(j) > 122) break; 
			}
			
			
		}
		return 1;
		
	}
}

