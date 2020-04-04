package com.algorithm.programers29;

class Practice {
    public int solution(int K, int[][] travel) {
        int[]result = new int[100];
        for (int i = 0; i < 100; i++) {
            
                result[i] = -1;
            
        }

        return find(travel, 0, travel.length, K, result);
    }

    public static int find(int[][]travel, int index, int n, int K, int[] result) {
        if (index == n) return 0;
        if (result[index] >= 0) return result[index];

        result[index] = Math.max(
                ((K - travel[index][0] >= 0)?
                        (index + 1 == n? 0 : find(travel, index + 1, n, K - travel[index][0], result)) + travel[index][1] : 0),
                ((K - travel[index][2] >= 0)?
                        (index + 1 == n? 0 : find(travel, index + 1, n, K - travel[index][2], result)) + travel[index][3] : 0));
        return result[index];
      
    }
}
