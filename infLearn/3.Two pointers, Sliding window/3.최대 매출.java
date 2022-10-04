package algorithm;

import java.util.Scanner;

public class Main {
	public int solution(int k, int[] array) {
		int answer = 0;
		
		for (int i = 0; i < k; i++) {
			answer += array[i];
		}
		
		int sum = answer;

		for (int i = k; i < array.length; i++) {
			 sum = sum - array[i - k] + array[i];
			if(sum > answer) {
				answer = sum;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}

		System.out.println(main.solution(k, array));

	}
}