package com.kakao.blind2020;

public class Solution04 {
	public int[] solution(String[] words, String[] queries) {
		int[] answer = new int[queries.length];

		for (int j = 0; j < queries.length; j++) {
			String query = queries[j];
			int size = query.length();
			if (query.charAt(0) == '?') {
				int index = 0;
				for (int i = 0; i < query.length(); i++) {
					if (!(query.charAt(i) == '?')) {
						index = i;
						break;
					}
				}
				int count = 0;
				String subQuery = query.substring(index,query.length());
				for (int i = 0; i < words.length; i++) {
					if (words[i].length() == size && words[i].substring(index, query.length()).equals(subQuery)) {
						count++;
					}
				}
				answer[j] = count;
			} else {
				int index = 0;
				for (int i = query.length() - 1; i >= 0; i--) {
					if (!(query.charAt(i) == '?')) {
						index = i;
						break;
					}
				}
				int count = 0;
				String subQuery = query.substring(0, index+1);
				for (int i = 0; i < words.length; i++) {
					if (words[i].length() == size && words[i].substring(0, index+1).equals(subQuery)) {
						count++;
					}
				}
				answer[j] = count;

			}
		}

		return answer;
	}



}
