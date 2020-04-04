package com.kakao.blind2020;

public class Main {
	public static void main(String[] args) {
		
		int arr[][] = new int[3][4];
		
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = num++; 
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		arr =rotateLeft(arr);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
	
	public static int[][] rotateLeft(int [][]arr){
		int returnArr[][] = new int[arr[0].length][arr.length];
		//열값이 행으로 온다.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0, k= arr[0].length-1;  j < arr[0].length; j++,k--) {
				returnArr[j][i] = arr[i][k];
				
				
			}
		}
		return returnArr;
		
		
	}
}
