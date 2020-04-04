package com.kakao.blind2020;

import java.util.ArrayList;
import java.util.Collections;

public class Solution03 {
	public boolean solution(int[][] key, int[][] lock) {

		/*
		 * key의 돌기값을 구하는 메서드 Key의 1값들만 회전시키는 매서드 그걸 담은 arrayList Lock 홈부분을 구하는 메서드 각 홈에
		 * key 돌기들을 이동 홈부분이 채워졌는지 확인 채워졌따면 돌기에 돌기가 중첩되는지 확인 괜찮다면 true 조건이 성립하지 않는다면 회전
		 * 
		 * 
		 */
		ArrayList<Spot> getLock = getWant(lock, 0);
		for (int i = 0; i < 4; i++) {
			key = rotateRight(key);
			ArrayList<Spot> getKey = getWant(key, 1);
		
		
				
				
			
			for (int j = 0; j < getLock.size(); j++) {
				Spot LockSpot = getLock.get(j);
				for (int j2 = 0; j2 < getKey.size(); j2++) {
					Spot KeySpot = getKey.get(j2);
					int moveX = LockSpot.x - KeySpot.x;
					int moveY = LockSpot.y - KeySpot.y;
					// key이동
					ArrayList<Spot> moveKey = new ArrayList<Spot>();
					for (int k = 0; k < getKey.size(); k++) {
						moveKey.add(new Spot(getKey.get(k).x + moveX, getKey.get(k).y + moveY));

					}
//					for (int k = 0; k < moveKey.length; k++) {
//						System.out.println(moveKey[k].x+ " " + moveKey[k].y);
//						
//					}

					// 비교
					if(check(moveKey,getLock,lock)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean check(ArrayList<Spot> moveKey, ArrayList<Spot> getLock, int lock[][]) {
	
		int count = 0;
		for (int i = 0; i < getLock.size(); i++) {
			
		
			for (int k = 0; k < moveKey.size(); k++) {
				if(moveKey.get(k).x < lock.length && moveKey.get(k).x >=0 && moveKey.get(k).y >= 0 && moveKey.get(k).y <lock.length ) {
					if(lock[moveKey.get(k).x][moveKey.get(k).y]==1) {
						return false;
						
					}
				}
				
				if (moveKey.get(k).x == getLock.get(i).x && moveKey.get(k).y == getLock.get(i).y) {
					count++;
					break;
				}
	
			}
		}
		if(count == getLock.size()) {
			return true;
		}
		return false;
	}

	public ArrayList<Spot> getWant(int arr[][], int find) {
		ArrayList<Spot> al = new ArrayList<Spot>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == find) {
					al.add(new Spot(i, j));

				}

			}
		}
		return al;
	}

	public int[][] rotateRight(int arr[][]) {
		int size = arr.length;
		int returnArr[][] = new int[size][size];
		for (int i = 0; i < returnArr.length; i++) {
			for (int j = 0, k = size - 1; j < returnArr.length; j++, k--) {
				returnArr[i][k] = arr[j][i];
			}
		}

		return returnArr;

	}

	class Spot {
		int x, y;

		public Spot(int x, int y) {
			this.x = x;
			this.y = y;

		}

		
	}
	

}
