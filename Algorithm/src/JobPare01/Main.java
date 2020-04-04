package JobPare01;

public class Main {
	public static void main(String[] args) {

	}
}

class Solution {
	public int solution(String[] bishops) {
		int answer = 0;
		int x[] = { -1, 1, 1, -1 };
		int y[] = { -1, -1, 1, 1 };
		/*
		 * boolean 8사이즈만큼 생성하고 좌상 우상 우하 좌하 이동 좌상에서 체스말 만나면 우상으로 이동
		 * 
		 * 
		 */
		char a = 'A';

		boolean isPosiible[][] = new boolean[8][8];

		//비숍꺼내서
		for (int i = 0; i < bishops.length; i++) {
			//비숍의 좌표
			String []sp = bishops[i].split("");
			int spot[] = new int[2];
			
			
			spot[0] = (bishops[i].charAt(0) -a );
			spot[1] = Integer.parseInt(sp[1])-1;
		
			// 각축으로 이동
			for (int j = 0; j < x.length; j++) {
				//이동하는 비숍
				int move = spot[0];
				int move2 = spot[1];
				System.out.println(move+ " "+  move2);
				//마방진 내에있어야한다.
				while(move >= 0 && move < 8 && move2>= 0 && move2 <8) {
					System.out.println("test");
					isPosiible[move][move2] = true;
					move += x[j];
					move2 += y[j];
				}
				
			}

		}
		// 비숍이 가지 못하는 공간  
		for (int i = 0; i < isPosiible.length; i++) {
			for (int j = 0; j < isPosiible.length; j++) {
				if(!isPosiible[i][j]) {
					System.out.print(isPosiible[i][j] +" ");
					answer++;
				}
				else {
					System.out.print("\t\t");
				}
			}
			System.out.println();
		}
		return answer;
	}
}
