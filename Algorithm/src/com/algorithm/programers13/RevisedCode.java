package com.algorithm.programers13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


class RevisedCode {
	public int solution(int[][] jobs) {
		Queue<Jobs> pq = new PriorityQueue<>(
				Collections.reverseOrder((o1, o2) -> (o2.process - o1.process)));
		List<Jobs> list = new ArrayList<>();

		int totalTime = 0;
		
		
		
		for (int i = 0; i < jobs.length; i++) {
			list.add(new Jobs(jobs[i][0], jobs[i][1]));
		}
		Collections.sort(list, Collections.reverseOrder((o1, o2) -> (o2.seq - o1.seq)));
		
		int settingTime = list.get(0).seq;
			
		
		for (Jobs jb : list) {
			jb.seq -= settingTime;
			totalTime  +=(jb.seq+ jb.process);
		}
		int answer = 0;
		int time = 0;
		int k = 0;
		int job = 0;
		  for (int i = 0; i <= totalTime; i++) {
			while (k < list.size() && i == list.get(k).seq) 
				pq.offer(list.get(k++));	
			
			if (!pq.isEmpty() && job==0) {
				Jobs j = pq.poll();
				job = j.process;
				answer += (j.process - j.seq +time);
				
			}
			
			if(job> 0 ) job--;

			time++;

		}

		return (answer) / jobs.length;

	}
	public class Jobs {
		public int process;
		public int seq;

		public Jobs(int seq, int process) {
			
			this.process = process;
			this.seq = seq;
		}

	}
}



