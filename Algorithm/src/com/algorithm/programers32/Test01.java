package com.algorithm.programers32;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Test01 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
       
        Queue<Integer> qu = new LinkedList<Integer>();
        
        for (int i = 0; i < priorities.length; i++) {
			qu.offer(priorities[i]);
			
		}
        int count = 0;
        while(!qu.isEmpty()) {
        
        	int a = qu.poll();
        	Iterator<Integer> it=qu.iterator();
        	boolean  sw =false;
        	while(it.hasNext()) {
        		
        		int b=it.next();
        		if(a < b) {
        			qu.offer(a);
        			sw =true;
        			

                	
        			break;
        		}
        	
        	}
        
        	
        	System.out.println(location);
        	//빠져 나가는 구간.
    		if(!sw) {
    			count++;
    			if(location == 0) {
    				answer = count;
    				break;
    			}
    		}
    		location--;
        	if(location <0) {
        		location = qu.size()-1;
        	}
        
        }
        
        return answer;
    
    }
}
