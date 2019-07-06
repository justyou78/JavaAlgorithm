package com.example.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
	public static void main(String[] args) {
		ArrayList<Point> point =  new ArrayList<Point>();
		point.add(new Point(4,2));
		point.add(new Point(3,1));
		point.add(new Point(2,5));
		point.add(new Point(4,1));
		for (int i = 0; i < point.size(); i++) {
			System.out.println(point.get(i).x + " " + point.get(i).y);
			
		}
		System.out.println("===================================");
		
		Collections.sort(point, new Point());
		for (int i = 0; i < point.size(); i++) {
			System.out.println(point.get(i).x + " " + point.get(i).y);
			
		}
		
		
	}
}



//x에 대한 오름차순 y에 대한 내림차순 정렬
class Point implements Comparator<Point>{
	int x, y;
	public Point() {
		
	}
	
	public Point(int x,int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public int compare(Point p1,Point p2) {
		if(p1.x > p2.x) {
			return 1;
		}
		else if(p1.x == p2.x) {
			if(p1.y <p2.y) {
				return 1;
			}
		}
		return -1;
	}
}
