package com.algorithm.programers33;


import java.util.Collections;
import java.util.PriorityQueue;

public class Test02 {

}

class Solution03 {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
       
        
		
       PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
       
       
       int count= 0;
        int time = 0;
        int index = 0;
        while(true) {
        	System.out.println("Ddd");
        	time++;
        	stock--;
        	
        	if(time==k) {
        		break;
        	}
        	for (int i = index; i < supplies.length; i++) {
				if(time >= dates[i] ) {
					
					pq.add(supplies[i]);
					System.out.println(pq.peek());
				}
				else {
					System.out.println("index " + i);
					
					index = i;
					break;
				}
			}
        	if(!pq.isEmpty() &&stock == 0) {
        		System.out.println("여기!");
        		stock +=pq.poll();
        		count++;
        	}
        	

        	
        	
        	
        	
        	
        }
        return count;
    }
}

