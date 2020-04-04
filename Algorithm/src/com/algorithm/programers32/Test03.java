package com.algorithm.programers32;

class Test03 {
    public int solution(String arrangement) {
        int answer = 0;
        int count =0;
        for (int i = 0; i < arrangement.length(); i++) {
			if(arrangement.charAt(i) =='('){
					count++;
			}
			else if(arrangement.charAt(i) ==')') {
				if(arrangement.charAt(i-1) == ')') {
					count--;

					answer += 1;
				}
				else {
					count--;
					answer += count;
				}
				
			}
		}
        
        return answer;
    }
}

