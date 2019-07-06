package com.algorithm.sds02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		new flyHigh().testcase();
	}
}

class flyHigh {
	//각 tastcase마다 구해시는 최대 값
	int max = Integer.MIN_VALUE;
	StringTokenizer st;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	//배열 저장공간.
	int arr[][];
	//방문여부 확인을 위한 bollean값
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
			//사이즈 설정
			arr = new int[size][size];
			check = new boolean[size][size];
			
			for (int j = 0; j < arr.length; j++) {
				st =new StringTokenizer(br.readLine()); 
				int k = 0;
				while(st.hasMoreTokens()) {
					
					arr[j][k] = Integer.parseInt(st.nextToken());
					k++;
				}

			}
			//알고리즘 실행
			exe();
			//각 testcase별 전역변수 max값(뒤집을 수 있는 최대장수)를 stack에저장
			stack.add(max);
			//max값 초기화
			max = Integer.MIN_VALUE;

		}

		// 출력문
		for (int i = 0; i < stack.size(); i++) {
			System.out.println("#"+(i+1) +" " + stack.get(i));
			
		}
	}
	
	public void exe() {
		//각 배열의 좌표에서 모두 시작한다.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				check[i][j] = true;
				direction(arr[i][j], i, j, arr.length, 1);
				check[i][j] = false;
				
			}
		}
		
		

	}
	//각 if문 상하좌우를 나타내고, 첫번째 조건문은 배열밖으로 나가지 않도록, 두번째 조건문은 배열좌표에서 움직이는 좌표의 값이 큰지 확인하는 조건, 세번째 조건문은 방문여부를 확인하는 조건
	public void direction(int number, int i, int j, int size, int depth) {
		
		if (i - 1 > -1 && arr[i - 1][j] > arr[i][j] && !(check[i-1][j])) {
		//	System.out.println("1");
			
			check[i-1][j] = true;
			direction(arr[i-1][j], i-1, j, size, depth+1);
			check[i-1][j] = false;
			
		}
		if (j - 1 > -1 && arr[i][j-1] > arr[i][j] && !(check[i][j-1])) {
	//		System.out.println("2");
			
			check[i][j-1] = true;
			direction(arr[i][j-1], i, j-1, size, depth+1);
			check[i][j-1] = false;
		}
		if (i + 1 < size && arr[i + 1][j] > arr[i][j] && !(check[i+1][j])) {
		//	System.out.println("3");
			
			check[i+1][j] = true;
			direction(arr[i+1][j], i+1, j, size, depth+1);
			check[i+1][j] = false;
		}
		if (j + 1 < size && arr[i][j+1] > arr[i][j] && !(check[i][j+1])) {
		//	System.out.println("4");
			
			check[i][j+1] = true;
			direction(arr[i][j+1], i, j+1, size, depth+1);
			check[i][j+1] = false;
		}
		
	//	System.out.println(depth +" " +i +" "  +j);
		//가장 큰값만 저장하는 조건문
		if(max < depth) {
			max = depth;
			
		}
		//재귀를 위해 리턴
		return ;
		
	}

//	public void toprint() {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
//	}

}