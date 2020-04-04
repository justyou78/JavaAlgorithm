package com.algorithm.line05;

import java.util.Scanner;

public class Line05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		/*
		 * 빠르게잡는 초의 경우에는 결국 코니의 x,y좌표값의 합이겟지?
		 * 외부에있는지 처음에 비교해서 일단 fail값 출력하는것부터 만들자.
		 * 아니면 코니의 위치를 마방진의 끝좌표라고 생각할게.
		 * 그리고 동적계획법 구현하면 끗.
		
		
		*/
        int map = sc.nextInt();
        int map02 = sc.nextInt();
        
        int cony= sc.nextInt();
        int cony02 = sc.nextInt();
        
        //코니의 전장이탈
        if(cony >map || cony02 > map02) {
        	System.out.println("fail");
        	return;
        }
        
        
        
        
        
        //코니의 위치만큼의 마방진을 만들기 위해서 행과열을 한칸씩늘려준다.
        cony++;
        cony02++;
        
        
        int arr[][] = new int[cony][cony02];
        
        
        //문의 행을 쭉 1로초기화
        for (int i = 0; i < cony; i++) {
		
			
				arr[i][0] = 1;
			
		}
        //문의 열을 쭉 1로 초기화
        for (int i = 0; i < cony02; i++) {
        	
        	arr[0][i] = 1;
			
		}
        
        //각 왼쪽행과 외쪽행을 더해서 값을 더하여 각위치의 잡을경우의수를 나타낸다.
        for (int i = 1; i < cony; i++) {
			for (int j = 1; j < cony02; j++) {
					arr[i][j] = (arr[i-1][j] + arr[i][j-1]) ;
					
				
			}
		}
    
    
        //최소시간 출력
       System.out.println(cony-1+cony02-1);
       //최소시간으로 잡는 경우의수
       System.out.println(arr[cony-1][cony02-1]);
        
        
        

      
    }
}