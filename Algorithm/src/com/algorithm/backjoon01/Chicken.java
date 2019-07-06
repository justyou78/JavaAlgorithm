package com.algorithm.backjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//백준 알고리즘 치킨배달 문제.
//핵심은 어떻게 총 치킨집갯수에서 치킨거리가 짧은 치킨집갯수를 남기느냐이다.
//나는 모든 치킨집에 대해서 조합으로 모든 경우의수를 확인해보고 내용을 다 저장한 후 짧은 거리의 치킨집을 구하는과정으로 풀이하였다.
public class Chicken {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	//배열의 크기
	int size;
	// 몇개의 치킨집을 남길것인지에 대한 변수
	int MaxChicken;

	public void exe() throws IOException {

		String st = sc.nextLine();
		String st01[] = st.split(" ");
		size = Integer.parseInt(st01[0]);
		MaxChicken = Integer.parseInt(st01[1]);
		
		//각 집의 좌표를 저장할 Arraylist
		ArrayList<Spot> house = new ArrayList<Spot>();
		//각 치킨집의 좌표를 저장할 Arraylist
		ArrayList<Spot> market = new ArrayList<Spot>();

		

		for (int i = 1; i < size+1; i++) {
			String line = br.readLine();
			int j = 1;
			int h = 0, m = 0;

			for (String a : line.split(" ")) {
				if (a.equals("1")) {
					//각 좌표를 저장
					house.add(h, new Spot(i, j));
					h++;
				} else if (a.equals("2")) {
					//각 좌표를 저장
					market.add(m, new Spot(i, j));
					m++;
				}
				
				j++;
			}

		}

//		System.out.println(size + " " + MaxChicken);
//		for (int i = 0; i < house.size(); i++) {
//			System.out.println(house.get(i));
//
//		}
//		for (int i = 0; i < market.size(); i++) {
//			System.out.println(market.get(i));
//
//		}
//
		//총 치킨집에서 MaxChicken 만큼의 치킨집을 추출할 때 필요한 체크 변수
		boolean[] visited = new boolean[market.size()];
		//combination실행
		combination(market, visited, 0, market.size(), MaxChicken, house);
		
		//각 조합마다 가장 작은 치킨거리를 가지고있는 totalsum에서 가장 작은값 추출.
		Collections.sort(totalsum);
		System.out.println(totalsum.get(0));
		
		
		
	}
	//각 조합마다 가장 작은 치킨거리를 가지고있는 Arraylist
	ArrayList<Integer> totalsum = new ArrayList<Integer>();
	
	//조합으로 시장을 구했을 때, 실행될 최단거리를 구하는 알고리즘.
	void getMarket(ArrayList<Spot> market, boolean[] visited, int n, ArrayList<Spot> house) {
		int sum = 0;
		for (int j = 0; j < house.size(); j++) {
			int value = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				if (visited[i] == true) {
					int number=Math.abs((house.get(j).x - market.get(i).x))+
							Math.abs((house.get(j).y - market.get(i).y));
					if(value > number) {
						value = number;
					}
				}
			}
			sum += value;
		}
		totalsum.add(sum);
	}
	//조합으로 치킨집을 구하는 과정.
	void combination(ArrayList<Spot> market, boolean[] visited, int start, int n, int r, ArrayList<Spot> house) {
		if (r == 0) {
			getMarket(market, visited, n, house);
			return;
		} else {
			for (int i = start; i < n; i++) {
				visited[i] = true;
				combination(market, visited, i + 1, n, r - 1,house);
				visited[i] = false;
			}
		}
	}

	

	class Spot {
		int x;
		int y;

		Spot(int i, int j) {
			this.x = i;
			this.y = j;

		}
	}

}
