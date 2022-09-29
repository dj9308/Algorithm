package algorithm;

import java.util.Scanner;

public class Main {
	public int solution(int[][] input) {
		int answer = 0;
		boolean topChk = true;

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				int cur = input[i][j];
				if (i != 0 && cur <= input[i - 1][j]) {
					topChk = false;
				} else if (i != input.length - 1 && cur <= input[i + 1][j]) {
					topChk = false;
				} else if (j != 0 && cur <= input[i][j - 1]) {
					topChk = false;
				} else if (j != input.length - 1 && cur <= input[i][j + 1]) {
					topChk = false;
				} else {
					topChk = true;
				}

				if (topChk)
					answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] array = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = in.nextInt();
			}
		}

		System.out.println(main.solution(array));
	}
}