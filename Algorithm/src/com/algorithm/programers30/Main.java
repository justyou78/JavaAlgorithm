package com.algorithm.programers30;

public class Main {

}

class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		boolean ch[] = new boolean[n + 1];
		boolean ch02[] = new boolean[n + 1];
		
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if(lost[i] == reserve[j]) {
					ch[reserve[j]] =true;
					ch02[lost[i]] =true;
					
					answer++;
					break;
				}
			}
		}

		for (int i = 0; i < lost.length; i++) {
			if (ch02[lost[i]]) {
				continue;
			}
			int lostPer01 = lost[i] - 1;
			int lostPer02 = lost[i] + 1;

			for (int j = 0; j < reserve.length; j++) {
				if (ch[reserve[j]]) {
					continue;
				}
				if (reserve[j] == lostPer01) {

					ch[reserve[j]] = true;
					answer++;
					break;

				}
				if (reserve[j] == lostPer02) {

					ch[reserve[j]] = true;
					answer++;
					break;

				}

			}

		}
		
		
		
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i] + " " + i);
		}
		
		
		return answer;
	}

}