package com.algorithm.nhn;

import java.util.HashMap;
import java.util.Scanner;

/*class Main {
	public static void main(String[] args) throws Exception {
		
		
		 * 	줄수잇는 카드갯수 n
		 *  " " 스플릿쪼개자
		 *  hashmap만들ㄹ고 각각을 키로 잡아
		 *  containskey  활용
		 *  없으면 카운트1값
		 *  있으면 증가
		 *	max값 만들어서 가장큰 수 인지 확인하고
		 *	  
		
		
		
		
		int  n = 1;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		int card =Integer.parseInt(sc.nextLine());
		String st = sc.nextLine();
		String insec[] = st.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for (int i = 0; i < insec.length; i++) {
			//곤충이미 넣어놨을 경우
			if(hm.containsKey(insec[i])) {
				hm.put(insec[i], (hm.get(insec[i])+1));
			}
			//처음곤충을 넣을때
			else{
				hm.put(insec[i], 1);
				
			}
			//max count 변경
			max = Math.max(max, hm.get(insec[i]));
			
			
		}
		
		for(String key : hm.keySet()) {
			//적은 카드 발견시
			
			if(hm.get(key) < max) {
				n = n - (max-hm.get(key));
				//줄카드가 더이상 없을때
				
			}
			if(n < 0) {
				System.out.println("N");
				System.out.println(insec.length);
				System.out.println(hm.keySet().size());
				break;
				
			}
			
		}
		
		//카드 한장을 줄경우
		
		if( n == 0) {
			System.out.println("Y");
			System.out.println(insec.length+1);
			System.out.println(hm.keySet().size());
			
		}
		//모두 동일한 경우
		else if(n==1) {
			System.out.println("Y");
			System.out.println(insec.length);
			System.out.println(hm.keySet().size());
			
			
		}
		
		
		// 
		
		
		
		
		
	}
}*/