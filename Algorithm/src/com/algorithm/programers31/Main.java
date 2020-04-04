package com.algorithm.programers31;

import java.util.HashMap;
import java.util.Iterator;



public class Main {
	public static void main(String[] args) {
		
	}
}

class Solution {
    public String solution(String[] participant, String[] completion) {
       String answer="";
    	HashMap<String, Integer> hm = new HashMap<String, Integer>();
    	for (int i = 0; i < participant.length; i++) {
			if(hm.containsKey(participant[i])) {
				hm.put(participant[i], hm.get(participant[i])+1);
			}
			else {
				hm.put(participant[i], 1);
							
			}
		}
    	for (int i = 0; i < completion.length; i++) {
			if(hm.containsKey(completion[i])) {
				hm.put(completion[i], hm.get(completion[i])-1);
			}
		}
    	
    	Iterator<String> it = hm.keySet().iterator();
    	while(it.hasNext()) {
    		String s = it.next();
    		if(hm.get(s)==1){
    			
    			answer = s;
    			break;
    		}
    	}
    	return answer;
    }
}