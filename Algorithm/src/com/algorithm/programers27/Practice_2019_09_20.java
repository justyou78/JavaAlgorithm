package com.algorithm.programers27;

public class Practice_2019_09_20 {
	class Solution {
	    public int solution(int m, int n, int[][] puddles) {
	        int answer = 0;
	        
	        int arr[][] = new int[n][m];
	        boolean go_not[][] = new boolean[n][m];
	        
	        /*
	         * 우물 배열 초기화하자
	         * 우측이동 1초기화 ( 우물있는지 확인하면서 막히면 break;)
	         * 
	         * 밑측이동 1초기화 ( 우물있는지 확인하면서 막히면 break)
	         * 1,1 부터 시작해서 우물있는지 확인 우물있으면 go_not =true로 초기화
	         * 
	         * 1,1 2차원배열끝까지 가면서 go_not이 false이면 좌측과 윗쪽값 더해서 좌표 체크
	         * for문 다돌고 배열 마지막 값 출력.
	         * 
	        
	        
	        */
	        
	        //go_not true면 우물있는거야;
	        for (int i = 0; i < puddles.length; i++) {
				go_not[puddles[i][1]-1][puddles[i][0]-1]=true;
			}
	        
	        //우측길 초기화
	        for (int i = 0; i < m; i++) {
				if(go_not[0][i]) {
					break;
				}
				else {
					arr[0][i] = 1;
				}
			}
	        //좌측길 초기화
	        for (int i = 0; i < n; i++) {
	        	if(go_not[i][0]) {
					break;
				}
				else {
					arr[i][0] = 1;
				}
			}
	        
	        
	        for (int i = 1; i < n; i++) {
				for (int j = 1; j < m; j++) {
					if(go_not[i][j]) {
						continue;
					}else {
						arr[i][j] = (arr[i-1][j] + arr[i][j-1]) % 1000000007;
						
					}
				}
			}
	        
	    
	        answer = arr[n-1][m-1];
	        
	        
	        
	        
	        return answer;
	    }
	}
}
