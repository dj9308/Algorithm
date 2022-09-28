package algorithm;

import java.util.Scanner;

public class Main {
	public String solution(int[] input) {
		String answer = "";

		for (int i = 0; i < input.length; i++) {
			int cnt = 1;
			for (int j = 0; j < input.length; j++) {
				if (i != j && input[i] < input[j]) {
					cnt++;
				}
			}
			answer += String.valueOf(cnt);
			if(i < input.length-1) answer+=" ";
		}
		return answer;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		System.out.println(main.solution(array));
	}
}