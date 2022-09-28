package algorithm;

import java.util.Scanner;

public class Main {
	public int solution(int n) {
		int answer = 0;
		int[] array = new int[n + 1];

		for (int i = 2; i <= n; i++) {
			if (array[i] == 0) {
				answer++;
				for (int j = i; j <= n; j=j+i) {
					array[j] = j;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		System.out.println(main.solution(n));
	}
}