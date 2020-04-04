package com.algorithm.siliconvalley03;

public class Main {

}

class Solution {
	public int solution(int[] estimates, int k) {

		/*
		 * 
		 * estimate길이- k +1만큼 돌려주고 내부for문은 4번씩
		 * 
		 */

		int max = 0;
		for (int i = 0; i < estimates.length - k + 1; i++) {
			int count = 0;
			if (k + i <= estimates.length) {
				for (int j = i; j < k + i; j++) {
					count += estimates[j];
				}
			}
			
			max = Math.max(max, count);

		}

		return max;
	}
}
