package com.algorithm.line04;

import java.util.Scanner;

public class Line04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];
		/*
		 * 
		 * 1이면 나누기 2해서 값 max와비교 count 0 만들기 0이면 count증가
		 * 
		 */
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		int max = 0;
		int count = 0;
		//첫번재 좌석이 0으로 시작하여 중간값을찾는것이아닌 첫값을 찾을때.
		boolean side = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				if (side) {
					max = Math.max(max, count);
					count = 0;
				} else {
					// 두좌석 사이에 중간값 을 max값과 비교.
					int val = (count + 1) / 2;
					max = Math.max(max, val);
					count = 0;
				}
			} else {
				if (i == 0) {
					side = true;
				}
				count++;

			}
		}
		// '100000' 처럼 마지막이 0으로 끝날경우를 가정하여 한번더 max값과 비교해준다.

		max = Math.max(max, count);

		System.out.println(max);

	}
}