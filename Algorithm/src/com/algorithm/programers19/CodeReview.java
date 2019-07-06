package com.algorithm.programers19;

import java.util.Arrays;
import java.util.Comparator;

public class CodeReview {
	public String solution(int[] numbers) {
        String answer = "";
        String[] st = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
			st[i] =String.valueOf(numbers[i]);
		}
        
        Arrays.sort(st,new Mycomparator());
        if(st[0].equals("0")) {
        	answer += "0";
        }
        else {
        	  for (int i = 0; i < st.length; i++) {
      			answer +=st[i];
      		}
        }
      
        
        return answer;
	
	}
}

class Mycomparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return (o2+o1).compareTo(o1+o2);
	}
}