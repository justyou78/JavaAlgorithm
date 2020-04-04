package com.algorithm.programers34;

import java.util.Stack;

public class Test02 {
	public static void main(String[] args) {
		Solution4 s = new Solution4();
		s.solution("17");
	}
}

class Solution4 {
	int answer;
	public int solution(String numbers) {
		
		String st[] = numbers.split("");
		for (int i = 1; i <= st.length; i++) {
			per(st, st.length, i, 0);
		}

		return answer;
	}

	public void per(String[] st, int n, int r, int depth) {
		if (depth == r) {
			// toPrint(st, r);
			makeNumber(st, r);
			return;
		}

		for (int i = depth; i < n; i++) {
			swap(st, i, depth);
			per(st, n, r, depth + 1);
			swap(st, i, depth);
		}

	}

	public void swap(String st[], int i, int depth) {
		String s = st[i];
		st[i] = st[depth];
		st[depth] = s;
	}

	public void toPrint(String st[], int r) {
		for (int i = 0; i < r; i++) {
			if (i == r - 1) {
				System.out.println(st[i]);

			} else {
				System.out.print(st[i] + " ");

			}
		}
	}

	public void makeNumber(String st[], int r) {
		System.out.println("들어옴");
		String getNumber = "";
		for (int i = 0; i < r; i++) {
			getNumber += st[i];
		}
		System.out.println(getNumber);
		isSosu(Integer.parseInt(getNumber));

	}
	Stack<Integer> s =new Stack<Integer>();
	public void isSosu(int sosu) {
		// 홀수인지 짝수인지와 0 과 1인지 확인
		if (sosu % 2 == 0 || sosu ==0 || sosu==1) {
			if(sosu == 2) {
				//짝수 중 유일한 소수
				isExist(sosu);
			}
			return;
		} 
		else {
			for (int i = 3; i < sosu; i += 2) {
				if(sosu%i ==0) {
					return;
				}
			}
			System.out.println("ttt");
			isExist(sosu);
		}
		
	}
	public void isExist(int sosu) {
		//11 과 011 두번이 들어올 수 있는데
		//이러한 중복되어 count가 2번 증가되는 것을 방지.
		for (int i = 0; i < s.size(); i++) {
			if(s.get(i) == sosu) {
				return;
			}
		
			
		}
		System.out.println("성공");
		s.add(sosu);
		answer++;
			
		
	}

}

/*
 * 7 17 71 //순열로 nP1 => nPn 까지 만들고 만들어질때마다 isSosu 실행하는거야. 011 11 둘다 소수잖아 count가
 * 2번 증가해 => 했던 소수는 stack에 저장하고 비교해서 없으면 count증가하자.
 */
