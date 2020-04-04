package com.algorithm.programers32;

import java.util.LinkedList;
import java.util.Queue;

class Truck{
	int weight;
	int distance;
	Truck(int weight, int distance){
		this.weight = weight;
		this.distance= distance;
		
	}
}

class Solution02 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
      
        Queue<Truck> outside = new LinkedList<Truck>();
        LinkedList<Truck> inside= new LinkedList<Truck>();
        
        for (int i = 0; i < truck_weights.length; i++) {
			outside.offer(new Truck(truck_weights[i], bridge_length));
			
		}
        int time = 0;
       int valueableW = weight;
        while(!(inside.isEmpty() && outside.isEmpty()) )
        {
        	time++;
        	
        	if(!(inside.isEmpty())&&inside.get(0).distance ==0) {
        		Truck t = inside.poll();
        		valueableW += t.weight;
        		
        	}
        	
        	if(!(outside.isEmpty())&&valueableW >= outside.peek().weight) {
        		valueableW -= outside.peek().weight;
        		Truck t =outside.poll();
        		//System.out.println(t.weight);
        		
        		inside.add(t);
        		
        	}
        	
        	
        	for (int i = 0; i < inside.size(); i++) {
				inside.get(i).distance--;
				System.out.println(inside.get(i).distance);
				
			}
        	
        	
        	
        }
       
        
        
        
        
        return time;
    }
}