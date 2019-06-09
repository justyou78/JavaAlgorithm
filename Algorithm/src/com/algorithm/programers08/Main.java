package com.algorithm.programers08;

import java.util.ArrayList;
import java.util.LinkedList;


public class Main {
	public static void main(String[] args) {
		
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
//		Solution s = new Solution();
//		
//		int arr[] = s.solution(progresses, speeds);
//		System.out.println(arr.length);
		
		CodeReview cr = new CodeReview();
		int arr[] = cr.solution(progresses, speeds);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
	}
}


//각 처리진행도와 스피드값을 입력받는 class
class Function {
	int progresses;
	int speeds;

	Function(int progresses, int speeds) {
		this.progresses = progresses;
		this.speeds = progresses;
	}
	//하루가 지날때마다 호출할 메서드
	public void add() {
		progresses = progresses + speeds;
	}
}



class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		//정답
		int[] answer = {};
		
		//Function class를 넣어둘 리스트
		LinkedList<Function> ll = new LinkedList<Function>();
		//정답을 담아 둘 리스트
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		//리스트에 각 값들을 넣는과정
		for (int i = 0; i < progresses.length; i++) {
		
			ll.add(new Function(progresses[i], speeds[i]));
		}
		
	
		int count = 0;
		//ll리스트에 내용물이 업어지면 알고리즘 끝 !
		while (!ll.isEmpty()) {
			//첫 프로그램의 진행상황을 체크할거야
			if (ll.getFirst().progresses <= 100) {
				//100을 넘지 않았으면 리스트의 모든 내용에 speed값을 추가해서 하루경과를 나타낼거야
				for (int i = 0; i < ll.size(); i++) {
					ll.get(i).add();
				}
			}
			//첫 프로그램의 진행이 끝났어!
			else {
				//그 시점에 진행상황이 100을 넘은 모든 프로그램을 빼낼거야!
				for (int i = 0; i < ll.size(); i++) {
					if(ll.get(i).progresses >= 100) {
						ll.remove(i);
						count++;
					}
				}
				//정답 리스트에 갯수를 추가하고
				list.add(count);
				//갯수 초기화
				count = 0;
			}
			
		}
		
		answer = new int[list.size()];
		//정답에 리스트 옮겨담는 과정
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
			
		}
		
		
		return answer;
	}
}
