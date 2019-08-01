package com.algorithm.backjoon02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		Lab l = new Lab();
		l.exe();
	}
}

class Lab {
	StringTokenizer st;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int dx[] = {0,-1,0,1};
	int dy[] = {-1,0,1,0};
	Stack<Spot> s = new Stack<Spot>();
	

	public void exe() throws IOException {
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int arr[][] = new int[a][b];
		int arr02[][] = new int[a][b];
		boolean visited[][] = new boolean[a][b];

		System.arraycopy(arr, 0, arr02, 0, arr.length);
		for (int i = 0; i < a; i++) {
			int j = 0;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				if(arr[i][j] ==2) {
					s.add(new Spot(i,j));
				}
				arr[i][j] = Integer.parseInt(st.nextToken());
				j++;
			
			}
		}
		
		combination(arr, visited , 0, a , b, 3);

		// toPrint(arr);
		// toPrint(arr02);

	}

	public void combination(int arr[][], boolean[][] visited, int start, int a, int b , int r) {
		if(r == 0) {
			diffusion();
			return;
		}
		else {
			for (int i = 0; i < a; i++) {
				for (int j = start; j < b; j++) {
					if(arr[i][j] == 0) {

						visited[i][j] = true;
						combination(arr, visited, j+1, a,b, r - 1);
						visited[i][j] = false;
					}
				}
			}
		}
	}

	

	public void diffusion() {
		
	}

	public void toPrint(int arr[][]) {
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[j][i]);
			}
			System.out.println();
		}
	}
	class Spot{
		int x;
		int y;
		public Spot(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	}

}
