//package StartAndLink_problem;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class StartAndLink {
//	Scanner sc = new Scanner(System.in);
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	int n;
//	boolean team[] ;
//	int arr[][];
//	int ans = Integer.MAX_VALUE;
//	public void exe() throws IOException {
//		n = sc.nextInt();
//		arr= new int[n][n];
//	for (int i = 0; i < n; i++) {
//			String st = br.readLine();		StringTokenizer stz = new StringTokenizer(st);
//
//			for (int j = 0; j < n; j++) {
//				arr[i][j] = Integer.parseInt(stz.nextToken());
//
//			}
//		}
//		team= new boolean[n];
//		
//		Arrays.fill(team, false);
//	
//		
//		dfs(0,0);
//		System.out.println(ans);
//		
//	}
//	public void dfs(int val, int level){
//		if(level == n/2){
//			int a = setting();
//
//			if(ans > a){
//				ans = a;
//			}
//		}
//		else{
//			for (int i = val; i < n; i++) {
//				team[i] = true;
//				dfs(i+1,level+1);
//				team[i] = false;
//				
//			}
//		}
//	}
//	
//	public int setting(){
//		int[] a = new int[n/2+1];
//		int[] b = new int[n/2+1];
//		int ai = 0 ; int bi = 0;
//		for (int i = 0; i < n; i++) {
//			if(team[i] == true){
//				a[ai++] = i;
//				System.out.println(i);
//			}
//			else{
//				b[bi++] = i;
//				
//			}
//		}
//		int sum;
//		
//		int asum = calculator(a);
//		int bsum = calculator(b);
//		sum = Math.abs(asum-bsum);	
//		return sum;
//	}
//	private int calculator(int[] arr){
//		int result = 0;
//		
//		for (int i = 0; i < n/2; i++) {
//			for (int j = i+1; j < n/2; j++) {
//				result += this.arr[arr[i]][arr[j]];
//				result += this.arr[arr[j]][arr[i]];
//			}
//		}
//		return result;
//	}
//
//}
