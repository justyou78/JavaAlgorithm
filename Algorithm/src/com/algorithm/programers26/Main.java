package com.algorithm.programers26;

import java.util.Collections;
import java.util.LinkedList;


public class Main {
	public static void main(String[] args) {
//		Solution s = new Solution();
		int arr[][] = { { 7 }, { 3, 8 }, { 8, 1, 0 }, { 2, 7, 4, 4 }, { 4, 5, 2, 6, 5 } };
//		CodeReview cr = new CodeReview();
//		System.out.println(cr.solution(arr));
//		
		Practice p = new Practice();
		System.out.println(p.solution(arr));
		
	}
}

class Solution {
	public int solution(int[][] triangle) {
		int answer = 0;

		LinkedList<Index> ll = new LinkedList<Solution.Index>();
		ll.add(new Index(0, triangle[0][0]));

		for (int i = 1; i < triangle.length; i++) {
			int index = 0;
			int size = ll.size();
			while (!(index ==size)) {

				Index val = ll.poll();
				ll.add(new Index(val.index, val.total + triangle[i][val.index]));
				ll.add(new Index(val.index + 1, val.total + triangle[i][val.index + 1]));
				index++;
				
			}

		}
		Collections.sort(ll);
		/*
		 * for (int i = 0; i < ll.size(); i++) { Index test= ll.get(i);
		 * System.out.println(test.index + " " + test.total); }
		 */return ll.get(ll.size()-1).total;
	}

	class Index implements Comparable<Index> {
		int index;
		int total;

		public Index(int index, int total) {
			super();
			this.index = index;
			this.total = total;
		}

		@Override
		public int compareTo(Index o) {

			if (total > o.total) {
				return 1;
			} else if (total == o.total) {
				return 0;
			}
			return -1;
		}

	}
}
