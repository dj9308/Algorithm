package algorithm;

import java.util.Scanner;

public class Main {
	public int solution(int[][] input) {
		int answer = 0;

		for (int i = 1; i <= input[0].length; i++) {
			for (int j = 1; j <= input[0].length; j++) {
				int cnt = 0;
				for (int k = 0; k < input.length; k++) {
					int pi = 0;
					int pj = 0;
					for (int l = 0; l < input[k].length; l++) {
						if(input[k][l] == i) {
							pi = l;
						}
						if(input[k][l] == j) {
							pj = l;
						}
					}
					if(pi > pj) cnt++;
				}
				if(cnt == input.length) answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] array = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = in.nextInt();
			}
		}
		System.out.println(main.solution(array));
	}
}