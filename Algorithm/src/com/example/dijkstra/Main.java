/*
 * package com.example.dijkstra;
 * 
 * public class Main { public int solution(int N, int[][] road, int K) { int
 * answer = 0;
 * 
 * int map[][] = new int[N + 1][N + 1]; for (int i = 0; i < road.length; i++) {
 * int from = road[i][0]; int to = road[i][1]; int dist = road[i][2]; if
 * (map[from][to] == 0 || map[from][to] > dist) { map[from][to] = dist;
 * map[to][from] = dist;
 * 
 * } }
 * 
 * int[] cost = new int[N + 1]; for (int i = 1; i < cost.length; i++) { cost[i]
 * = Integer.MAX_VALUE;
 * 
 * }
 * 
 * cost[1] = 0; Queue<Integer> queue = new LinkedList<Integer>(); queue.add(1);
 * while (true) { int target = queue.poll(); for (int i = 1; i < cost.length;
 * i++) { if (target == i) continue; if (map[target][i] > 0 && map[target][i] +
 * cost[target] < cost[i]) { cost[i] = map[target][i] + cost[target];
 * queue.add(i); } } if (queue.isEmpty()) { break; }
 * 
 * }
 * 
 * for (int i = 1; i < cost.length; i++) { if (cost[i] <= K) {
 * 
 * answer++; } } return answer; }
 * 
 * }
 */