package algorithm;

import java.util.Scanner;
import java.util.Stack;


public class No_1406_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> lstack = new Stack<String>();
		Stack<String> rstack = new Stack<String>();
		String[] subject = sc.next().split("");
		int T = sc.nextInt();
		
		for(int i=0;i<subject.length;i++) {
			lstack.push(subject[i]);
		}
		
		for(int i=0;i<T;i++) {
			String string = sc.next();
			if(string.equals("P")) {
				lstack.push(sc.next());
			}else if(string.equals("B")) {
				if(lstack.size()==0) continue;
				else {
					lstack.pop();
				}
			}else if(string.equals("D")) {
				if(rstack.size()==0) continue;
				else {
					lstack.push(rstack.pop());
				}
			}else if(string.equals("L")) {
				if(lstack.size()==0) continue;
				else {
					rstack.push(lstack.pop());
				}
			}
		}
		while(!lstack.empty()) {
			rstack.push(lstack.pop());
		}
		
		while(!rstack.empty()) {
			System.out.print(rstack.pop());
		}
	}
}
