package com.algorithm.programers12;

import java.util.Collections;
import java.util.PriorityQueue;

public class CodeReview {
	  public int solution(int stock, int[] dates, int[] supplies, int k) {
	        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		  	
	        int answer = 0;
	        int day = stock;
		  	int index =0;
		  	while(day <k) {
		  		while(index <dates.length && dates[index] <=day) {
		  			pq.offer(supplies[index]);
		  			index++;
		  		}
		  		answer++;
			  	day += pq.poll();
			  	
		  	}
		  	return answer;
		  	
	  }
	 
}
