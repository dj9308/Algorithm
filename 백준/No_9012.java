package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class No_9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		List<String> array = new ArrayList<String>();
		int T = sc.nextInt();
		int count = 1;
		boolean check = true;
		for(int i=0 ;i<T;i++) {
			int num = sc.nextInt();
			
			while(true) {
				if(count<=num) {
					stack.push(count);
					array.add("+");
					count++;
				}else {
					if(num==stack.pop()) {
						array.add("-");
					}else {
						System.out.println("NO");
						check=false;
					}
					break;
				}
			}if(!check) break;
		}
		if(check) {
			for(int i=0;i<array.size();i++) {
				System.out.println(array.get(i));
			}
		}
	}
}