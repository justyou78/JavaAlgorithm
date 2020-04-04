package com.algorithm.programers24;

public class Main {
	public static void main(String[] args) {
		Practice p = new Practice();
		System.out.println(p.solution(5, 12));
		CodeReview cr = new CodeReview();
		System.out.println(cr.solution(5, 12));
	}
}

class Solution {

	public int solution(int N, int number) {
		int answer = 0;
		

		
		answer = dfs(N, number, 1);
		

		return answer;
	}

	public int dfs(int N, int number, int depth) {
		System.out.println(N);
		if (N == number) {

			return N;
		} else if (depth > 8) {
			N=-1;
			return N;
		} else {

			for (int i = 0; i < depth; i++) {
				for (int j = 0; j < 4; j++) {

					int answer= cal(j, N);
					dfs(answer, number, depth + 1);
					
				}
			}

		}
		
		return N;
		

	}

	public int cal(int j, int N) {
		if (j == 0) {
			return N + N;
		} else if (j == 1) {
			return N - N;
		} else if (j == 2) {
			return N * N;
		} else {
			return N / N;
		}

	}

	// 중괄호 범위 만들어야되;

}
