package com.algorithm.nhn;

import java.util.ArrayList;
import java.util.Scanner;

import java.io.*;

/*
 * class Main { public static void main(String[] args) throws Exception {
 * Scanner sc = new Scanner(System.in); int num =
 * Integer.parseInt(sc.nextLine()); ArrayList<Person> al = new
 * ArrayList<Person>(); for (int i = 0; i < num; i++) { al.add(new Person(0,
 * null)); } String getst = sc.nextLine(); String st[] = getst.split(" "); int
 * index = 0; int count = 0;
 * 
 * for (int i = 0; i < st.length; i++) { index = i - count; if
 * (st[i].equals("A")) { al.get(index % num).candy++; if (al.get(index %
 * num).follower != null) { al.get(index % num).follower.candy++; } } else if
 * (st[i].equals("J")) { int checksize = 0; ;
 * 
 * // 0인덱스 친구의 옆친구를 줄때. if ((i - 1) < 0) { checksize = al.size() - 1;
 * 
 * } else { checksize = index - 1; } al.get(checksize).candy++; al.get((index +
 * 1) % num).candy++;
 * 
 * 
 * 
 * 
 * while (al.get((index+1)%num).follower.size()!=0) { if
 * (al.get(checksize).follower != null) { } }
 * 
 * } else if (st[i].equals("Q")) { for (int j = 0; j < al.size(); j++) {
 * al.get(j).candy++; } } else if (st[i].equals("K")) {
 * System.out.println(st[i]); al.get(i % num).follower =
 * al.get(Integer.parseInt(st[i + 1])); i++; count++; } } for (int i = 0; i <
 * al.size(); i++) { System.out.print(al.get(i).candy + " "); if (i == al.size()
 * - 1) { System.out.print(al.get(i).candy); } }
 * 
 * } }
 * 
 * class Person { int candy = 0; ArrayList<Person>follower = new
 * ArrayList<Person>();
 * 
 * Person(int candy, Person follower) { this.candy = candy;
 * this.follower.add(follower); }
 * 
 * }
 */