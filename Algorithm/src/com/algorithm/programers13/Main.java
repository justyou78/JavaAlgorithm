package com.algorithm.programers13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

}

class Solution {
	public int solution(int[][] jobs) {
		int answer = 0;
		PriorityQueue<Jobs> pq = new PriorityQueue<Jobs>(
				Collections.reverseOrder((o1, o2) -> (o2.process - o1.process)));
		java.util.List<Jobs> list = new ArrayList<>();

		
		
		for (int i = 0; i < jobs.length; i++) {
			list.add(new Jobs(jobs[i][0], jobs[i][1]));
		}

		Collections.sort(list, Collections.reverseOrder((o1, o2) -> (o2.seq - o1.seq)));
		

		int time = 0;
		int k = 0;
		while(true) {

			while (k < list.size() &&time >= list.get(k).seq) {
					pq.offer(list.get(k++));	
					
				
			}
			if (pq.isEmpty() ) {
				break;
			}

			Jobs j = pq.poll();
			answer += (time + j.process - j.seq);
			System.out.println(answer);
			System.out.println(time);
			time = time + j.process;

		}

		return answer / jobs.length;

	}
}

class Jobs {
	public int process;
	public int seq;

	public Jobs(int seq, int process) {

		this.process = process;
		this.seq = seq;
	}

}


