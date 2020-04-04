package com.example.permutation;

 
public class Permutation {
	//순열 : ABC가 중복없이 순서를 정하는방법. Ex)ABC ACB BAC BCA.....
	//nPr = n(n-1)(n-2)...(n-r+1)
	//ABC순열은 nPr롤 가정할 때, 3P3 즉, 3*2*1
	//밑의 코드는 4개의 숫자 1234로 2곳에 배치하는  경우인 4P2이다.
	
	public static void main(String[] args) {
		//샘플 데이터
		int[] arr = {1,2,3,4};
		//재귀함수 실행
		perm(arr,0,4,2);
		
	}
	
	public static void perm(int[] arr, int depth, int n, int k) {
		//재귀함수가 리턴되는 k와 깊이가 동일한 지점
		if(depth == k) {
			print(arr,k);
			return;
		}
		
		
		for (int i = depth; i < n; i++) {
			//깊이위치에 있는 데이터를 arr[i]로 swap하는 과정
			swap(arr, i, depth);
			//깊이를 추가해서 안으로이동
			perm(arr, depth+1, n, k);
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
	//내용물 찍기.
	public static void print( int[] arr, int k) {
		for (int i = 0; i < k; i++) {
			if(i == k-1) {
				System.out.println(arr[i]);
			}
			else {
				System.out.print(arr[i]+",");
			}
		}
	}
	
	
}


