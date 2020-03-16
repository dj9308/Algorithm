package algorithm;

import java.util.Scanner;
import java.util.Stack;

public class No_9093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		int time = Integer.parseInt(sc.next());
		System.out.println(time);
		sc.nextLine();
		for(int i=0;i<time;i++) {
			String answer ="";
			String subject = sc.nextLine();
			String[] array = subject.split(" ");
			for(int j=0;j<array.length;j++) {
				String[] word = array[j].split("");
				for(int k=0;k<word.length;k++) {
					stack.push(word[k]);
				}
				for(int k=0;k<word.length;k++) {
					answer+=stack.pop();
				}
				answer+=" ";
			}
			System.out.println(answer);
		}
	}

}
