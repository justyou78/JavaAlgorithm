package com.algorithm.programers19;

import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		int a[] = {3,30,34,5,9};
		Solution s= new Solution();
		String st =s.solution(a);
		System.out.println(st);
	}
}



class Test{
	String[] st;
	public String solution(int[] numbers) {
		
		
		return null;
		
	}
}

class Solution {
	 String[] st;
     
	public String solution(int[] numbers) {
        String answer = "";
        st = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
			st[i] =String.valueOf(numbers[i]);
		}
        
        
        for (int i = 0; i < st.length-1; i++) {
			for (int j = 0; j < st.length-i-1; j++) {
				String st01 = st[j] + st[j+1];
				String st02 = st[j+1] + st[j];
				
				if(Integer.parseInt(st01) < Integer.parseInt(st02)) {
					String swap = st[j];
					st[j] = st[j+1];
					st[j+1] = swap;
					
				}
				
			
				
				
			}
		}
        for (int i = 0; i < st.length; i++) {
			answer+= st[i];
			
		}
        
        return answer;
    }
	
}