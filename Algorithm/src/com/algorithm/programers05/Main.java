package com.algorithm.programers05;

public class Main {
	public static void main(String[] args) {
		
		String st = "ddddd";
		String st2[] = st.split("");
		System.out.println(st2.length);
	}
}

class Solution {
    public int solution(String arrangement) {
        int answer = 0;
        System.out.println(arrangement);
        
        int count = 0;
        //스트링값 배열로 변환
        String st01[] = arrangement.split("");
        // "(" -> +로  // ")" -> -로 설정
        
        for (int i = 0; i < st01.length; i++) {
			if(st01[i].equals("(")) {
				count++;
			}
			else {
				count--;
				//그 과정에서 각 막대기가 끝나는 지점은 +1로만 설정
				//
				if(st01[i-1].equals(")")){
					answer += 1;
					
				}
				else {
					answer += count;
				}
				
			}
        	
		}
        return answer;
    }
}
