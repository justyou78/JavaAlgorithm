package com.algorithm.programers18;

import java.util.Arrays;

public class Main {

}


class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
			String st[] = new String[commands[i][1]-commands[i][0]+1];
			for (int j = 0; j < st.length; j++) {
				st[j] = String.valueOf(array[commands[i][0]+j-1]);	
			}
			Arrays.sort(st);
			
			answer[i] = Integer.parseInt(st[commands[i][2]-1]);
			
			
        	
		}
        
        
        return answer;
        
    }
}