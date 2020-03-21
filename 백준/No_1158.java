package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No_1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1;i<=N;i++) {
			queue.add(i);
		}
		int count=1;
		String answer = "<";
		while(true) {
			if(count==K) {
				answer+= Integer.toString(queue.poll())+", ";
				count=1;
			}else {
				queue.add(queue.poll());
				count++;
			}
			if(queue.size()<K) {
				for(int i=1;i<K;i++) {
					answer+= Integer.toString(queue.poll());
					if(i==K-1) {
						answer+=">";
					}else {
						answer+=", ";
					}
				}
				break;
			}
		}
		System.out.println(answer);
	}

}
