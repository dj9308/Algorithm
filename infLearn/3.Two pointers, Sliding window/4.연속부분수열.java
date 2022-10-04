package algorithm;

import java.util.Scanner;

public class Main {
	public int solution(int k, int[] array) {
		int answer = 0, lt = 0, max = 0;

		for (int i = 0; i < array.length; i++) {
			max += array[i];
			
			if(max == k) answer++;
			
			while(max>=k) {
				max -= array[lt++];
				if(max == k) answer++;
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