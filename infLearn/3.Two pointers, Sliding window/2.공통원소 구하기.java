package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public ArrayList<Integer> solution(int[] input1, int[] input2) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int pi = 0, pj = 0;
		Arrays.sort(input1);
		Arrays.sort(input2);
		
		while(pi <input1.length && pj < input2.length) {
			if(input1[pi] > input2[pj]) {
				pj++;
			}else if(input1[pi] < input2[pj]) {
				pi++;
			}else {
				answer.add(input1[pi++]);
				pj++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] input1 = new int[n];

		for (int i = 0; i < input1.length; i++) {
			input1[i] = in.nextInt();
		}

		int m = in.nextInt();
		int[] input2 = new int[m];

		for (int i = 0; i < input2.length; i++) {
			input2[i] = in.nextInt();
		}

		java.util.ArrayList<Integer> list = main.solution(input1, input2);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			if (i < list.size() - 1)
				System.out.print(" ");
		}
	}
}