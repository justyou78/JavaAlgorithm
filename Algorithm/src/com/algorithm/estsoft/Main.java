
package com.algorithm.estsoft;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		test(hs,0);
		
		System.out.println(hs.size()+"!!!");
		
	}
	
	public static void test(HashSet<Integer> hs,int number) {
			
		if(number ==2) {
			return;
					
		}
		else {
		
			hs.add(number);
			System.out.println(hs.size());
			int val = number+1;
			test(hs,val);
			

			hs.remove(number);
			for (int num : hs) {
				System.out.println(num);
			}
		}
	}
}



