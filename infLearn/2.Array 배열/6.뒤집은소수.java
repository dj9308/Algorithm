package algorithm;

import java.util.Scanner;

public class Main {
	public String solution(String[] input) {
		String answer = "";
		String[] array = new String[input.length];
		int num;

		for (int i = 0; i < input.length; i++) {
			num = Integer.parseInt(new StringBuilder(input[i]).reverse().toString());
			boolean numChk = true;
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					numChk = false;
					break;
				}
			}
			if (numChk && num != 1) {
				answer += String.valueOf(num);
				if (i < array.length - 1)
					answer += " ";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] array = new String[n];
		
		for(int i=0;i<n;i++) {
			array[i] = in.next();
		}

		System.out.println(main.solution(array));
	}
}