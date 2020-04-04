package com.algorithm.estsoft;

import java.util.HashMap;
import java.util.HashSet;

/*
 * class Solution { public int solution(String S) { int result = 0; char c =
 * S.charAt(0);
 * 
 * boolean check = false; int count = 0; int index = 0;
 * 
 * 3개 중첩인 문자 발견! boolean = true; 로바꿔주자 index부터 i까지 길이 max값 비교해서 result삽입해주자.
 * 다른애로 바꼇을때 count 1로변경 확인 문자 c도바꿔주고 boolean값 확인해서 true이면 2개 가져가야되니까 index i-2로
 * 설정해주자.
 * 
 * 
 * 
 * 
 * for (int i = 0; i < S.length(); i++) { if(c ==S.charAt(i)) { count++;
 * 
 * } else { c = S.charAt(i); count = 1; if(check) { index = i-2; check =false; }
 * 
 * }
 * 
 * 
 * if(count == 3) { check = true; result = Math.max(result,
 * S.substring(index,i).length()); }
 * 
 * } if(result == 0) { result = S.length(); } return result;
 * 
 * 
 * } }
 */

/*
 * class Solution { int max = 0; public int solution(Tree T) {
 * 
 * 모든경로를 탐색해야겟지. 각 값을 저장하는 해쉬값을 만들자. 값이 해쉬에 존재하는지 확인 없으면 추가 있으면 리턴
 * 
 * 
 * 
 * 
 * HashSet<Integer> hs = new HashSet<Integer>(); rotate(T,hs);
 * 
 * 
 * return max;
 * 
 * 
 * }
 * 
 * public void rotate(Tree T, HashSet<Integer> hs) { if(hs.contains(T.x)) {
 * return;
 * 
 * } else { hs.add(T.x); if(T.l !=null) {
 * 
 * rotate(T.l,hs); }
 * 
 * if(T.r != null) { rotate(T.r, hs); } max =Math.max(max, hs.size());
 * hs.remove(T.x);
 * 
 * } } class Tree { public int x; public Tree l; public Tree r; } }
 * 
 * 
 * 
 */

class Solution {
    public String solution(int U, int L, int[] C) {
        
		/*
		 * 안되는 조건부터 생각하자
		 * 1. u + l  = c 를 만족하지 못할때
		 *  2. u가 4이고 l =1 인데  c 가 22 면 불가능하겟지 
		 *  u와 l중에 많은애꺼를 먼저 넣어주자.
		 *  0이 되면 리턴
		 * 
		 *    1.번조건 안되면 바로 임파서블
		 *   for문돌리자 c크기만큼, 
		 *   2일경우 각 u와c에서 빼서 넣어주고
		 *  1일경우 u와 c중에서 큰 사이즈애꺼를 가져다가 삽입
		 *  0일경우는 넘어가고,.
		 *   
		 * 
		 * 
		*/
    	int total = 0;
    	String upper="";
    	String lower="";
    	for (int i = 0; i < C.length; i++) {
    		total +=C[i];
		}
    	
    	if(U+ L == total) {
    		for (int i = 0; i < C.length; i++) {
    			if(C[i] == 2) {
    				if( U > 0 && L > 0) {
    					U--;
    					L--;
    					upper +="1";
    					lower +="1";
    				}
    				else {
    					return "IMPOSSIBLE";
    				}
    				
    			}
    			else if(C[i] ==1) {
    				
    				if( U >= L  ) {
    					if(U > 0) {
    						U--;
    						upper+="1";
    						lower+="0";
    						
    					}
    					else {
    						return "IMPOSSIBLE";
    					}
    				}
    				else {
    					L--;
    					lower += "1";
    					upper+="0";
    				}
    				
    			}
    			else {
    				lower += "0";
					upper+="0";
    			}
    			
			}
    	}
    	else {
    		return "IMPOSSIBLE";
    	}
    	System.out.println("hihi");
    	System.out.println(upper);
    	System.out.println(lower);
    	String result = upper+", "+lower;
    	return upper+", "+lower;
    	
    	
    	
    	
    	
        
    }
}



