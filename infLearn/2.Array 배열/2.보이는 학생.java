package algorithm;

import java.util.Scanner;

public class Main {
	public int solution(int [] array) {
		int answer = 1;
		int max = array[0];
		
		for(int i = 1; i<array.length;i++) {
			if(max < array[i]) {
				answer++;
				max = array[i];
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