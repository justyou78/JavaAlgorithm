package com.algorithm.programers14;

//해결하지 못했고 ㅠ 다른사람의 코드를 참조했음
public class MySolve {
	int answer = 0;
	public int solution(int[] numbers, int target) {
		
		dfs(numbers, target, 0);
		return answer;
	}
	
	//깊이우선 탐색이 돌아가는곳
	public void dfs(int[] numbers, int target, int depth) {
		//깊이가 배열의 크기와 같아졌을때 각 내용을 더해서 target과 비교하여 정답의 카운트를 증가
		if (depth == numbers.length) {
			int sum = 0;
			for (int i = 0; i < numbers.length; i++) {
				sum += numbers[i];
			}
			System.out.println(sum);
			if(target == sum) {
				
				answer++;
				
			}
			return;
		//numbers의 내용을 변형시켜서 다시 깊이우선 탐으로 재귀를 돌림!
		} else {
			numbers[depth] = -numbers[depth];
			dfs(numbers, target, depth+1);
			
			numbers[depth] = -numbers[depth];
			dfs(numbers, target, depth+1);
			
		}
	}

}
