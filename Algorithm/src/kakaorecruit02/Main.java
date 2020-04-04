package kakaorecruit02;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("()))((()"));

	}

}

class Solution {
	LinkedList<Character> ll;

	public String solution(String p) {
		String answer = "";
		/*
		 * 균형잡힌 올바른.
		 * 
		 * + - + - 하면서 균형이 잡혔는지 확인해 0이되면 균형이 잡힌거고 올바른지 판단해. 올바르면 answer에 추가하고 나머지를 v로
		 * 설정하자. 올바르지 않으면 재귀함수를 돌려서 올바르게 고쳐줘.
		 * 
		 * 
		 * 
		 * 
		 */
	
		int count = 0;
		int index = 0;
		
		boolean firstCheck = false;
		for (int i = 0; i < p.length(); i++) {
			//갱신해줄때
			if(index == i) {
				if (p.charAt(i) == '(') {
					
					firstCheck = true;
				

				} else {
					
					firstCheck = false;
					

				}
			}
			
			
			
			if (p.charAt(i) == '(') {
				count++;
			

			} else {
				count--;
				

			}
			// 묶음처리.
			if (count == 0) {
			
				// 문제없을 때,
				if (firstCheck) {
					answer += p.substring(index, i + 1);
					index = i + 1;
				

				}
				// 문제있을 때.
				// 균형은 맞지만 올바르지 않음.
				else  {
					
					
					ll = new LinkedList<Character>();

					for (int j = index; j < i + 1; j++) {
						ll.add(p.charAt(j));
					}
					recur();

					for (int j = 0; j < ll.size(); j++) {
						answer += ll.get(j);
					}

					index = i + 1;

				

				}

			}
		}

		return answer;
	}

	// ( 만나면 인덱스 잡아줘.
	// )만나면 index앞으로 당겨줘.
	public void recur() {
		int index = 0;
		boolean check = false;
		// 정렬 무한루프
		while (true) {
			if (check) {
				break;
			} else {
				for (int i = 0; i < ll.size(); i++) {
					if (i == 0 && ll.get(i) == '(') {
						check = true;
						break;
					}
					if (ll.get(i) == ')') {
						index = i;

					} else {
						char c = ll.get(index);
						ll.remove(index);
						ll.add(c);
						
						break;

					}
				}

			}

		}

	}
}
