package com.algorithm.programers18;

import java.util.Arrays;

public class CodeReview {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer =  new int[commands.length];
		int [] temp = {};
		for (int i = 0; i < commands.length; i++) {
			temp= Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2]-1];
		}
		return answer;
	}
}
