package Dfs_test;

import java.util.Arrays;

public class Dfs {
	int depth;
	boolean isvisited[] ;

	public void exe(){
	depth = 6;
	isvisited = new boolean[depth];
	Arrays.fill(isvisited, false);
	dfs(0,0);
	
	}
	public void dfs(int level, int val){
		if(level == 3){
			for (int i = 0; i < depth; i++) {
				if(isvisited[i]== true){
					System.out.print(i+ " ");
					
				}
			}
			System.out.println();
		}else{
			for (int i = val; i < depth; i++) {
				isvisited[i] = true;
				dfs(level+1,i+1);
				isvisited[i]=false;
				
			}
		}
		
		
	}
}
