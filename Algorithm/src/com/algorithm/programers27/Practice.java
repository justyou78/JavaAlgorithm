package com.algorithm.programers27;

public class Practice {
	public int solution(int m, int n, int[][] puddles) {
		
		
		boolean isPuddle[][] = new boolean[n][m];
		int map[][] = new int[n][m];
		
		//웅덩이 좌표를 내 boolean좌표에 찍기.
		for (int i = 0; i < puddles.length; i++) {
			isPuddle[puddles[i][1]-1][puddles[i][0]-1] = true;
		}
		//2:3  => 2:1
		//4 3 => 3:4
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		/////////
		for (int i = 0; i < n; i++) {
			if( !isPuddle[i][0] )
			{
				map[i][0] = 1;
			}
			else {
				break;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------");
		/////
		for (int i = 0; i < m; i++) {
			if( !isPuddle[0][i] )
			{
				map[0][i] = 1;
			}
			else {
				break;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		/////
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if(!isPuddle[i][j]) {
					map[i][j] = map[i][j-1] + map[i-1][j]%1000000007; 
				}
				
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		return map[map.length-1][map[0].length-1];
	}
}
