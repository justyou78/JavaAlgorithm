package com.algorithm.programers08;

import java.util.ArrayList;
import java.util.List;

class CodeReview {
	public int[] solution(int[] progresses, int[] speeds) {
		int days = 0;

		List<Integer> list = new ArrayList<>();
		List<Integer> answerList = new ArrayList<>();

//		for (int i = 0; i < progresses.length; i++) {
//			if ((100 - progresses[i]) % speeds[i] == 0)
//				days = (100 - progresses[i]) / speeds[i];
//			else
//				days = (100 - progresses[i]) / speeds[i] + 1;
//			list.add(days);
//		}
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(8);
		

		int save = 0;
		outer: while (true) {
			int cnt = 1;
			for (int i = save + 1; i < list.size(); i++) {
				if (list.get(save) < list.get(i)) {
					save = i;
					break;
				}
				cnt++;
				if (i == list.size() - 1) {
					answerList.add(cnt);
					break outer;
				}
			}
			answerList.add(cnt);



			if (save == list.size() - 1) {
				answerList.add(1);
				break;
			}
		}

		int[] answer = new int[answerList.size()];
		for (int i = 0; i < answerList.size(); i++) {
			answer[i] = answerList.get(i);
		}

		return answer;
	}
}
