package com.algorithm.programers07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
 
class Truck {
    int weight;
    int distance;
    
    public Truck(int weight, int distance) {
        this.weight = weight;
        this.distance = distance;
    }
}
 

class OtherSolution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int weightLeft = weight;
        Truck truck = null;
        
        Queue<Truck> outside = new LinkedList<Truck>();
        List<Truck> inside = new ArrayList<Truck>();
 
        for (int t : truck_weights) {
            outside.add(new Truck(t, bridge_length));
        }
 
        while (!(inside.isEmpty()&&outside.isEmpty())) {
            time++;
            
            if (!inside.isEmpty() && inside.get(0).distance <= 0) {
                weightLeft += inside.get(0).weight;
                inside.remove(0);
            }
            
            if (!outside.isEmpty() && weightLeft - outside.peek().weight >= 0) {
                weightLeft -= outside.peek().weight;
                inside.add(outside.poll());
            }
            
            for (int i = 0; i < inside.size(); i++) {
                truck = inside.get(i);
                truck.distance--;
            }
        }
        return time;
    }
}
