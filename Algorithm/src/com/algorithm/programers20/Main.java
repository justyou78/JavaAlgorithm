package com.algorithm.programers20;

import java.util.Collections;
import java.util.Stack;

public class Main {

}

class Solution {
	public int[] solution(int[] answers) {
		
		int max =Integer.MIN_VALUE;
		int stu01[][] = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < 3; i++) {
			int number = 0;
			int count = 0;
			for (int j = 0; j < answers.length; j++) {
				if (stu01[i][number] == answers[j]) {
					count++;
				}

				number++;
				if (number == stu01[i].length) {
					number= 0;
				}
			}
			if(count > max) {
				max= count;
			}
			
			s.add(count);
			
			
			
			
		}
		
		
		
		int count = 0;
		Stack<Integer> s02= new Stack<Integer>();
		for (int i = 0; i < s.size(); i++) {
			if(max ==s.get(i)) {
				count++;
				s02.add(i+1);
				
			}
		}
		int[] answer = new int[count];
		
		for (int i = 0; i < count; i++) {
		
			answer[i] = s02.get(i);
		}
		return answer;
	}
}