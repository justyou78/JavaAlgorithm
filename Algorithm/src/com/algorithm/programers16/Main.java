package com.algorithm.programers16;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		String begin = "hit";
		String target= "cog";
		String st[] = {"hot","dot","dog","lot","log","cog"};
		
		new Solution().solution(begin, target, st);
		
	}
}

class Solution {
	//방문 체크를 확인하기위한 해쉬맵이야
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	int answer = 0;

	public int solution(String begin, String target, String[] words) {
		//bfs를 실행할때 필요한 queue
		Queue<Word> q = new LinkedList<Word>();
		//일단 0으로 셋팅할거야
		for (int i = 0; i < words.length; i++) {
			hm.put(words[i], 0);
		}
		int depth = 0;
		//초기 begin값 넣어주고
		q.add(new Word(begin, depth));
		//bfs재귀함수 실행
		bfs(words,q,target);
		
		return answer;
	}

	public void bfs(String[] words, Queue<Word> q, String target) {
		//이 if문을 쓰지않으면 큐가 비어있을 때 q.poll이 실행되서 에러가 생겨
		if (q.isEmpty()) {

		} else {
			Word w = q.poll();
			//정답일경우 answer를  깊이로 변경시켜줄거야
			if (w.name.equals(target)) {

				answer = w.depth;
			} else {
				//문자가 총 몇개가 같은지 확인하기위한 count변수야
				int count = 0;
				//첫번째 for문 : 단어 배열에 들어가있는 단어들을 하나씩 꺼내는 for문
				for (int i = 0; i < words.length; i++) {
					//방문여부를 확인하는 if문이야 
					//bfs이기 때문에 방문한 노드로 다시 돌아갈 필요가 없어 최소값을 찾으면 출력하고 끝나 ㅇㅋ ?
					if (hm.get(words[i]) == 1) {
						continue;
					}
					//각 단어하나하나를 확인하고 count를 증가시키지
					for (int j = 0; j < w.name.length(); j++) {
						if (w.name.charAt(j) == words[i].charAt(j)) {
							count++;
						}
					}
					//조건에 맞는 단어를 찾으면  해쉬맵을 변형시키고, queue에 추가해줄거야
					if (count == w.name.length() - 1) {
						hm.put(words[i], 1);
						q.add(new Word(words[i], w.depth + 1));

					}
					//변수초기화
					count = 0;

				}
				//재귀함수
				bfs(words, q, target);

			}
		}
	}
	//노드
	class Word {
		private String name;
		private int depth;
		
		public Word(String name, int depth) {
			super();
			this.name = name;
			this.depth = depth;
		}
	}
}
