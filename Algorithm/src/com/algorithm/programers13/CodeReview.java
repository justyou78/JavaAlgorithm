package com.algorithm.programers13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class CodeReview {
	 
    public int solution(int[][] jobs) {
    	//우선순위 큐 오름차순(처리시간기준)
        Queue<Disk> queue = new PriorityQueue<>(Collections.reverseOrder((o1, o2) -> (o2.processTime - o1.processTime)));
        List<Disk> disks = new ArrayList<>();
        int totalTime = 0;
        for (int i = 0; i < jobs.length; i++)
            disks.add(new Disk(jobs[i][0], jobs[i][1]));
 
        Collections.sort(disks, Collections.reverseOrder((o1, o2) -> (o2.requestTime - o1.requestTime)));
       
        int settingTime = disks.get(0).requestTime;
        for (Disk disk : disks) {
        	System.out.println(disk.processTime);
            disk.requestTime -= settingTime;
            totalTime += (disk.processTime + disk.requestTime);
        }
 
        int index = 0;
        int time = 0;
        int sum = 0;
        int job = 0;
        for (int i = 0; i <= totalTime; i++) {
            while(index < disks.size() && i == disks.get(index).requestTime)
                queue.add(disks.get(index++));
 
            if(job == 0 && !queue.isEmpty()) {
                Disk disk = queue.poll();
                job = disk.processTime; // 본인처리시간
                sum += (disk.processTime - disk.requestTime + time); // 본인처시간 - 본인요청시간 + 이전꺼 처리시간
            }
 
            if(job > 0) job--;
 
            time++;
 
        }
 
        return (sum) / jobs.length;
    }
 
    public class Disk {
        public int requestTime;
        public int processTime;
 
        public Disk(int requestTime, int processTime) {
            this.requestTime = requestTime;
            this.processTime = processTime;
        }
 
        @Override
        public String toString() {
            return "Disk{" +
                    "requestTime=" + requestTime +
                    ", processTime=" + processTime +
                    '}';
        }
    }
}