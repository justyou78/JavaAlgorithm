package com.algorithm.programers21;

public class Main {

}

class Solution {
    public int solution(String numbers) {
        
        int count = 0;
        for (int i = 1; i < numbers.length()+1; i++) {
        	//i는 String의 길이.
        	//순열이용해서 문제해결하자
        	int start = 0;
        	while(start +i<= numbers.length()) {
        		String number=numbers.substring(start, i+start);
        		System.out.println(number);
        		count =checkSosu(count, Integer.parseInt(number));
        		start++;
        	}
		}
       
        
        return count;
    }
    
    public int checkSosu(int count, int number) {
    	int devide = number/2;
    	if(number >=2) {
    		for (int i = 2; i < devide+1; i++) {
    			if(number/i == 0) {
    				return count;
    				
    			}
    			
    		}
    	}
    	else {
    		return count;
    		
    	}
    	
    	
    	
    	return count++;
    }
}




