package com.algorithm.sds;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		new ColorPaper().testcase();
	}

	
}

class ColorPaper {
	StringTokenizer st;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	//testcase당 결과를 stack에 저장 할 겁니다.
	Stack<Integer> result = new Stack<Integer>();
	
	//5개의 testcase를 돌려주는 과정
	public void testcase() throws IOException {
		//총 testcase입력
		st= new StringTokenizer(br.readLine());
		
		int testcase = Integer.parseInt(st.nextToken());
		for (int i = 0; i < testcase; i++) {
			//N, K 입력
			st =  new StringTokenizer(br.readLine());
			
			int size = Integer.parseInt(st.nextToken());
			int numCount = Integer.parseInt(st.nextToken());
			
			//알고리즘 수행
			go_cal(size, numCount);

		}
		
		//결곽 출력과정
		for (int i = 0; i < result.size(); i++) {
			System.out.println("#"+(i+1)+" "+result.get(i));
		}

	}
	public void go_cal(int size, int numCount) throws IOException {
		//배열 입력.
		st =new StringTokenizer(br.readLine()); 
		
		//0과 숫자의 갯수를 세기위한 변수
		int count = 0;
		// for문의 시작지점을 정하기위한 변수
		int start = 0;
		//1부터 numCount까지의 숫자가 있는지 아니면 0밖에 없는지 체크하기위한 boolean값
		boolean check = false;
		//배열의 1,2,3...numCount or 0  의 count를 세서 저장할 stack변수 
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> tokenStack = new Stack<Integer>();
		while(st.hasMoreTokens()) {
			tokenStack.add(Integer.parseInt(st.nextToken()));
		}
		
		for (int i = 1; i <= numCount; i++) {
			
			for (int j = start; j < tokenStack.size(); j++) {
				int number = tokenStack.get(j);
				
				
				if(number == 0)  {
					count++;
				}
				else if(number == i) {
					//마지막으로 0이아닌 숫자가 발견된 위치를알고 그다음 부터 for문을 돌리기위해 start를 변형시켰음.
					start = j+1;
					count++;
					//실제 숫자 1...numCount 사이의 숫자가 있는지 확인.
					check =true;
					
				}
				else {
					//i가 아닌 다른 숫자가 나오면 break
					break;
				}
			}
			
			//testcase4번째의경우 즉, 모두 0인경우 for문 종료시키고 stack에 저장하고 끝낸다.
			if(!check && count == size) {
				stack.add(size - numCount+1);
				break;
			}
			
			//각 i별로 stack에 count값 저장.
			stack.add(count);
			//count 초기화
			count = 0;
			
			//i == 1 인데 배열에 1이 없는경우 그다음 배열은 count를 하나줄인다
			if(i == 1 && !check) {
				count--;
			}
			// i가 1 과 마지막 숫자가 아니고, 배열에 그 숫자가 없는경우 앞과 뒤의 숫자를 조정해준다.
			else if(!check) {
				count--;
				
				stack.set(stack.size()-2, stack.get(stack.size()-2)-1);
			}
			// i == numCount 이고 배열에 숫자가 없는경우 이전 숫자만 줄여준다.
			else if(i == numCount && !check) {
				stack.set(stack.size()-2, stack.get(stack.size()-2)-1);
					
			}
			
			
			check = false;
			
			
		}

		//stack을 정렬해서 내림차순 정렬
		Collections.sort(stack);
		Collections.reverse(stack);
		
		//높은 값만 출력
		result.add(stack.get(0));
		
		
		
	}
}
