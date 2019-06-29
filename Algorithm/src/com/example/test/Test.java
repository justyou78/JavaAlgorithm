package com.example.test;

import java.util.PriorityQueue;

public class Test {
	public static void main(String[] args) {
		
	       PriorityQueue<TT> pq= new PriorityQueue<TT>();
	       pq.add(new TT("TEST"));
	       pq.add(new TT("MONSTER"));
	       
	       System.out.println(pq.poll().name);
	       
		
	}
	
	
	
}

class TT implements Comparable<TT>{

	String name;
	
	public TT(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(TT o) {
		return name.compareTo(o.name);
	}
	
}






