package com.algorithm.siliconvalley;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

}

class Solution {
	public String solution(String phrases, int second) {
		String answer = "";
		/*
		 * 시간 변수잇어야되고 pharses 큐에넣어주자 _큐에넣어주자 처음에 14개넣어주고 시간마다 하나빼서 뒤로 넣어주고 st += 14번동안
		 * poll해서 넣엇다뺏다하면서 추가하고 st출력 그리고 timedl second와 동일해지면 끝내자
		 * 
		 */
		Queue<String> qu = new LinkedList<String>();
		for (int i = 0; i < 14; i++) {
			qu.offer("_");
		}
		for (int i = 0; i < 14; i++) {
			String st = String.valueOf(phrases.charAt(i));
			// System.out.println(phrases.charAt(i));
			// System.out.println(st);
			qu.offer(st);
		}
		int size = qu.size();

//        for (int i = 0; i < size; i++) {
//			System.out.println(qu.poll());
//		}

		int time = 0;
		while (true) {
			answer = "";
			if (time == second) {
				for (int i = 0; i < 14; i++) {
					answer += qu.poll();
				}

				break;

			}

			String a = qu.poll();
			qu.offer(a);

			time++;

		}

		return answer;
	}
}