package com.example.hash;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * HashMap과 HashTable의 차이점
 * !HashMap 
 * -> put, get 사용, synchronized(동기화) 키워드가 없어!
 * -> key와 value에 null을 입력 할 수 있어!
 * !HashTable
 * -> put get 사용 , synchronized(동기화) 키워드가 있어!
 * -> key와 value에 null을 입력 할 수 없어
 * **해쉬맵을 머티쓰레드 환경에서 사용하지 않는 걸 권장한다.
 * **단일쓰레드에서는 동기화비용이 적은 hashmap을 시용하는게 빠르다.
 */

//hashtable과 hashmap의 동기화 차이를 확인하기 위한 코드
public class Main {
	private static final int MAX_THREAD = 10;
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		
		ExecutorService es = Executors.newFixedThreadPool(MAX_THREAD);
		
		for (int i = 0; i < MAX_THREAD; i++) {
			es.execute(new Runnable() {
				
				@Override
				public void run() {
					for (int j = 0; j < 1000; j++) {
						
						String key = String.valueOf(j);
						
						hm.put(key, j);
						ht.put(key, j);
						
						
					}
				}
			});
			
		}
		
		es.shutdown();
		try {
			es.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(hm.size());
		System.out.println(ht.size());
		
		
		
		
		
		
	}
}
