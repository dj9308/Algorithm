package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public int solution(int n, int m, int[] array) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 0; i < n; i++) {
			queue.add(array[i]);
		}

		int qSize = queue.size();
		int max = queue.poll();
		int cnt = 0;
		boolean maxChk = false;

		for (int i = 0; i < qSize; i++) {
			int num = queue.poll();
			if (num > max) {
				maxChk = true;
			}
			queue.add(num);
		}

		return answer;

	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();
		int[] ary = new int[n];

		for (int i = 0; i < n; i++) {
			ary[i] = in.nextInt();
		}

		System.out.println(main.solution(n, m, ary));

	}
}