package com.example.heap;

import java.io.ObjectInputStream.GetField;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;


//완전이진트리형태야
//최대힙과 최소힙이 있어.
//보통 배열로 만들지. 이유 ? ->데이터 삽입할 때 마지막 끝에 데이터를 삽입하고
//위로 올라가면서 위치를 정해주는데 마지막에 데이터삽입시 링크드리스트를 사용하면 시간이 오래걸려
//대표적으로 힙을 사용하는 프레임은 우선순위 큐야

//밑의 내용은 우선순위 큐를 사용하는 예시야
public class Main {
	private static  PriorityQueue<Prisoner> getPriorityQueue(){
		Prisoner prisoner1 = new Prisoner("james", 5);
		Prisoner prisoner2 = new Prisoner("schofield", 99);
		Prisoner prisoner3 = new Prisoner("alex", 14);
		Prisoner prisoner4 = new Prisoner("silvia", 10);
		Prisoner prisoner5 = new Prisoner("thomson", 1);
		
		
		PriorityQueue<Prisoner> priorityQueue = new PriorityQueue<Prisoner>();
		
		priorityQueue.offer(prisoner1);
		priorityQueue.offer(prisoner2);
		priorityQueue.offer(prisoner3);
		priorityQueue.offer(prisoner4);
		priorityQueue.offer(prisoner5);
		
		
		return priorityQueue;
	}
	public static void main(String[] args) {
		
		
		PriorityQueue<Prisoner> priorityQueue = getPriorityQueue();
//		
//		System.out.println("====================== ");
//		while(!priorityQueue.isEmpty()) {
//			Prisoner prisoner = priorityQueue.poll();
//			System.out.println(prisoner.name);
//		}
		
		//////////////////////////////////////////////
		// 형량이 높은 죄수부터 출력.
		PriorityQueue<Prisoner> reversedPriorityQueue = 
				new PriorityQueue<Prisoner>(priorityQueue.size(),
						Collections.reverseOrder());
		reversedPriorityQueue.addAll(priorityQueue);
		
		System.out.println("======================== Reversed order!");
		while(!reversedPriorityQueue.isEmpty()) {
			Prisoner prisoner02 = reversedPriorityQueue.poll();
			System.out.println(prisoner02.name);
		}
		
		
		
	}
}

//integer형을 이용한 비교
class Prisoner implements Comparable<Prisoner>{
	String name;
	int sentence ; // 형량
	
	
	public Prisoner(String name, int sentence) {
		super();
		this.name = name;
		this.sentence = sentence;
	}


	@Override
	public int compareTo(Prisoner target) {
		if(this.sentence > target.sentence)
		{
			return 1;
		}
		else if(this.sentence < target.sentence)
		{
			return -1;
		}
		return 0;
	}
	
}
//String형을 이용한 비교
class TT implements Comparable<TT>{

	String name;
	
	public TT(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(TT o) {
		return name.compareTo(o.name);
	}
	
}




