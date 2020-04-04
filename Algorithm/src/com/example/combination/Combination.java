package com.example.combination;

import java.util.ArrayList;
import java.util.HashMap;

public class Combination {
	//조합 : ABC가 중복없이 자리가 없이 짝을지을경우. Ex)ABC ACB BAC BCA.....
		//nPr = n(n-1)(n-2)...(n-r+1)
		//ABC순열은 nCr롤 가정할 때, 3C2 3*2/2*1
		//밑의 코드는 4C1에서 4C4까지 뽑는 방법이다.\
	  static ArrayList<Integer> al = new ArrayList<Integer>();
	public static void main(String[] args) {
        int n = 4;
        int[] arr = {2, 3, 5, 1};
        boolean[] visited = new boolean[n];
 
        for(int i=1; i<=n; i++) {
            combination(arr, visited, 0, n, i);
        }
        
        System.out.println();
        
      
        
        
     
        
    }
 
    // 백트래킹 사용
    // 사용 예시 : combination(arr, visited, 0, n, r)
    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            print(arr, visited, n);
            return;
        } else {
            for(int i=start; i<n; i++) {
                visited[i] = true;
                combination(arr, visited, i + 1, n, r - 1);
                visited[i] = false;
            }
        }
    }
 
    // 재귀 사용
    // 사용 예시 : comb(arr, visited, 0, n, r)
    static void comb(int[] arr, boolean[] visited, int depth, int n, int r) {
        if(r == 0) {
            print(arr, visited, n);
            return;
        }
        if(depth == n) {
            return;
        } else {
            visited[depth] = true;
            comb(arr, visited, depth + 1, n, r - 1);
 
            visited[depth] = false;
            comb(arr, visited, depth + 1, n, r);
        }
    }
 
    // 배열 출력
   
    static void print(int[] arr, boolean[] visited, int n) {
     
    	for(int i=0; i<n; i++) {
            if(visited[i] == true)
            {
            	System.out.print(arr[i]);
            
            }
        }
    	System.out.println();
   
        
    }
   

}
