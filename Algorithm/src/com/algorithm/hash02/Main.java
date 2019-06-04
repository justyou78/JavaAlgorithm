package com.algorithm.hash02;

import java.util.HashMap;

public class Main {

}

class Solution {
	public int solution(String[][] clothes) {
		int answer = 0;
		int count[] = new int[clothes.length];
		HashMap<String, Integer> hm = new HashMap();
		
		for (int i = 0; i < clothes.length; i++) {
		
		
		}
		int subcount = 1;
		int len = count.length;
		while (len-- != 0) {
			int result = 1 ;
			for (int i = 0; i < count.length+1-subcount; i++) {
				for (int j = 0; j < subcount; j++) {
					result = result * count[j];
					
				}
				
				answer += result;
			}
			subcount++;

			
		}

		return answer;

	}
}
