package com.algorithm.programers27;

public class Main {
	public static void main(String[] args) {
		/*
		 * Solution s = new Solution(); int arr[][] = { { 2, 2 } };
		 * System.out.println(s.solution(4, 3, arr));
		 */
		CodeReview cr = new CodeReview();
		Practice  p =   new Practice(); 
		int[][] puddles = {{2, 2}, {3, 2}};
        //System.out.println(cr.solution(4, 3, puddles));
		System.out.println(p.solution(4, 3, puddles));
	
	}
}

class Solution {
	int x[] = { 1, 0 };
	int y[] = { 0, 1 };
	int answer = 0;

	public int solution(int m, int n, int[][] puddles) {

		// 백트랙킹이 되는순간 거기도 막아버려
		boolean check[][] = new boolean[m][n];
		for (int i = 0; i < puddles.length; i++) {
			check[puddles[i][0] - 1][puddles[i][1] - 1] = true;

		}

		dfs(check, m, n, 0, 0, 0);

		return answer;
	}

	public void dfs(boolean check[][], int m, int n, int x, int y, int count) {

		if (x + 1 == m && y + 1 == n) {
			answer++;

		} else {
			for (int i = 0; i < 2; i++) {

				if ((x + this.x[i] < m && y + this.y[i] < n)) {

					if (!check[this.x[i] + x][this.y[i] + y]) {
						x += this.x[i];

						y += this.y[i];
						dfs(check, m, n, x, y, count);

						x -= this.x[i];
						y -= this.y[i];

					}

				}

			}

		}
		return;
	}
}
