package com.algorithm.programers25;

public class Main {
	public static void main(String[] args) {
		Solution s= new Solution();
		System.out.println(s.solution(5));
	}
}


class Solution {
	long answer = 0;
    public long solution(int N) {
       
        int num = 1;
        
        dfs(num,num,2,N);
        
        return answer;
    }
    
    public void dfs(long prior, long now, int depth, int destination) {
    	
    	if(depth==destination) {
    		System.out.println(prior + " " +now);
    		answer +=(prior+now) *2;
    		answer += now *2;
    		
    	}
    	else {
    		long temp=prior;
    		prior= now;
    		now= temp+ now;
    		
    		
    		dfs(prior, now, ++depth, destination);
    	}
    	
    	
    }
}
