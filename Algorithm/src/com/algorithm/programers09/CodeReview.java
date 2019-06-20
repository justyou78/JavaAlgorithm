package com.algorithm.programers09;
//다른 사람의 코드
public class CodeReview {
	 public int[] solution(int[] heights) {
	        int len = heights.length;
	        int[] answer = new int[len];
	         
	        for(int start = len - 1; start > 0; start--){
	            for(int end = start - 1; end >= 0; end--){
	                if(heights[start] < heights[end]){
	                    answer[start] = (end + 1);
	                    break;
	                }
	                if(end == 0 && heights[start] >= heights[end]){
	                    answer[start] = 0;
	                    break;
	                }
	            }
	        }
	        answer[0] = 0;
	        return answer;
	    }
}

