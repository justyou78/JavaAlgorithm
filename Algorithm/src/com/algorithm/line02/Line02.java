package com.algorithm.line02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Line02 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al= new ArrayList<String>();
        
        
        
		/*
		 * 입력 개수를 따로 받지 않는다 갯수 고정 (3개로 ?)
		 * 순열 돌려주고
		 * 각 값들 저장하고(String값으로 저장?)
		 * 오름차순 정렬하고
		 * index번호+1번째 값 출력해주고 ( 
		 * 
		*/
        int size =3;
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
        perm(arr, 0, size,size,al);
        
        Collections.sort(al);
        System.out.println(al.get(sc.nextInt()-1));
        
        
        
        
    }
    
    public static void perm(int[] arr, int depth, int n, int k,ArrayList<String> al) {
		//재귀함수가 리턴되는 k와 깊이가 동일한 지점
		if(depth == k) {
			print(arr,k,al);
			return;
		}
		
		
		for (int i = depth; i < n; i++) {
			//깊이위치에 있는 데이터를 arr[i]로 swap하는 과정
			swap(arr, i, depth);
			//깊이를 추가해서 안으로이동
			perm(arr, depth+1, n, k,al);
			//다시 원상태로 복귀시키는 과정
			swap(arr,i,depth);
			
			
		}
	}
	//데이터 스왑하는과정
	public static void swap(int[] arr, int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] =  temp;
	}
	
	//각 내용 저장
	public static void print( int[] arr, int k,ArrayList<String> al) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k; i++) {
			sb.append(arr[i]);
			
		}
		al.add(sb.toString());
		
		
	}
}
