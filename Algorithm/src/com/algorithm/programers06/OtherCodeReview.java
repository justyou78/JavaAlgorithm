package com.algorithm.programers06;

import java.util.LinkedList;

public class OtherCodeReview {

}

 class Document {
	int idx;
	int prioritie;

	public Document(int idx, int prioritie) {
		this.idx = idx;
		this.prioritie = prioritie;
	}
}

class OtherSolution {
	public int solution(int[] priorities, int location) {
		LinkedList<Document> list = new LinkedList<Document>();

		for (int i = 0; i < priorities.length; i++) {
			list.add(new Document(i, priorities[i]));
		}

		// 인쇄 순번
		int answer = 1;

		// 첫번째 Document
		Document firstDc = null;

		// 대기목록 순차적으로 체크
		while (list.size() > 1) {
			firstDc = list.getFirst();
			for (int i = 1; i < list.size(); i++) {
				// 대기목록의 가장 마지막으로
				if (firstDc.prioritie < list.get(i).prioritie) {
					list.addLast(firstDc);
					list.removeFirst();
					break;
				}
				// 인쇄
				if (i == list.size() - 1) {
					if (firstDc.idx == location)
						return answer;
					list.removeFirst();
					answer++;
				}
			}
		}
		return answer;
	}
}
