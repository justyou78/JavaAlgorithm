package com.algorithm.Naver01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		
	
		LinkedList<String>ll = new LinkedList<String>();
		ll.push("1");
		ll.push("2");
		ll.push("3");
		ll.push("4");
		
		int size = ll.size();
		for (int i = 0; i < size; i++) {
			System.out.println(ll.pollLast());
		}
		
	
	}
}
