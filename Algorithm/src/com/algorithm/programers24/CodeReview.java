package com.algorithm.programers24;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


class CodeReview{
	
	public int solution(int N, int number) {
		//정답 설정해줘
		int answer = -1;
		//각 계산에 대한 인덱스별 값들을 넣을 수 있는 hashmap을 만들어줘
	    HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
	    //처음 1번 인덱스값은 그냥 넣어줄거기 때문에 hashset을 하나만들어서
	    //N을 넣어주고 해쉬맵에 put해줘
	    HashSet<Integer> s = new HashSet<>();
	    s.add(N);
	    map.put(1, s);

	    
	    //8보다 크면 -1을 리턴해야 하므로 i<9 까지만 실행해주고
	    loop : for (int i = 2; i < 9; i++) {
	    	//각 결과값을 담을 hashset을 만들어줘
	        HashSet<Integer> set = new LinkedHashSet<>();

	        //5를 이용하여 i갯수만큼 만들 수 있는 숫자 55/555/5555 를 만드는 과정
	        int NNN = Integer.parseInt(Integer.toBinaryString((int) Math.pow(2, i) - 1)) * N;
	        //만든 숫자가 number와 일치하면  끝이므로 i값 리턴
	        if (NNN == number){
	            return i;
	        }
	        //아니면  5 2개로 만든 55를 set에 추가
	        set.add(NNN);
	        
	        
	        //이과정이 i크기만큼 iterator 2개 를 만드는데 
			/*
			 * 2 일경우 1 / 1
			 * 3 일경우 1 / 2
			 * 4 일경우 1 / 3
			 *       2 / 2
			 * 5 일경우 1 / 4
			 *       2 / 3
			 * 이미 했던 친구들은 제외하고 순서 제외한 iterator 2개를 만들어 준다.
			 *      
			 */
	        for (int j = 1; j <= i / 2; j++) {
	            
	        	Iterator<Integer> it1 = map.get(j).iterator();
	            //5
	            Iterator<Integer> it2 = map.get(i - j).iterator();
	            
	            
	            while (it1.hasNext()) {
	                int itValue1 = it1.next();
	                while (it2.hasNext()) {
	                    int itValue2 = it2.next();
	                    //enum Operator를 이용한 for문
	                    for (Operator o : Operator.values()) {
	                    	//계산
	                        int calculate = o.calculate(itValue1, itValue2);
	                        //number와 일치하는지 확인.
	                        if (calculate == number){
	                            answer = i;
	                            //맞으면 loof 탈출
	                            break loop;
	                        }
	                        //아닐경우 hashset에 저장
	                        set.add(calculate);
	                    }
	                }
	            }
	        }
	        //hashmap에 저장
	        map.put(i, set);
	    }
	    //모두 아닐경우 -1 리턴
	    return answer;
	}
	//enum만들기.
	enum Operator {
	    PLUS {
	        @Override
	        public int calculate(int i, int j) {
	            return i + j;
	        }
	    }, MINUS {
	        @Override
	        public int calculate(int i, int j) {
	            return i - j;
	        }
	    }, BACKMINUS {
	        @Override
	        public int calculate(int i, int j) {
	            return j - i;
	        }
	    }, MUL {
	        @Override
	        public int calculate(int i, int j) {
	            return i * j;
	        }
	    }, DIV {
	        @Override
	        public int calculate(int i, int j) {
	            if (j == 0){
	                return 0;
	            }
	            return i / j;
	        }
	    }, BACKDIV {
	        @Override
	        public int calculate(int i, int j) {
	            if (i == 0){
	                return 0;
	            }
	            return j / i;
	        }
	    };
		//abstract만들기
	    public abstract int calculate(int i, int j);
	}
	
}
