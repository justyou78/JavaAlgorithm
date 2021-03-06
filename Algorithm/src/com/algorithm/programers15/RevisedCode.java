package com.algorithm.programers15;

public class RevisedCode {
	int answer = 0;

	public int solution(int n, int[][] computers) {

		boolean check[] = new boolean[n];
		for (int i = 0; i < check.length; i++) {
			check[i] = false;

		}
		for (int i = 0; i < n; i++) {
			if (check[i] == false) {
				check[i] = true;
				answer++;
				dfs(computers, check, i, n);

			}
		}

		return answer;
	}

	public void dfs(int[][] computers, boolean[] check, int depth, int n) {

		if (check[depth] == true) {
			for (int i = 0; i < n; i++) {
				if (check[i] == false && computers[depth][i] == 1) {
					check[i] = true;
					dfs(computers, check, i, n);
				}
			}

		}

	}
}
