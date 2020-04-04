package com.algorithm.sds2019_12_18;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//마주보는 면은 반대의 역순.
		//B를 기준으로 회전.
		//위아래 -> ABCD
		//좌우 -> BEDF
		
		
		
		int cube[][][] = new int[6][3][3];
		int count =0;
		for (int i = 0; i < cube.length; i++) {
			for (int j = 0; j < cube[i].length; j++) {
				for (int j2 = 0; j2 < cube[i][j].length; j2++) {
					cube[i][j][j2] = ++count; 
				}
			}
		}
		for (int i = 0; i < cube.length; i++) {
			for (int j = 0; j < cube[i].length; j++) {
				for (int j2 = 0; j2 < cube[i][j].length; j2++) {
					System.out.print(cube[i][j][j2]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		int totalRotate = sc.nextInt();
		boolean isRow_col = true; //true 열 // false행
		boolean updown = true; //true 위 왼 // false  아래 오른
		int[] order = {1,4,3,5}; // 좌우 이동에 필요한 index
		//총 횟수만큼 돌린다.
		for (int i = 0; i < totalRotate; i++) {
			int rotate = sc.nextInt();
			//Cycle진행
			for (int j = 0; j < rotate; j++) {
				int row_col = sc.nextInt();
				//회전위치 -1감소
			
				if(row_col >=1 && row_col <=3) {
					isRow_col= true;
					updown = true;
				}
				//아래로
				else if(row_col >=4 && row_col <=6) {
					isRow_col= true;
					updown = false;
				}
				//좌
				else if(row_col >=7 && row_col <=9) {
					
					isRow_col= false;
					updown = true;
				}
				//우
				else if(row_col >=10 && row_col <=12) {
					isRow_col= false;
					updown = false;
				}
				
				// spot
				int spot = (row_col%3);
				spot = spot==0 ? 2: spot-1;
				
				
				//3번의 면 교환
				for (int k = 0; k < 3; k++) {
					//index변경.
					for (int k2 = 0; k2 < 3; k2++) {
						//위아래
						if( isRow_col ) {
							//위로 돌리기.
							if(updown) {
								//a <- b <- c <- d
								int swap= cube[k][k2][spot];
								cube[k][k2][spot] =cube[k+1][k2][spot];
								cube[k+1][k2][spot] =swap;
								
							}
							//아래로 돌리기.
							else {
								// d <- c <- b<- a
								int swap= cube[3-k][k2][spot];
								cube[3-k][k2][spot] =cube[3-(k+1)][k2][spot];
								cube[3-(k+1)][k2][spot] =swap;
								
							}
							
						}
						//좌우
						else {
							int Dindex = 2; 
							int swap;
							//좌
							if(updown) {
								//  b <- f <- d(역순) <- e
								if(order[k] == 3) {
									swap = cube[order[k]][Dindex-spot][k2];
									cube[order[k]][spot][k2] =cube[order[k+1]][spot][k2];
									cube[order[k+1  ]][spot][k2] =swap;
								}
								else if(order[k+1] ==3) {
									swap = cube[order[k]][Dindex-spot][k2];
									cube[order[k]][spot][k2] =cube[order[k+1]][spot][k2];
									cube[order[k+1  ]][spot][k2] =swap;
									
								}
								else {
									swap = cube[order[k]][spot][k2];
									cube[order[k]][spot][k2] =cube[order[k+1]][spot][k2];
									cube[order[k+1  ]][spot][k2] =swap;
									
								}
								
							}
							//우
							else {
								// e <- d(역순) <- f <- b
								
								
							}
							
						}
						
					}
					
				}
			
				
			}
			
			
		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		
//		int totalRotate = sc.nextInt();
//		for (int i = 0; i < totalRotate; i++) {
//			int rotate= sc.nextInt();
//			int sudoku[][] = new int[9][9];
//			
//			
//			//수도쿠 생성
//			for (int j = 0; j < sudoku.length; j++) {
//				for (int j2 = 0; j2 < sudoku[j].length; j2++) {
//					sudoku[i][j2] = sc.nextInt();
//				}
//			}
//			
//			HashMap<Integer, Integer> hs= new HashMap<Integer, Integer>();
//			//갯수확인을 위한 hashmap
//			for (int j = 0; j < 9; j++) {
//				hs.put(j, 0);
//			}
//			
//			//수도쿠에서 중복되는 값 찾기.
//			for (int j = 0; j < sudoku.length; j++) {
//				for (int j2 = 0; j2 < sudoku.length; j2++) {
//					int key = sudoku[j][j2];
//					hs.put(key, hs.get(key)+1 );
//					
//					//수정하기
//					if(hs.get(key)==2) {
//						
//					}
//					
//				}
//			}
//		}
		
		
		
		//풀고
		/*
		 * hashmap => 1-9 , count
		 * count == 2? 문제! -> 그행 또 돌리면서 숫자가 일치하면 열확인
		 * 열 문제 없다 ?  good 열도 문제가 있다 ? 바꿔줘. 45-문제의숫자를 제외한 모든합.
		 * 
		 * 
		*/
		
		/*
		 * 1개부터 -> 존재해 ? 그러면 똑같은 숫자일거야
		 * 그 친구를 기준으로 가로세로 비교해 불일치 ? 걔가 문제
			
		*/
		
	
		
		
	}
	public static void  resolve() {
		
	}
	
}
