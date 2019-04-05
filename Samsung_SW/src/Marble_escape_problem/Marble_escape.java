package Marble_escape_problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Marble_escape {
	int dx[] = { 0, -1, 0, 1 };
	int dy[] = { -1, 0, 1, 0 };
	int n;
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String arr[][];
	Queue<Qdata> que = new LinkedList<Qdata>();
	public void toprint(){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public void exe() throws IOException {
		n = sc.nextInt();
		arr = new String[n][n];
		position r = new position();
		position b = new position();

		for (int i = 0; i < n; i++) {
			String st = br.readLine();
			int j = 0;
			for (String s : st.split("")) {
				if (s.equals("R")) {
					r.x = i;
					r.y = j;
					arr[i][j] = ".";
				} else if (s.equals("B")) {
					b.x = i;
					b.y = j;
					arr[i][j] = ".";
				}

				arr[i][j] = s;
				j++;
			}
		}
		toprint();
		int ans = -1;
		Qdata qdata = new Qdata(r, b, 0);
		que.add(qdata);
		boolean isthere[][][][] = new boolean[n][n][n][n];
	//	Arrays.fill(isthere, false);
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				for(int k=0;k<n;k++)			
					Arrays.fill(isthere[i][j][k], false); 
		isthere[r.x][r.y][b.x][b.y]= true;
		
		
		while (!que.isEmpty()) {
			Qdata now = que.poll();
			r = now.red;
			b = now.blue;
			int number = now.count + 1;
			
			for (int i = 0; i < 4; i++) {
				System.out.println(i);
				position nr = new position(r.x, r.y);
				position nb = new position(b.x, b.y);
					while (!(arr[nr.x + dx[i]][nr.y + dy[i]].equals("#"))) {
						
						nr.x = nr.x + dx[i];
						nr.y = nr.y + dy[i];
						System.out.println(nr.x + " " + nr.y);
						if (arr[nr.x][nr.y].equals("O")) break;
					}
					
					
					while (!(arr[nb.x + dx[i]][nb.y + dy[i]].equals("#"))) {
						
						nb.x = nb.x + dx[i];
						nb.y = nb.y + dy[i];
						System.out.println("!!!! " + nb.x + " " + nb.y);
						if (arr[nb.x][nb.y].equals("O")) break;
					}
					
				

				if (arr[nb.x][nb.y].equals("O"))
					continue;

				if (arr[nr.x][nr.y].equals("O")) {
					System.out.println(number);
					System.exit(0);
				}

				if (nr.x == nb.x && nr.y == nb.y) {
					if (!(dx[i] == 0)) {
						if (r.x * dx[i] > b.x * dx[i]) {
							nb.x = nb.x - dx[i];
						} else {
							nr.x = nr.x - dx[i];
						}
					} else {
						if (r.y * dy[i] > b.y * dy[i]) {
							nb.y = nb.y - dy[i];
						} else {
							nr.y = nr.y - dy[i];
						}
					}
				}
				if (isthere[nr.x][nr.y][nb.x][nb.y] == true) continue;

					
				que.add(new Qdata(nr, nb, number));

				isthere[nr.x][nr.y][nb.x][nb.y] = true;

			}

		}
		System.out.println(ans);
	}

	public void move() {

	}

	class Qdata {
		position red;
		position blue;
		int count;

		Qdata(position r, position b, int count) {
			this.red = r;
			this.blue = b;
			this.count = count;

		}
	}

	class position {
		int x;
		int y;

		position(int x, int y) {
			this.x = x;
			this.y = y;

		}

		position() {

		}
	}
}
