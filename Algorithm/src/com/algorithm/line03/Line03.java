package com.algorithm.line03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Line03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	

		/*
		 * 
		 * 시작갑으로 정렬
		 * 마지막 시간값을 가지고 그 이후의 시간들에대해서 작으면 count증가
		
		*/
		ArrayList<Bathroom> point = new ArrayList<Bathroom>();
	
	
		Collections.sort(point);
		
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			point.add(new Bathroom(sc.nextInt(), sc.nextInt()));
			
			
		}
		int max = 0;
		for (int i = 0; i < point.size(); i++) {
			int number =point.get(i).y;
			int count =0;
			for (int j = i; j < point.size(); j++) {
				if(number > point.get(j).x) {
					count++;
				}
			}
			max= Math.max(max, count);
			
			
		}
		System.out.println(max);
	}
	
	
	
	
}

// x에 대한 오름차순 y에 대한 내림차순 정렬
class Bathroom implements Comparable<Bathroom> {
	int x, y;

	public Bathroom(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int compareTo(Bathroom o) {
		if (this.x > o.x) {
			return 1;
		} else if (this.x == o.x) {
			return 0;
		}
		return -1;
	}
}