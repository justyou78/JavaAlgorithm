package com.algorithm.programers02;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		String st[][]= new String[3][3];
		System.out.println(st.length);
	}
}

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
        for (int i = 0; i < clothes.length; i++) {
			if(ht.get(clothes[i][1]) ==null) {
				ht.put(clothes[i][1],1);
			}
			else {
				int value =+ ht.get(clothes[i][1]);
				ht.put(clothes[i][1],value);
			}
		}
        
        int arr[] = new int[ht.size()];
        int i =0;
        Set<String> keySet = ht.keySet();
        Iterator<String>iter = keySet.iterator();
        while(iter.hasNext()) {
        	String key = iter.next();
        	arr[i] = ht.get(key);
        	i++;
        }
        
        for (int j = 0; j < arr.length; j++) {
			recall(j+1, arr);
		}
      
        
        
        
        return answer;
        
        
    }
    
    void recall(int j, int arr[]) {
    	if(j == arr.length) {
    		return;
    	}
    	else {
    		for (int i = j; i < arr.length; i++) {
    			
    		}
    	}
    	
    }
}


