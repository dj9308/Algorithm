package algorithm;

import java.util.Scanner;

public class Main {
	public int solution(int[][] input) {
		int answer = 0;
		int[] cntAry ;
		boolean[][] chkAry; 
		
		cntAry = new int[input.length];
		chkAry = new boolean [input.length][input.length];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < input.length; j++) {
				for (int k = j+1; k < input.length; k++) {
					if(input[j][i] == input[k][i]) {
						chkAry[j][k] = chkAry[k][j] = true;
					}
				}
			}
		}
		
		for (int i = 0; i < chkAry.length; i++) {
			for (int j = 0; j < chkAry[i].length; j++) {
				if(chkAry[i][j]) cntAry[i]++;
			}
		}
		
		for (int i = 1; i < cntAry.length; i++) {
			answer = cntAry[i] > cntAry[answer] ? i : answer;
		}
		
		answer++;

		return answer;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] array = new int[n][5];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = in.nextInt();
			}
		}

		System.out.println(main.solution(array));
	}
}