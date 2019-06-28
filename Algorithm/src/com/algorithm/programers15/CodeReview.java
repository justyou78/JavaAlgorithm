package com.algorithm.programers15;

public class CodeReview {
	boolean[] visited;

	public int solution(int n, int[][] computers) {
	    visited = new boolean[n];
	    int answer = 0;
	    for (int i = 0; i < n; i++) {
	        if (!visited[i]) {
	            answer++;
	            dfs(i, computers, n);
	        }
	    }
	    return answer;
	}

	private void dfs(int start, int[][] computers, int n) {
	    visited[start] = true;
	    for (int i = 0; i < n; i++) {
	        if (!visited[i] && computers[start][i] == 1) {
	            dfs(i, computers, n);
	        }
	    }
	}
}
