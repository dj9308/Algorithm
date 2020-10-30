package algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		
		int n = sc.nextInt();
		int sum = 0;
		int num;
		for(int i=0;i<n;i++) {
			num = sc.nextInt();
			if(num==0) {
				stack.pop();
			}else {
				stack.push(num);
			}
		}
		int size = stack.size();
		for(int i=0;i<size;i++) {
			sum+=stack.pop();
		}
		System.out.println(sum);
	}

}
