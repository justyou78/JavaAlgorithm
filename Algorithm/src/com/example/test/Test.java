package com.example.test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		String st = "1234";
		int j = 1;
		int i = 0;
		char a = st.charAt(i);
		System.out.println(a);
    	st =st.replace(st.charAt(i), st.charAt(j));
    	
    	st =st.replace(st.charAt(j), a);
    	System.out.println(st);
	}
}

class TT {
	public void test() {
		Stack<Integer> stack = new Stack<Integer>();
		test02(stack);
		for (int s = 0; s < stack.size(); s++) {
			System.out.println(stack.get(s));
		}
	}

	public void test02(Stack<Integer> st) {
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);

	}
}
