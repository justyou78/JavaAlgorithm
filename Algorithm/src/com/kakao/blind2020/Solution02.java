package com.kakao.blind2020;

public class Solution02 {
	 public String solution(String p) {
		 
	        String answer = "";
	        
	        answer = makeRight(p);
	        
	        
	        
	        
	        return answer;
	    }
	 
	 
	 public String makeRight(String p) {
		 String result ="";
		 
		 if(p.equals("")) return p;
		 int count = 0;
		 for (int i = 0; i < p.length(); i++) {
			if(p.charAt(i)=='(') {
				count++;
			}
			else {
				count--;
			}
			
			if(count == 0) {
				//올바른 괄호 문자열
				if(p.charAt(0)=='(') {
					return result += p.substring(0, i+1)+ makeRight(p.substring(i+1,p.length()));
				}
				//균형잡힌 괄호 문자열
				else {
					result =  "("+ makeRight(p.substring(i+1,p.length()))+")";
					//여기서 각 값들을 바꿔주자
					StringBuilder change = new StringBuilder(p.subSequence(1, i));
					for (int j = 0; j < change.length(); j++) {
						if(change.charAt(j) == '(') {
							change.setCharAt(j, ')');
							
						}
						else {
							change.setCharAt(j, '(');
							
						}
					}
					
					result += change.toString();
					return result;
				}
			}
			
			
			 
			 
		}
		 return result;
		 
	 }
}
