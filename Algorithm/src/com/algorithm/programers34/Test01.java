package com.algorithm.programers34;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Test01 {
	public static void main(String[] args) {
		Solution s = new Solution();
		int a[] = { 1, 2, 3, 4, 5 };
		int arr[] = s.solution(a);
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

class Solution {
	public int[] solution(int[] answers) {

		int person1[] = { 1, 2, 3, 4, 5 };
		int person2[] = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int person3[] = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int count[] = new int[3];

		for (int i = 0; i < answers.length; i++) {
			int index0 = i % person1.length;
			
			if (person1[index0] == answers[i])
				count[0]++;

			int index1 = i % person2.length;
			
			if (person2[index1] == answers[i])
				count[1]++;

			int index2 = i % person3.length;
			
			if (person3[index2] == answers[i])
				count[2]++;

		}

		Stack<Integer> s = new Stack<Integer>();
	
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < count.length; i++) {
			max = Math.max(max, count[i]);
		}
		for (int i = 0; i < count.length; i++) {
			if (max == count[i]) {
				s.add(i + 1);
			}
		}
		int[] answer = new int[s.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = s.get(i);
		}
		return answer;
	}
}

/*
 * 각각 배열만들어줘 (2차원배열) answer값 비교해줘 각각 길이가 끝나면 0으로 만들어줘. 3밖에 없으니, count(배열)
 * 
 */
