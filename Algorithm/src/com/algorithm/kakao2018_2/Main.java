package com.algorithm.kakao2018_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;




public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int arr[] = {2, 1, 2, 6, 2, 4, 3, 3};
		s.solution(5,arr );
	}

}

class Solution {
    public int[] solution(int N, int[] stages) {
		/*
		 * 각  사람의 실패율을 구하자
		 * stages[i] / stages[i]<= stages.length
		 * 실패율과 인덱스 번호를 함께 저장하는 Arraylist새성하자.
		 * ArrayList를 실패율을 기준으로 내림차순, 인덱스를 기준으로 오름차순 정렬하자.
		 * ArrayList의 인덱스를 출력하자.
		*/
    	ArrayList<Person> al = new ArrayList<Person>();
    	for (int i = 0; i < stages.length; i++) {
			
		}
    	  int [] arr = new int[3];
    	    return arr;
    }
}
class Person implements Comparable<Person>{

	float fail;
	int index;
	Person(float fail, int index){
		this.fail = fail;
		this.index = index;
	}
	
	@Override
	public int compareTo(Person o) {
		if(this.fail > o.fail) {
			return -1;
		}
		else if(this.fail == this.fail) {
			if(this.index > o.index) {
				return 1;
			}
		}
		return 1;
	}
	
}


