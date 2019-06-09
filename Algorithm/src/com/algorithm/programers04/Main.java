package com.algorithm.programers04;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Test t = new Test();
	}
}

/*
 * class Test{ String st[] = {"a","b","c","d"}; int number = 1; HashMap<String,
 * Integer> hm = new HashMap<String, Integer>(); Test(){ for (String s : st) {
 * hm.put(st[0],number); number++; }
 * 
 * 
 * System.out.println(hm.get(st[0])); System.out.println(hm.size()); }
 * 
 * }
 */

class Solution {
	public int[] solution(String[] genres, int[] plays) {
		int[] answer = {};

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		for (int i = 0; i < plays.length; i++) {
			hm.put(plays[i], genres[i]);

		}

		return answer;
	}

}

class Map implements Comparable<HashMap<Integer, String>> {
	private int plays;
	private String genres;
	
	
	
	public Map(int plays, String genres) {
		this.plays = plays;
		this.genres = genres;
	}
	
	



	public int getPlays() {
		return plays;
	}





	public void setPlays(int plays) {
		this.plays = plays;
	}





	public String getGenres() {
		return genres;
	}





	public void setGenres(String genres) {
		this.genres = genres;
	}





	@Override
	public int compareTo(HashMap<Integer, String> o) {
		// TODO Auto-generated method stub
		return ;
	}

}
