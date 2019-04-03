package Gear_problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Gear {
	Scanner sc= new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	LinkedList<Integer>[] ll = (LinkedList<Integer>[]) new  LinkedList[5]; 
	public void exe() throws IOException{
		makeGear();
		test();
		int count = sc.nextInt();
		
		while(count-- > 0){
			int position = sc.nextInt();
			int spin = sc.nextInt();
			left(position-1, -spin);
			right(position+1, -spin);
			rotate(position, spin);
		}
		
		int ans = 0;
		
		for (int i = 1; i <= 4; i++) {
			if(ll[i].get(0) == 1){
				ans += Math.pow(2, i-1);
			}
		}
		System.out.println(ans);
		
	}
	public void makeGear() throws IOException{
		for (int i = 1; i <= 4; i++) {
			String st = br.readLine();
			ll[i] = new LinkedList<Integer>();
			for(String s : st.split("")){
				
				ll[i].offer(Integer.parseInt(s));
			}
		}
		System.out.println("¼º°ø");
	}
	public void test(){
		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(ll[i].get(j));
			}
			System.out.println();
		}
	}
	public void left(int level, int spin){
		if(level < 1){
			return;
		}
		else{
			if(ispossible(level, level+1)){
				left(level-1, -spin);
				rotate(level, spin);
			}
			
		}
		
		
		
	}
	public void right(int level, int spin){
		if(level > 4){
			return;
		}
		else{
			if(ispossible(level, level-1)){
				right(level+1, -spin);
				rotate(level, spin);
			}
		}
	}
	public boolean ispossible(int a, int b){
		if(a < b){
			System.out.println(a);
			if(!(ll[a].get(2) == ll[b].get(6)) ){
				
				return true;
			}
			
			
		}
		else{
			if(ll[a].get(6) != ll[b].get(2) ){
				return true;
			}
			
		}
		return false;
	}
	public void rotate(int level, int spin){
		if(spin > 0){
			ll[level].addFirst(ll[level].pollLast());
		}
		else{
			ll[level].addLast(ll[level].pollFirst());
		}
		
	}
	
}
