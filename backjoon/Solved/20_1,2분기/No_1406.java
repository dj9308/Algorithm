package algorithm;

import java.util.Scanner;
import java.util.Stack;

public class No_1406 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder subject = new StringBuilder(sc.next());
		int T = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		int cursur = -1;
		for(int i=0;i<subject.length()+1;i++) {
			cursur++;
			stack.push(cursur);
		}
		
		for(int i =0;i<T;i++) {
			String string = sc.next();
			if(string.equals("P")) {
				subject.insert(cursur, sc.next());
				stack.push(cursur);
				cursur++;
			}else if(string.equals("B")) {
				if(cursur==0) continue;
				else {
					subject.deleteCharAt(cursur-1);
					stack.pop();
					cursur--;
				}
			}else if(string.equals("D")) {
				if(cursur==subject.length()) continue;
				else {
					stack.push(cursur);
					cursur++;
				}
			}else if(string.equals("L")) {
				if(cursur==0) continue;
				else {
					stack.pop();
					cursur--;
				}
			}
		}
		System.out.println(subject);
	}
}
