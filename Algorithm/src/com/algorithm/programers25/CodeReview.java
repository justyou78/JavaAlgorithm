package com.algorithm.programers25;

class CodeReview {
	 
    public long solution(int N) {
        long[] fibonacci = new long[N + 1];
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++)
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
 
        return round(N, fibonacci);
    }
 
    public long round(int N, long[] fibonacci) {
        return fibonacci[N] * 4 + fibonacci[N - 1] * 2;
    }
 
}

