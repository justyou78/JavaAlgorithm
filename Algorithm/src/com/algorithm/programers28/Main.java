package com.algorithm.programers28;

public class Main {
	public static void main(String[] args) {
//		Solution s= new Solution();
		int money[] = {1,2,3,1};
		CodeReview cr = new CodeReview();
		
		System.out.println(cr.solution(money));
	}
}

class Solution {
    public int solution(int[] money) {
    	boolean sw = true;
        int answer = 0;
        //System.out.println((money.length-4));
        for (int i = 0; i < money.length; i = i+2) {
        	//System.out.println(i);
        	//System.out.println(i +" " + (money.length-4));
        	if(i == money.length-3) {
        		//System.out.println("tt");
    			answer += money[i] + money[i+2];
    			break;
    		}
        	else if(i >= money.length-2) {
        		if(sw == false && i== money.length-1)
        		{
        			
        		}
        		else{
        			answer += money[i];
        		}
        		
        		break;
        	}
        	
        	else {
        		
        		if(money[i] + money[i+2] > money[i+1]+money[i+3]) {
            		//System.out.println(money[i]);
        			answer += money[i];
        			if(i==0) {
        				sw = false;
        			}
        			else {
        				
        			}
        			
            		
            		
            	}
        		else {
        			//System.out.println(money[i+1]);
        			
        			answer += money[i+1];
        			i++;
        		}
        		//System.out.println("aa"+ answer);
        		
        	}
        	
		}
        
        
        
        return answer;
    }
}

