package algorithm;

import java.util.Scanner;

public class Main {
	public String solution(int n, String input) {
		String answer = "";
		
		for(int i =0 ; i<n;i++) {
			String st = input.substring(7*i,7*i+7);
			char[] array = st.toCharArray();
			int count = 0;
			
			for(int j = array.length; j>=1; j--) {
				if(array[j-1] == '#') {
					count+=Math.pow(2, Math.abs(j-array.length));
				}
			}
			answer += (char) count;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String input = in.nextLine();

		String answer = main.solution(n, input);
		System.out.println(answer);
	}
}