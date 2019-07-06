package com.algorithm.sds03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		new NoOdd().testcase();
	}
}

class NoOdd {
	// 각 tastcase마다 구해시는 최대 값
	int min = Integer.MAX_VALUE;
	int oddmin = Integer.MAX_VALUE;
	StringTokenizer st;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);

	// 배열 저장공간.
	int arr[][];
	// 방문여부 확인을 위한 bollean값
	boolean check[][];

	// 3개의 testcase를 돌려주는 과정
	public void testcase() throws IOException {
		// 총 testcase입력
		st = new StringTokenizer(br.readLine());
		int testcase = Integer.parseInt(st.nextToken());
		// 출력값을 저장할 stack
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < testcase; i++) {
			st = new StringTokenizer(br.readLine());
			int size = Integer.parseInt(st.nextToken());
			// 사이즈 설정
			arr = new int[size][size];
			check = new boolean[size][size];

			for (int j = 0; j < arr.length; j++) {
				st = new StringTokenizer(br.readLine());
				int k = 0;
				while (st.hasMoreTokens()) {

					arr[j][k] = Integer.parseInt(st.nextToken());
					k++;
				}

			}

			check[0][0] = true;
			dfs(0, 0, size, 1, 0);
			check[0][0] = false;
			stack.add(min);

		}

		// for문끝난지점.
		for (int i = 0; i < stack.size(); i++) {
			System.out.println("#" + (i + 1) + " " + stack.get(i));

		}
		toprint();

	}

	public void dfs(int i, int j, int size, int depth, int odd) {

		if (i == size - 1 && j == size - 1) {

			if (min > depth) {
				min = depth;
			}
		} else {
			if (i - 1 > -1 && !(check[i - 1][j])) {
				System.out.println("1");

				check[i - 1][j] = true;

				dfs(i - 1, j, size, depth + 1, isOdd(arr[i - 1][j], odd));
				check[i - 1][j] = false;

			}
			if (j - 1 > -1 && !(check[i][j - 1])) {
				System.out.println("2");

				check[i][j - 1] = true;

				dfs(i, j - 1, size, depth + 1, isOdd(arr[i - 1][j], odd));
				check[i][j - 1] = false;
			}
			if (i + 1 < size && !(check[i + 1][j])) {
				System.out.println("3");

				check[i + 1][j] = true;

				dfs(i + 1, j, size, depth + 1, isOdd(arr[i - 1][j], odd));
				check[i + 1][j] = false;
			}
			if (j + 1 < size && !(check[i][j + 1])) {
				System.out.println("4");

				check[i][j + 1] = true;

				dfs(i, j + 1, size, depth + 1, isOdd(arr[i - 1][j], odd));
				check[i][j + 1] = false;
			}
		}

	}

	public int isOdd(int number, int odd) {
		if (number % 2 == 1) {
			return ++odd;
		} else {
			return odd;
		}
	}

	public void toprint() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
