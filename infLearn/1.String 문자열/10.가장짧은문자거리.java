//10. 가장 짧은 문자 거리
//
// 느낀점 : max 값을 설정을 제대로 했었으면 결과가 더 빨리 나왔을것.


package algorithm;

import java.util.Scanner;

public class Main {
	public String solution(String input) {
		String[] array = input.split(" ");
		char[] input1 = array[0].toCharArray();
		char input2 = array[1].charAt(0);
		String answer = "";

		for (int i = 0; i < input1.length; i++) {
			int max = input1.length;
			
			if (input1[i] == input2) {
				answer += "0";
			} else {
				for (int j = 0; j < input1.length; j++) {
					if(input1[j] == input2) {
						if(max > Math.abs(i-j)) {
							max = Math.abs(i-j);
						}
					}
				}
				answer += String.valueOf(max);
			}
			if(i != input1.length-1) answer+=" ";
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