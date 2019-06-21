package com.algorithm.programers12;

import java.util.LinkedList;

public class Main {

}

//###########내 알고리즘 루트야########
//처음에 stock이 4이니까 4일버틸수잇어
//4일내에서 가장큰 서플라이스 가져와 그리고 그 데이터 셋 지워버려
//그래서 총 24일 버티게 되었어
//그러면 24일중에 또 가장큰 서플라이스 가져와.
//*****테스트케이스가 간단하지만 생각보다 생각할게 너무많아;;


class Solution {
	public int solution(int stock, int[] dates, int[] supplies, int k) {
		//딜리버리 클레스를 담을 링크드리스트 생성
		LinkedList<Delivery> ll = new LinkedList<Delivery>();
		//정답 출력 변수
		int answer = 0;
		
		//리스트에 클래스 담는중!
		for (int i = 0; i < supplies.length; i++) {
			ll.add(new Delivery(dates[i], supplies[i]));
		}
		
		//가장큰 서플라이스를 비교하기 위한 변수
		int targetsupplies = 0;
		
		
		Delivery d = null;

		while (stock <= k) {
			//초기화
			int i = 0;
			targetsupplies = 0;
			//ll.get메소드가 i가 증가하면서 size와 동일해질때 에러가 나더라 ? 그래서 if문으로 돌려주고 size보다 작을때로 변경시켜줬어 새로운걸 알아버렸징 > <
			while(i < ll.size())
			{
				//실질적인 알고리즘 조건문이야.
				//stock을 내가 견딜 수 있는 시간으로만들었어 그리고 견딜 수 이쓴 시간만큼의 시간에서 가장 큰 서플라이스 값을 가져오는거야 
				//위에 말한 부분이 정말 생각보다 어려운 알고리즘이엿어;;
				if ( ll.get(i).date <= stock  && ll.get(i).supplies > targetsupplies) {
					d = ll.get(i);
					targetsupplies = d.supplies;
				}
				i++;
			}
			//링크드리스트에서 가져온 데이터셋을 지우고 내가 견딜수있는시간(stock)의 시간을 증가시켰어.
			ll.remove(d);
			stock = stock + d.supplies;
			answer++;
		}

	
		return answer;

	}

}
//데이터 셋
class Delivery {

	int date;
	int supplies;

	public Delivery(int date, int supplies) {
		super();
		this.date = date;
		this.supplies = supplies;
	}

	

}