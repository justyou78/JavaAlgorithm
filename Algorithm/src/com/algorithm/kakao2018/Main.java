package com.algorithm.kakao2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		String st[] = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };
		String st2[] = s.solution(st);
		for (int i = 0; i < st2.length; i++) {
			System.out.println(st2[i]);
		}
	}

}

class Solution {
	/*
	 * 각 아이디마다 닉네임을 저장한 해쉬맵 enter와 leave는 아이디를 써주고데이터 닉네임입력해주자. enter 해쉬맵 변경시키고
	 * change는 해쉬맵의 내용을 변경시키자. 다돌리고 answer를 for문돌려서 id를 닉네임으로 변경시킬게.
	 * 
	 * 
	 */
	HashMap<String, String> hm = new HashMap<String, String>();
	ArrayList<String> al = new ArrayList<String>();

	public String[] solution(String[] record) {

		for (int i = 0; i < record.length; i++) {
			String[] info = record[i].split(" ");
			switch (info[0]) {
			case "Enter":
				enter(info);
				break;
			case "Leave":
				leave(info);
				break;
			case "Change":
				change(info);
				break;

			}
		}

		for (int i = 0; i < al.size(); i++) {
			String st[] = al.get(i).split(" ");
			String nickname = hm.get(st[0]);
			al.set(i, nickname + "님이 " + st[1]);
		}
		String answer[] = new String[al.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = al.get(i);
		}

		return answer;

	}

	public void enter(String[] info) {
		al.add(info[1] + " 들어왔습니다.");
		// 별명변경
		hm.put(info[1], info[2]);

	}

	public void leave(String[] info) {
		al.add(info[1] + " 나갔습니다.");

	}

	public void change(String[] info) {
		// 별명변경
		hm.put(info[1], info[2]);
	}

}
