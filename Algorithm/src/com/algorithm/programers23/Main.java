package com.algorithm.programers23;

public class Main {
	public static void main(String[] args) {
		Solution s= new Solution();
		int arr[] =s.solution(8, 1);
		System.out.println(arr[0] + " " + arr[1]);
		
	}
}

class Solution {
	public int[] solution(int brown, int red) {
		int[] answer = new int[2];
		
		

		for (int i = red; i >= 1; i--) {
			int row = i;
			
			if (red % row == 0) {
				
				int col = red / row;
				int matrow = row+2;
				int matcol = col+2;
				
				int totalrow = matrow*matcol;
				totalrow = totalrow - (row*col);
				if(totalrow == brown) {
					System.out.println(totalrow);
					answer[0] = matrow;
					answer[1] = matcol;
					break;
				}
				
			} else {
				continue;
			}
			
			
			
			

		}

		return answer;
	}
}