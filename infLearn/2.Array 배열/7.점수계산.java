package algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public int solution(int[] input) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < input.length; i++) {
			if (input[i] == 1) {
				stack.push(1);
			} else {
				int cnt = 1;
				while (stack.size() > 0) {
					answer += stack.pop()*cnt++;
				}
			}
		}
		
		int cnt = 1;
		while (stack.size() > 0) {
			answer += stack.pop()*cnt++;
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