package algorithm;

import java.util.Scanner;

public class Main {
	public String solution(int n) {
		String answer = "1 1";
		int num1 = 1, num2 = 1;

		for (int i = 2; i < n; i++) {
			if(i <n) answer+= " "; 
				
			int sum = num1+num2;
			num1 = num2;
			num2 = sum;
			answer += String.valueOf(sum);
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