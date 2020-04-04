package com.algorithm.kakao01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MoneyHunter {
	static StringTokenizer stz;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		stz = new StringTokenizer(br.readLine());
		String st = stz.nextToken();
		int count = Integer.parseInt(st);
		StringBuilder sb = new StringBuilder();
		class Score{
			int first;
			int person;
			Score(int first,int person){
				this.first = first;
				this.person = person;
			}
		}
		Score s[] = new Score[6];
		Score s2[] = new Score[5];
		int arr[]= {5000000,3000000,2000000,500000,300000,100000};
		int arr2[]= {5120000,2560000,1280000,640000,320000};
		for (int i = 0; i < s.length; i++) {
			s[i] = new Score(arr[i],i+1);
		}
		for (int i = 0; i < s2.length; i++) {
			s2[i] = new Score(arr2[i], (int)Math.pow(2, i ) );
		}
		
	
		
		//횟수만큼 돌아간다잉~
		for (int i = 0; i < count; i++) {
			int answer = 0 ;
			stz = new StringTokenizer(br.readLine());
			
			int firstScore = Integer.parseInt(stz.nextToken());
		//	System.out.println(firstScore);
			int secondScore = Integer.parseInt(stz.nextToken());
		//	System.out.println(secondScore);
			
			//첫번째 상금값 계산
			int total = 0;
			for (int j = 0; j < s.length; j++) {
				total += s[j].person;
				//System.out.println(total+"첫번째 토탈");
				if(firstScore >0 &&firstScore <= total) {
					//System.out.println(total+"첫번째");
					answer += s[j].first;
					break;
				}
				
			}
			//두번째 상금값 계산
			total = 0;
			for (int j = 0; j < s2.length; j++) {
				total += s2[j].person;
				if(secondScore >0 &&secondScore <= total) {
					//System.out.println(total+"두번");
					answer += s2[j].first;
					break;
				}
				
			}
			
			
			
			sb.append(answer + "\n");
		}
		System.out.print(sb.toString());
	}
}
