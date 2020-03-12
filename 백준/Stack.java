package algorithm;

import java.util.Scanner;

public class Stack {
	
	int top;
	int size;
	int stack[];
	
	public Stack(int size) {
		this.size = size;
		stack = new int[size];
		top=-1;
	}
	
	public int top() {
		if(top==-1)
			return -1;
		else
			return stack[top];
	}
	
	public void push(int value) {
		stack[++top] = value;
	}
	
	public int pop() {
		if(top==-1) {
			return -1;
		}
		else
			return stack[top--];
	}
	
	public int size() {
		return top+1;
	}
	
	public int empty() {
		if(top==-1)
			return 1;
		else return 0;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack st = new Stack(n);
		String input;
		
		for(int i=0;i<n;i++) {
			input = sc.next();
			if(input.equals("push")) {
				st.push(sc.nextInt());
			}
			if(input.equals("pop")) {
				System.out.println(st.pop());
			}
			if(input.equals("top")) {
				System.out.println(st.top());
			}
			if(input.equals("empty")) {
				System.out.println(st.empty());
			}
			if(input.equals("size")) {
				System.out.println(st.size());
			}
		}
	}

}
