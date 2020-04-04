package com.algorithm.line01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Line01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
		/*
		 * time변수 두개의  int Consumer
		 * Consumer가 0이면 각 값들을 넣어주자
		 * Queue하나 만들어서 각 내용 저장하고
		 * 하나씩 빼면서 while문 돌려주자.
		 * 
		
		
		*/
        
        int time = 0;
        int consumer[] = new int[b];
        
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
			q.add(sc.nextInt());
		}
        int mamuri = 0;;
        //마지막 queue가 들어가는 순간 문제 발생.
        while(!q.isEmpty()) {
        	if(q.size()==1) {
        		//consumer값빼기에서 --를 한번했기 때문에 -1을 추가로해서 남은 시간을 추출한다.
        		mamuri =q.peek()-1;
        	}
        	
        	time++;
        	//consumer초기화
        	for (int i = 0; i < consumer.length; i++) {
				if(consumer[i]==0) {
					consumer[i] += q.poll();
				}
				
			}
        	
        	//consumer 값 빼기.
        	for (int i = 0; i < consumer.length; i++) {
				if(consumer[i] >0) {
					consumer[i]--;
				}
			}
        	
        	
        	
        	
        }
        
        //Queue는 비었지만 consumer에서 내용을 비워주기위한 while문
        while(mamuri>0) {
        	mamuri--;
        	time++;
           	//consumer 값 빼기.
        	for (int i = 0; i < consumer.length; i++) {
				if(consumer[i] >0) {
					consumer[i]--;
				}
			}
        	
        }
        
        
        
        
        

       System.out.println(time);
    }
}