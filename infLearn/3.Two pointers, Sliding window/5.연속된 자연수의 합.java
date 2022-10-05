package algorithm;

import java.util.Scanner;

public class Main {
	public int solution(int n) {
		int answer = 0;

		for(int i =1; i< n;i++) {
			int sum = i;
			int num = i;
			
			while(sum < n) {
				sum += ++num;
				if(sum == n) {
					answer++;
					break;
				}
			}
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