package com.algorithm.programers25;

class Practice {
    public long solution(int N) {
        long arr[] = new long[N+1];
        
        arr[1] = 1;
        for (int i = 2; i < N+1; i++) {
			arr[i] = arr[i-1] + arr[i-2];
			
        	
			
		}
        
        
        
        return result(N, arr);
    }
    
    public long result(int N, long arr[]) {
    	return (arr[N]*4) +(arr[N-1]*2); 
    }
}