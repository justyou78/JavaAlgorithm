package com.algorithm.programers32;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Develope {
	int pro;
	int speeds;

	Develope(int pro, int speeds) {
		this.pro = pro;
		this.speeds = speeds;
	}
}
class Test05{
	public static void main(String[] args) {
		int pro[] = {93,30,55};
		int sppeds[] = {1,30,5};
		
		Solution03 s= new Solution03();
		int []answer =s.solution(pro, sppeds);
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}

class Solution03 {
	public int[] solution(int[] progresses, int[] speeds) {
		

		Queue<Develope> qu = new LinkedList<Develope>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for (int i = 0; i < progresses.length; i++) {
			qu.add(new Develope(progresses[i], speeds[i]));

		}
		int count = 0;
		int index = 0;
		while (!qu.isEmpty()) {
			Iterator<Develope> it = qu.iterator();
			if (qu.peek().pro >= 100) {
				qu.poll();
				count++;
				while (true) {
					if (!qu.isEmpty() &&qu.peek().pro >= 100) {
						qu.poll();
						count++;

					} else {
						System.out.println(count);
						ll.add(count);
						count = 0;
						
						break;
					}

				}
			} else {

				while (it.hasNext()) {
					Develope d = it.next();
					if (d.pro < 100) {
						d.pro += d.speeds;

					}

				}
			}

		}
	
		int[] answer = new int[ll.size()];
		for (int i = 0; i < ll.size(); i++) {
			answer[i] = ll.get(i);
		}
		return answer;
	}
}

/*
 * import java.util.ArrayList; import java.util.List;
 * 
 * class Solution { public int[] solution(int[] progresses, int[] speeds) { int
 * days = 0;
 * 
 * List<Integer> list = new ArrayList<>(); List<Integer> answerList = new
 * ArrayList<>();
 * 
 * for (int i = 0; i < progresses.length; i++) { if
 * ((100-progresses[i])%speeds[i]==0) days = (100-progresses[i])/speeds[i]; else
 * days = (100-progresses[i])/speeds[i]+1; list.add(days); }
 * 
 * int save = 0; outer: while (true) { int cnt = 1; for (int i = save+1; i <
 * list.size(); i++) { if (list.get(save) < list.get(i)) { save = i; break; }
 * cnt++; if (i==list.size()-1) { answerList.add(cnt); break outer; } }
 * answerList.add(cnt); if (save==list.size()-1) { answerList.add(1); break; } }
 * 
 * int[] answer = new int[answerList.size()]; for (int i = 0; i <
 * answerList.size(); i++) { answer[i] = answerList.get(i); }
 * 
 * return answer; } }
 */