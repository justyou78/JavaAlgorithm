package com.algorithm.programers31;

import java.util.HashMap;
class Test03 {
	public int solution(String[][] clothes) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for (int i = 0; i < clothes.length; i++) {
			if(hm.containsKey(clothes[i][1])) {
				hm.put(clothes[i][1],hm.get(clothes[i][1])+1);
			}
			else {

				hm.put(clothes[i][1],1);
			}
		}
		int answer = 1;
		for (int value : hm.values()) {
			answer *= (value+1);
		}
		

		return --answer;

	}
}
