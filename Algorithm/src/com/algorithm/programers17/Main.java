package com.algorithm.programers17;

import java.util.PriorityQueue;

public class Main {

}

class Solution {
	//방문여부 확인을 위한 변수
	boolean check[] ;
	
    public String[] solution(String[][] tickets) {
        String[] answer = new String[tickets.length+1];
        
        check= new boolean[tickets.length];
        //초기 출발 String값
        String st= "ICN";
        
        //각 출발위치가 같은 것들을 모아서 넣어둘 우선순위큐
        PriorityQueue<ticket> pq = new PriorityQueue<ticket>();
        //while문을 빠져나오기 위한 count변수
        int count = 0;
        //초기 정답 설정
        answer[0] = st;
        
        while(!(count == tickets.length)) {
        	//각 티켓을 비교하기위한 for문
        	for (int i = 0; i < tickets.length; i++) {
        		//각 티켓의 출발지와  st를 비교하여 출발점이 일치하는지 비교하고 방문여부를 확인
				if(tickets[i][0].equals(st) && !(check[i]==true)) {
					//조건이 맞는다면 우선순위큐에 넣는다
					pq.add(new ticket(i,tickets[i][1]));
					
				}
			}
        	//우선순위 큐를 처리하는 함수 그리고 리턴값으로 출발점을 변경한다.
        	st =select(pq);
        	
        	count++;
        	//다음으로 정해진 목적지를 정답에 기입
        	answer[count]=st;
        }
        return answer;
    }
    //우선순위 큐에서 가장 알파벳이 앞선 변수를 빼고, 방문확인 및 q를 초기화 시키는 과정
    public String select(PriorityQueue<ticket> pq) {
    	ticket q =pq.poll();
    	check[q.index] = true;
    	pq.clear();
    	
    	return q.end;
    }
    //우선순위 큐에 들어갈 노드를 만들고 정렬을 방법을 설정한다.
    class ticket implements Comparable<ticket>{
    	String end;
    	int index;
		public ticket(int index, String end) {
			super();
			this.index = index;
			this.end = end;
		}
		@Override
		public int compareTo(ticket o) {
			return end.compareTo(o.end);
			
			
		}
    	
    }
    
    
}





