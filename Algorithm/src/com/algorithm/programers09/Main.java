package com.algorithm.programers09;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		
	}
}

class Solution {
    public int[] solution(int[] heights) {
        
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = heights.length-1 ; i > 0; i--) {	
			for (int j = i-1 ; j>=0; j--) {
				
				if(heights[j] > heights[i]) {
					ll.addFirst(j+1);
					break;
				}
				
				if(j == 0) {
					ll.addFirst(0);
				}
				
				
				
			}
		}
        ll.addFirst(0);
        
        
        int[] answer= new int[ll.size()];
        for (int i = 0; i < ll.size(); i++) {
			answer[i] = ll.get(i);
		}
        return answer;
    }
}
