package algorithm;

import java.util.Scanner;

public class Main {
	public int solution(int[][] input) {
		int answer = 0;
		boolean[][] chkAry;
		
		chkAry = new boolean[input[0].length][input[0].length];
		
		for(int i =0;i<input.length;i++) {
			for(int j =0;j<input[i].length;j++) {
				for(int k =j+1;k<input[i].length;k++) {
					chkAry[input[i][j]-1][input[i][k]-1] = true;
				}
			}
			
		}
		

		for(int i =0;i<chkAry.length;i++) {
			for(int j =0;j<chkAry[i].length;j++) {
				if(chkAry[i][j] != chkAry[j][i]) {
					answer++;
				}
			}
		}
		answer/=2;
		
		return answer;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] array = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = in.nextInt();
			}
		}

		System.out.println(main.solution(array));
	}
}