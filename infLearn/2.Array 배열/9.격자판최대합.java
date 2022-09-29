package algorithm;

import java.util.Scanner;

public class Main {
	public int solution(int[][] input) {
		int answer = 0;
		int num = 0;

		// 가로
		for (int i = 0; i < input.length; i++) {
			num = 0;
			for (int j = 0; j < input.length; j++) {
				num += input[i][j];
			}
			if (answer < num)
				answer = num;
		}

		// 세로
		for (int i = 0; i < input.length; i++) {
			num = 0;
			for (int j = 0; j < input.length; j++) {
				num += input[j][i];
			}
			if (answer < num)
				answer = num;
		}

		// 대각선
		num = 0;
		for (int i = 0; i < input.length; i++) {
			num += input[i][i];
		}
		if (answer < num)
			answer = num;

		num = 0;
		for (int i = input.length - 1; i >= 0; i--) {
			num += input[i][i];
		}
		if (answer < num)
			answer = num;

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