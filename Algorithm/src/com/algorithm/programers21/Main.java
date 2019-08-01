package com.algorithm.programers21;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		CodeReview cr = new CodeReview();
		
		
		System.out.println(cr.solution("011") + "!!");
	}
}

class Solution {
	int count = 0;
	public int solution(String numbers) {
		String st[] = numbers.split("");

		int arr[] = new int[numbers.length()];
		for (int i = 0; i < st.length; i++) {
			arr[i] = Integer.parseInt(st[i]);
		}
		for (int i = 1; i <= arr.length; i++) {
			permutation(arr, 0, arr.length, i);
		}

		return count;

	}
	

	public void permutation(int arr[], int depth, int n, int r) {
		
		if (depth == r) {
			count +=isSosu(arr,depth);
			return;
		} else {
			for (int i = depth; i < n; i++) {
				swap(arr, depth, i);
				permutation(arr, depth + 1, n, r);
				swap(arr, depth, i);

			}
		}
	}

	public void swap(int arr[], int i, int j) {
		int sw = arr[i];
		arr[i] = arr[j];
		arr[j] = sw;
	}
	Stack<Integer> stack = new Stack<Integer>();
	
	public int isSosu(int arr[],int depth) {
		String st = "";
		for (int i = 0; i < depth; i++) {
			st += String.valueOf(arr[i]);
		}
		
		int number = Integer.parseInt(st);
		number =isOverlab(number,stack);

		int devide = number / 2;
		
		if (number >= 2) {

			for (int i = 2; i <= devide; i++) {
				if (number % i == 0) {
					return 0;
				}
			}

			return 1;
		}
		else {
			return 0;
		}

	}
	public int isOverlab(int number, Stack<Integer> stack) {
		for (int i = 0; i < stack.size(); i++) {
			if(stack.get(i) == number){
				return number = 0;
			}
			
		}
		stack.add(number);
		return number;
	}
}