package com.example.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) {
    	String barcode = "1110154001001";
    	String[] barcodes = barcode.split("");
    	int odd = 0;
    	int even = 0;
    	for (int i = 0; i < barcodes.length; i++) {
			if(i % 2 == 0) {
				odd += Integer.parseInt(barcodes[i]);
				
			}
			else {
				even += Integer.parseInt(barcodes[i]);
			}
		}
    	System.out.println(odd);
    	System.out.println(even);
	}
}



class Jobs implements Comparable<Jobs>{
	int time;
	int job;
	Jobs(int time, int job){
		this.time = time;
		this.job = job;
	}
	@Override
	public int compareTo(Jobs o) {
		if(this.job> o.job) {
			return 1;
			
		}
		else if(this.job == o.job) {
			return 0;
			
		}
		else {
			return -1;
		}
	}
}
