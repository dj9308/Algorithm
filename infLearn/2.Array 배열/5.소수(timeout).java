package algorithm;

import java.util.Scanner;

public class Main {
	public int solution(int n) {
		int answer = 0;
		for (int i = 2; i <= n; i++) {
			boolean chk = true;
			for (int j = 2; j < i; j++) {
				if(i%j == 0) {
					chk = false;
					break;
				}
			}
			if(chk) answer++;
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