package algorithm;

import java.util.Scanner;

public class Main {
	public String solution(String input) {
		char [] array = input.toCharArray();
		String answer = String.valueOf(array[0]);
		int cnt = 1;
		
		for(int i = 1; i<array.length;i++) {
			
			if(array[i] == array[i-1]) {
				cnt++;
			}else {
				if(cnt != 1) {
					answer+=String.valueOf(cnt);
					cnt = 1;
				}
				answer+=String.valueOf(array[i]);
			}
			
			if(i == array.length-1 && cnt != 1) {
				answer+=String.valueOf(cnt);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		String answer = main.solution(input);
		System.out.println(answer);
	}
}