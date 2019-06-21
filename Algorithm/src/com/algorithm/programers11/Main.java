package com.algorithm.programers11;

import java.util.PriorityQueue;

public class Main {

}

class Solution {
	public int solution(int[] scoville, int K) {

		int answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int i = 0; i < scoville.length; i++) {
			pq.offer(scoville[i]);

		}

		while (true) {
			if (pq.peek() < K) {
				if (pq.size() <= 1) {
					answer = -1;
					return answer;
				}
				int a = pq.poll();
				int b = pq.poll();

				int addscoville = a + (b * 2);

				pq.offer(addscoville);
				answer++;
			} else {
				break;
			}
		}

		return answer;
	}
}

