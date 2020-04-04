package JobPare04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {

	}
}

class Solution {
	public int solution(int[] goods, int[] boxes) {
		int answer = 0;
		/*
		 * 둘다 내림차순 정렬하고 가장큰 상품관 가자큰 박스를 비교 조건에 맞으면 박스 하나 없애고 상품 다음 인덱스값으로 넘어간다.
		 * 
		 * 
		 */

		ArrayList<Integer> good = new ArrayList<Integer>();
		for (int i = 0; i < goods.length; i++) {
			good.add(goods[i]);
		}
		ArrayList<Integer> box = new ArrayList<Integer>();
		for (int i = 0; i < boxes.length; i++) {
			box.add(boxes[i]);
		}

		Collections.sort(good, Collections.reverseOrder());
		Collections.sort(box, Collections.reverseOrder());
		for (int i = 0; i < good.size(); i++) {
			
			// 가장큰 박스와 가장큰 상품 비교
			// 박스를 다 소진 == 더이상 넣을 것이 없다.
			if (!box.isEmpty()) {
				if (good.get(i) <= box.get(0)) {
					// 박스 존재
					box.remove(0);
					answer++;
				}
			}
			//박스 다 소진시
			else {
				break;
			}
        }
	
		return answer;
	}
}