package algorithm;

import java.util.*;
public class Stack1 {
	public static int solution(int[] priorities, int location) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Queue<Integer> idxQueue = new LinkedList<Integer>();
		int answer = 0;
		
		for(int i=0;i<priorities.length;i++) {
			queue.add(priorities[i]);
			idxQueue.add(i);
		}
		
		int index = idxQueue.poll();
		int poll = queue.poll();
		
		while(true) {
			if(queue.isEmpty()) {
				answer++;
				break;
			}
			if(poll>=Collections.max(queue)) {
				answer++;
				if(location == index) {
					break;
				}
			}else {
				idxQueue.add(index);
				queue.add(poll);
			}
			
			index = idxQueue.poll();
			poll= queue.poll();
		}
		return answer;
    }
	
	public static void main(String[] args) {
		int[] priorities = {1,1,9,1,1,1};
		int location = 0;
		System.out.println(solution(priorities, location));
	}
}
