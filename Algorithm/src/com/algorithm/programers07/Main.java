package com.algorithm.programers07;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		int a[] = {7,4,5,6};
		Solution_List sl = new Solution_List();
		System.out.println(sl.solution(2, 10, a));
	}
}
//내풀이
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        //정답을 넣을변수
    	int answer = 0;
        //시간을 넣을 변수
        int time = 0;
        //원래의 무게로 되돌리기 위한 변수 생성
        int fixedweight = weight;
        
        //다리에 트럭이 추가 될 때마다 갯수 증가
        int count = -1;
        
        
        for (int i = 0; i < truck_weights.length; i++) {
        	//트럭이 다리에 올라간 경우.
        	if(weight >= truck_weights[i]) {
        		weight = weight - truck_weights[i];
        		count++;
        		
        		
        		//마지막트럭이 올 때, else문이 돌아가지 않아 그래서 마지막 for문이 들어갈때 else문의 시간을 추가하는 과정을 이곳에다 넣어놨어.
        		if(i == truck_weights.length-1) {
        			time = time + bridge_length+count;
	
        		}
        		
        	}
        	
        	//시간을 증가시키고, count를 초기화, 무게 초기화, i값이 고려되지 않아서 한칸 뒤로 움직인다.
        	else {
        		time = time + bridge_length+count;

        		count = -1;
        		weight = fixedweight;
        		//이거 때문에 성능이 떨어지는 건가 ?.....
        		//음... 그럼 리스트에 집어 넣어서 문제를 풀어볼까 ?
        		//그래 한번해보장..귀찮지만..
        		i--;
        	}
        	
        	
		}
        
        answer = time;
        return ++answer;
    }
}
//결국 배열의 문제는 아니엿다... 잘모르겟다... 문제점을 알고싶다...
//다음문제부터는 각 개체를 만들어서 실행해볼까...
class Solution_List{
	 public int solution(int bridge_length, int weight, int[] truck_weights) {
		  //정답을 넣을변수
	    	int answer = 0;
	        //시간을 넣을 변수
	        int time = 0;
	        //원래의 무게로 되돌리기 위한 변수 생성
	        int fixedweight = weight;
	        
	        //다리에 트럭이 추가 될 때마다 갯수 증가
	        int count = -1;
	        
	        LinkedList<Integer> ll = new LinkedList<Integer>();
	        
	        
	        for (int i = 0; i < truck_weights.length; i++) {
				ll.add(truck_weights[i]);
				
			}
	        
	        System.out.println(ll.toString());
	        
	        
	        while(!ll.isEmpty()) {
	        	System.out.println("gogo");
	        	int truck = ll.pop();
	        	if(weight >= truck ) {
	        		weight = weight -truck ;
	        		count++;
	        		
	        		
	        		//마지막트럭이 올 때, else문이 돌아가지 않아 그래서 마지막 for문이 들어갈때 else문의 시간을 추가하는 과정을 이곳에다 넣어놨어.
	        		if(ll.isEmpty()) {
	        			time = time + bridge_length+count;
		
	        		}
	        		
	        	}
	        	
	        	//시간을 증가시키고, count를 초기화, 무게 초기화, i값이 고려되지 않아서 한칸 뒤로 움직인다.
	        	else {
	        		time = time + bridge_length+count;

	        		count = -1;
	        		weight = fixedweight;
	        		//이거 때문에 성능이 떨어지는 건가 ?.....
	        		//음... 그럼 리스트에 집어 넣어서 문제를 풀어볼까 ?
	        		//그래 한번해보장..귀찮지만..
	        		ll.addFirst(truck);
	        	}
	        	
	        }
	        
	        
	        
	        answer = time;
	        
	        
	        return ++answer;
	 }
	
	
}