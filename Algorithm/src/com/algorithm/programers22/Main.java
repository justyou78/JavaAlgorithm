package com.algorithm.programers22;

import java.util.Stack;

public class Main {

}

class Solution {
    public int solution(int[][] baseball) {
        
		
    	
    	Stack<String>  st = new Stack<>();
    	Stack<String>  temp = new Stack<>();
    	
    	for (int i = 1; i < 10; i++) {
			for (int j =1; j < 10; j++) {
				for (int j2 = 1; j2 < 10; j2++) {
					
					if(i !=j && j != j2 && i != j2) {
						st.add(String.valueOf(i*100 + j*10 + j2*1));
						
					}
					
				}
			}
		}
    	
    	boolean flag = true;
    	while(!st.isEmpty()) {
    		
    		String s = st.pop();
    		for (int i = 0; i < baseball.length&& flag; i++) {

        		int  strike = strike(s , String.valueOf(baseball[i][0]) );
        		int ball =  ball(s, String.valueOf(baseball[i][0])) - strike;
        		if(strike != baseball[i][1] || ball != baseball[i][2]) {
        			flag = false;
        			
        		}
        		
        		
			}
    		if(flag) {
    			temp.add(s);
    		}
    		flag = true;
    		
    	}
    	
    	
    	
    	
		return temp.size();
        
        
        
    }
    public int strike(String s, String baseball) {
    	int cnt = 0;
    	for (int i = 0; i < s.length(); i++) {
			cnt = s.charAt(i) == baseball.charAt(i) ? cnt +1 : cnt;
		}
    	return cnt;
    }
    public int ball(String s, String baseball) {
    	int cnt = 0;
    	
    	for(int i = 0; i < s.length(); i++) {
            cnt = s.contains(String.valueOf(baseball.charAt(i))) ? cnt + 1 : cnt;
        }
    	return cnt;
    }
    
}
