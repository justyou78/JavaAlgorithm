package kakaorecruit01;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		String st = "aabbaccc";
		Solution s = new Solution();
		s.solution(st);
	}
}

class Solution {
	public int solution(String s) {
		int answer = Integer.MAX_VALUE;
		/*
		 * 
		 * for문돌리자 s길이만큼 1개로 잘랏을때 걔를 st에 넣어놓고 >>자르고 그 인덱스가 st.length보다 크면 그 인덱스 이후의 값을
		 * newSt에 추가. 비교해서 같은지 물어보고 같으면 count++; 아니면 그 인덱스부터 다시시작. 새로문 문자 변수newSt에 저장해주고
		 * 
		 * 
		 * 
		 */
		ArrayList<Integer> al = new ArrayList<Integer>();

		// 크기를 자르는for문
		for (int i = 1; i < s.length() + 1; i++) {
			// 비교하는 for문
			int count = 1;
			String st = s.substring(0, i);
			String newSt = "";
		
			for (int j = i; j < s.length(); j += i) {
				
				// j+i 가 배열크기를 벗어나지 않게 하기위해서
				if (j + i <= s.length()) {
					// 문자 비교
					if (st.equals(s.substring(j, j + i))) {
						count++;
						

					} else {
						//
						// j -= i;
						if (count == 1) {
							newSt += st;
						} else {
							newSt += count + st;
						}

						st = s.substring(j, j + i);
						count = 1;

					}
				} else {
					// 마지막 남은 내용 추가. 담아놨던거랑
					if (count == 1) {
						newSt += st;
					} else {
						newSt += count + st;
					}
					newSt += s.substring(j, s.length());
					break;
				}
				if (j + i == s.length()) {
					if (count == 1) {
						newSt += st;
					} else {
						newSt += count + st;
					}
				}

			}

			if (i == s.length()) {
				newSt = s;
			}
			
			answer = Math.min(answer, newSt.length());
		}
		
		return answer;
	}
}