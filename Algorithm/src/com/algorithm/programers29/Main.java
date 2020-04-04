package com.algorithm.programers29;


import java.util.LinkedList;

public class Main {

}

//최대거리 k
//도보 t[0]시간
//도보 t[1]모금액
//자전거 t[2]시간
//자전거 t[3]모금액
class Solution {
	public int solution(int K, int[][] travel) {
		
		// 경산까지 갈수있는 경우의수를 구하고

		LinkedList<Move> ll = new LinkedList<Move>();
		
		ll.add(new Move(0, 0));
		
		int moveMax[] = new int[2];
		moveMax[0] =100001;;
		
		
		moveMax[1] =0;
		
		for (int i = 0; i < travel.length; i++) {
			//코드의 간소화를 위해서 최적화된 경로의 값을 제외하고는 다 없애주는 작업.
//			for (int j = 0; j < ll.size(); j++) {
//				if(ll.get(j).time > moveMax[0] &&   ll.get(j).money < moveMax[1]) {
//					ll.remove(j);
//				}
//				else {
//					moveMax[0] = ll.get(j).time;
//					moveMax[1] = ll.get(j).money;
//					
//				}
//			}
			int k = ll.size();
			//System.out.println(k);
			//리스트에서 하나씩 빼면서 시간 조건이 만족하면 리스트에 다시 추가.
			while (k-- > 0) {
				Move m = ll.poll();
				if (m.time + travel[i][0] <= K) {
					int time =m.time + travel[i][0];
					int money =m.money + travel[i][1];
					//System.out.println(m.money);
					ll.add(new Move(time,money));
				}
				if (m.time + travel[i][2] <= K) {
					int time02 =m.time + travel[i][2];
					int money02 =m.money + travel[i][3];
					//System.out.println(m.money);
					ll.add(new Move(time02,money02));
				}

			}
			//System.out.println("탈출");
		}


		int max = Integer.MIN_VALUE;
		//최댓값 뽑아주는 과정.
		for (int i = 0; i < ll.size(); i++) {
			max=Math.max(max, ll.get(i).money);
		}

		// 그중 모금액이 가장 큰값을 리턴한다 

		return max;
	}

	class Move {
		int time;
		int money;

		public Move(int time, int money) {
			this.time = time;
			this.money = money;
		}
	}
}

