package com.algorithm.hash;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		String participant[] = { "leo", "kiki", "eden" };
		String completion[] = { "eden", "kiki" };
		
		Solution s = new Solution(); String st = s.solution(participant, completion);
		System.out.println(st);
		 

		/*
		 * Solution02 ss = new Solution02(); String stt = ss.solution(participant,
		 * completion); System.out.println(stt);
		 */
	}
}
//내풀이
class Solution {

	public String solution(String[] participant, String[] completion) {
		HashMap<String, Integer> maraton = new HashMap();
		String answer = "";
		int number = 1;
		for (String part : participant) {
			if (maraton.get(part) == null) {
				maraton.put(part, number);
			} else {
				int val = maraton.get(part) + 1;
				maraton.put(part, val);
			}
		}

		for (String com : completion) {
			int val = maraton.get(com) - 1;
			maraton.put(com, val);
		}
		for (String part : participant) {
			System.out.println(maraton.get(part));
			if (maraton.get(part) == 1) {
				answer = part;
			}
		}

		return answer;
	}

}
//다른사람 풀이
class Solution02 {

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);

		
		answer = participant[(participant.length) - 1];
		for (int i = 0; i < completion.length; i++) {

			if (!participant[i].equals(completion[i])) {
				answer = participant[i];

			}

		}

		return answer;
	}

}
