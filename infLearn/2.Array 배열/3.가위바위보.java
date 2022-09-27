package algorithm;

import java.util.Scanner;

public class Main {
	public String solution(int [] array1, int[] array2) {
		String answer = "";
		
		for(int i = 0; i< array1.length;i++) {
			switch (array1[i]) {
			case 1:
				switch (array2[i]) {
				case 1:
					answer+="D";
					break;
				case 2:
					answer+="B";
					break;
				default:
					answer+="A";
					break;
				}
				break;
			case 2:
				switch (array2[i]) {
				case 1:
					answer+="A";
					break;
				case 2:
					answer+="D";
					break;
				default:
					answer+="B";
					break;
				}
				break;
			default:
				switch (array2[i]) {
				case 1:
					answer+="B";
					break;
				case 2:
					answer+="A";
					break;
				default:
					answer+="D";
					break;
				}
				break;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] array1 = new int[n];
		int[] array2 = new int[n];
		
		for(int i = 0; i < n ;i++) {
			array1[i] = in.nextInt();
		}
		for(int i = 0; i < n ;i++) {
			array2[i] = in.nextInt();
		}
		
		char[] array = main.solution(array1, array2).toCharArray();
		
		for(int i = 0; i < array.length ;i++) {
			System.out.println(array[i]);
		}
	}
}