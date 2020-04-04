package com.algorithm.programers24;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

class Practice {
	public int solution(int N, int number) {
		int answer = -1;

		HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();
		HashSet<Integer> hs = new HashSet<>();

		hs.add(N);
		hm.put(1, hs);
		
		
		
		loop :for (int i = 2; i < 9; i++) {
			HashSet<Integer> hs02 = new LinkedHashSet<>();
			int NNN = Integer.parseInt(Integer.toBinaryString((int) Math.pow(2, i) - 1))*N;
			if (NNN == number) {
				return i;
			}
			hs02.add(NNN);
			
			for (int j = 1; j <= i/2; j++) {
				Iterator<Integer> it01 = hm.get(j).iterator();
				Iterator<Integer> it02 = hm.get(i-j).iterator();
				while(it01.hasNext()) {
					int num01 = it01.next();
					while(it02.hasNext()) {
						int num02 = it02.next();
						
						for(Operator o : Operator.values()) {
							int total = o.calcualte(num01, num02);
							if(total == number) {
								answer = i;
								break loop;
							}
							hs02.add(total);
							
						}
					}
					
				}
				
				
			}
			hm.put(i, hs02);

		}

		return answer;
	}
	
	
	enum Operator {
		PLUS{

			@Override
			public int calcualte(int a, int b) {
				return a+b;
			}
			
		},
		MINUS{

			@Override
			public int calcualte(int a, int b) {
				return a-b;
			}
			
		},
		MINUS_BACK{

			@Override
			public int calcualte(int a, int b) {
				return b-a;
			}
			
		},
		MUL{

			@Override
			public int calcualte(int a, int b) {
				return a*b;
			}
			
		},
	
		DEVIDE{

			@Override
			
			public int calcualte(int a, int b) {
				if(b == 0) {
					return 0;
				}
				return a/b;
			}
			
		},
		DEVIDE_BACK{

			@Override
			public int calcualte(int a, int b) {
				if(a == 0) {
					return 0;
				}
				return b/a;
			}
			
		};
		
		public abstract int calcualte(int a ,int b);
	}
}