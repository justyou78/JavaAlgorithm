package com.example.test;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Test {
	public static void main(String[] args) {
		int i[] = {3,2,1,5,2};
		
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>(i.length);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		LinkedList<Integer> ll3 = new LinkedList<Integer>();
		
		for (int j = 0; j < i.length; j++) {
			pq.offer(i[j]);
			ll.add(i[j]);
			ll2.push(i[j]);
			ll3.offer(i[j]);
			
			
		}
		
		
		System.out.println(pq.toString());
		//System.out.println(ll.toString());
		//System.out.println(ll2.toString());
		//System.out.println(ll3.toString());
		
		
		   
	}
}





