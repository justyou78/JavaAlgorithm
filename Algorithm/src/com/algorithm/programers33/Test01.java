package com.algorithm.programers33;

import java.util.PriorityQueue;


class Solution {
    public int solution(int[] scoville, int K) {
      
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for (int i = 0; i < scoville.length; i++) {
			pq.offer(scoville[i]);
		}
        int count = 0;
        while(pq.peek() <K)
        {
        	if(pq.size() ==1) {
        		
        		return -1;
        		
        	}
        	else {
        		count++;
        		int a = pq.poll();
        	
        		int b =pq.poll();
        		int reulst = a+ (b*2);
        	
        		pq.offer(reulst);
        		
        	}
        }
    
       return count;
        
        
    }
}