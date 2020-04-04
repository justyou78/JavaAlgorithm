package com.kakao.intern;

import java.util.HashSet;

public class Solution {
	/*
    
    시간이 없어서 글로 제출해봅니다.

    0이되는 디딤돌의 인덱스를 구하고 그 돌을 기준으로만 평가를 시작합니다.
    (1번 포문이 돌아가는 횟수를 줄입니다)
    그리고 마지막 디딤돌 기준 k만큼 거리에 있는 디딤돌은 어짜피 통과 할 수 잇는 디딤돌이므로 그 돌은 안됩니다.
    

*/
	public int solution(int[] stones, int k) {

		int answer = 0;
		boolean isGo = true;
		int index = 0;
		while (isGo) {
			System.out.println("while");
			for (int j = 0; j < stones.length; j++) {
				System.out.println("1번포문");
				boolean stones_boolean = true;
//				더이성 건널 수 없는 돌
				if (stones[j] <= 0) {
					index = j;
					if (index < stones.length - k) {
						isGo = false;
						stones_boolean = false;
						break;

					}
					int count = 0;
					if (j + k <= stones.length) {

						for (int i = j; i < j + k; i++) {
							System.out.println("2번");
							if (stones[i] <= 0) {
								count++;
							}
							if (count == k) {
								isGo = false;
								stones_boolean = false;
								break;
							}
						}
						// stones 포문빠져나가기
						if (!stones_boolean) {
							break;
						}
					}

				} else {
					stones[j]--;

				}

			}
			if (isGo) {
				answer++;
			}

		}
		boolean test = true;
		while (test) {
			int count = 0;
			for (int i = index; i < index + k; i++) {
				
				if (stones[i] <= 0) {
					count++;
				}
				if(count == k) {
					test =false;
					break;
					
				}
			}
			if(test) {
				answer++;
			}
			
		}

		return answer;

	}

//	 public long[] solution(long k, long[] room_number) {
//	        long[] answer = new long[room_number.length];
//	        int idx =0;
//	        HashSet<Long> hs = new HashSet<Long>();
//	        for (int  i = 0; i < room_number.length; i++) {
//	        	//포함되어있을 경우
//				if(hs.contains(room_number[i])) {
//					for (long j = room_number[i]; j < k; j++) {
//						if(!(hs.contains(j))){
//							answer[idx] = j;
//							idx++;
//							hs.add(j);
//							break;
//							
//						}
//					}
//					
//				}
//				else {
//					answer[idx] = room_number[i];
//					idx++;
//					hs.add(room_number[i]);
//				}
//			}
//	        
//	        
//	        
//	        return answer;
//	    }

//	 public int[] solution(String s) {
//	      
//	        s = s.substring(1,s.length()-1);
//	        int index = 0;
//	        ArrayList<String> al = new ArrayList<String>();
//	        for (int i = 0; i < s.length(); i++) {
//	        	if(s.charAt(i) == '{') {
//	        		index = i+1;
//	        	}
//	        	else if(s.charAt(i) == '}') {
//	        		al.add(s.substring(index,i));
//	        	}
//	        	
//			}
//	        
//	        HashSet<String> hashSet = new HashSet<String>();
//	        
//	        for (int i = 0; i < al.size()-1; i++) {
//				for (int j = i+1; j < al.size(); j++) {
//					if(al.get(i).length() > al.get(j).length()) {
//						String st = al.get(i);
//						
//						al.set(i, al.get(j));
//						al.set(j, st);
//						
//					}
//				}
//			}
//	        
//	        
//	        int[] answer = new int[al.size()];
//	        int idx = 0;
//	        for (int i = 0; i < al.size(); i++) {
//	        	
//				String arr_st[] =al.get(i).split(",");
//				for (int j = 0; j < arr_st.length; j++) {
//					//System.out.println(arr_st[j]+"들어간닷!");
//					if(hashSet.contains(arr_st[j])){
//						
//			
//					}
//					else {
//						answer[idx] = Integer.parseInt(arr_st[j]);
//						idx++;
//						hashSet.add(arr_st[j]);
//					}
//					
//				}
//			}
//	        return answer;
//	    }

//	public int solution(int[][] board, int[] moves) {
//		int answer = 0;
//		/*
//		 * 1행이면 0행 배열에서size-- 하면서 하나 가져와서 stack에쌓자 새로운 숫자면 index설정하고 동일하면 index만큼 pop
//		 * 
//		 * 
//		 * 
//		 * 
//		 */
//		Stack<Integer> stack = new Stack<Integer>();
//		int index = 0;
//		for (int i = 0; i < moves.length; i++) {
//			int row = moves[i] - 1;
//			for (int j = 0; j < board.length; j++) {
//				if(!(board[j][row]==0)) {
//					int doll = board[j][row];
//					board[j][row] = 0;
//					if(stack.isEmpty()) {
//						index = 0;
//						stack.add(doll);
//						break;
//						
//					}
//					else {
//						stack.add(doll);
//						//같은 인형
//						
//						if(stack.get(index) == doll) {
//							
//							for (int k = 0; k < 2; k++) {
//								stack.pop();
//								answer++;
//							}
//							index =stack.size()-1;
//							
//						}
//						//다른 인형
//						else {
//							index++;
//						}
//						break;
//						
//					}
//					
//				}
//			}
//
//		}
//		return answer;
//
//	}
}
