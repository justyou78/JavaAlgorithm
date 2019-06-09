package com.algorithm.programers06;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		int i[] = {2,1,3,2};
		Solution s = new Solution();
		
		System.out.println(s.solution(i, 2));
	}

}

class Solution {
	public int solution(int[] priorities, int location) {
		int answer = 0;

		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		int max = Integer.MIN_VALUE;
		
		
		for (int i = 0; i < priorities.length; i++) {
			if(ll.isEmpty()) {
				max = priorities[i];
			}
			else {
				if(max < priorities[i])
				{
					max = priorities[i];
				}
			}
			
			ll.addLast(priorities[i]);
			
		}
		/*
		 * System.out.println(max); System.out.println(ll.toString());
		 * System.out.println(ll.getFirst());
		 */
		System.out.println(location+"dd");
		while(true){
			if(ll.getFirst()< max) {
				if(location == 0) {
					location = ll.size()-1;
				}
				else {
					location = location-1;
					System.out.println(location);
				}
				ll.addLast(ll.poll());
				ll.toString();
			}
			else {
				break;
			}
		}
		
		
		answer = ++location;
		return answer;
	}

}