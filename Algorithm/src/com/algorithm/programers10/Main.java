package com.algorithm.programers10;

public class Main {
	public static void main(String[] args) {

	}
}

class Solution {
    public int[] solution(int[] prices) {
    	int[] answer = new int[prices.length];
        int time;
    	for (int i = 0; i < prices.length-1; i++) {
    		time = 0;
			for (int j = i+1; j < prices.length; j++) {
				time++;
				if(prices[i] > prices[j]) {
					answer[i] = time;
					break;
				}
				if(j == prices.length-1) {
					answer[i] = time;
				}
				
			}
		}
    	answer[answer.length-1] = 0;
    	
    	return answer;
    }
}
