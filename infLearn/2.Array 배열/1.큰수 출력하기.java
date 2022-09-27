package algorithm;

import java.util.Scanner;

public class Main {
	public String solution(int [] array) {
		String answer = String.valueOf(array[0]);
		
		for(int i = 1; i<array.length;i++) {
			if(array[i-1] < array[i]) {
				answer += " ";
				answer += String.valueOf(array[i]);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		
		for(int i =0; i<array.length;i++) {
			array[i] = in.nextInt();
		}
		System.out.println(main.solution(array));
	}
}