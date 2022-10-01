package algorithm;

import java.util.Scanner;

public class Main {
	public int solution(int[][] input) {
		int answer = 1;
		int max = 0;
		int cnt;

		for (int i = 0; i < input.length; i++) {
			cnt = 0;
			for (int j = 0; j < input.length; j++) {
				for (int k = 0; k < 5; k++) {
					if(i != j && input[i][k] == input[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt > max) {
				max = cnt;
				answer = i+1;
			}
//			System.out.println(i+": "+cnt+" : "+max);
			
		}

		return answer;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
//		int m = in.nextInt();
		int[][] array = new int[n][5];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = in.nextInt();
			}
		}

		System.out.println(main.solution(array));
	}
}