package com.algorithm.siliconvalley02;

public class Main {

}

class Solution {
	public int solution(int[][] office, int k) {
		
		/*
		 * 온풍기 돌리는 forans 생각해
		 * 행이동하는 for문 생각하고
		 *	열이동하는 for문 생각해
		 * 	온풍기 돌릴때마다 count증가시키고
		 * 	max값과 비교해서 최대값만 남겨놓자
		 * 
		 */
		
		int count = 0;
		int max = 0;
		
		//열이동
		for (int m= 0; m < office.length-k+1; m++) {
			

			// 행
			for (int l = 0; l < office.length - k + 1; l++) {
				//온풍기가 격자 중간에 걸치는 경우
				//1이상 20이하 자연수
				
				//1이면 무조건 중간에 온풍기가 걸치겟지?
				if(office.length ==1) {
					continue;
				}
				//2일때는 온풍기가 중간에 걸칠 수가 없어.
				//다른경우만 continue로 고려하지 않도록 설정한다.
				else if(office.length != 2 ) {
					int middle = office.length-2;
					if(m == middle && l == middle) {
						continue;
					}
					
				}
				
				
				count = 0;
				// 온풍기
				for (int i = m; i < m+k; i++) {
					for (int j = l; j < k + l; j++) {
						count += office[i][j];
					}
				}
				System.out.println(count);
				max = Math.max(max, count);
				

			}
		}

		return max;
	}
}
