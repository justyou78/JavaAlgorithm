package com.example.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {

		// Stack : push / pop
		// Queue : offer / poll
		String st = "ddd";
		st.length();
		
		Stack<String> s = new Stack<String>();
		Queue<String> q = new LinkedList<String>();

		s.push("A");
		s.push("B");
		System.out.println(s.toString());
		
		s.push("C");

		q.offer("A");
		q.offer("B");
		q.offer("C");

		System.out.println(s.toString());
		System.out.println(q.toString());

		// LinkedList 둘다가능!!!
		LinkedList<String> ll = new LinkedList<String>();
		ll.addFirst("a");
		ll.add("b");

		ll.offer("b");
		ll.pop();
		ll.poll();

		System.out.println(ll.toString());

		System.out.println("Stack 출력순서");
		while (!s.empty()) {
			System.out.println(s.pop());

		}
		System.out.println("=====================");
		System.out.println("Queue 출력순서");
		while (!q.isEmpty()) {
			System.out.println(q.poll());

		}

	}
}
