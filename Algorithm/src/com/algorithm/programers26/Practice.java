package com.algorithm.programers26;

class Practice {
    public int solution(int[][] triangle) {
        int dp[][] = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];
        
        for (int i = 1; i < dp.length; i++) {
			dp[i][0] = dp[i-1][0] + triangle[i][0];
			dp[i][i] = dp[i-1][i-1] + triangle[i][i];
		}
        
        
        for (int i = 2; i < dp.length; i++) {
			for (int j = 1; j < triangle[i].length; j++) {
				dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
			}
        	
		}
     
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
			max = Math.max(dp[dp.length-1][i], max);
					
        	
		}
        
        
        
        return max;
    }
}