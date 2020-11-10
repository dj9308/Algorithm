package algorithm;

import java.util.*;
public class Stack1 {
	public static int solution(int[] priorities, int location) {
		Queue<Integer> pri_queue = new LinkedList<Integer>();
		Queue<Integer> idx_queue = new LinkedList<Integer>();
        int answer = 0;
        int prior=0;
        int pri_idx=0;
        
        
        for(int i=0;i<priorities.length;i++) {
        	pri_queue.add(priorities[i]);
        	idx_queue.add(i);
        }
        
        
        while(true) {
            prior = pri_queue.poll();
            pri_idx = idx_queue.poll();
        	
            if(pri_queue.isEmpty()) {
            	answer++;
            	break;
            }
            if(Collections.max(pri_queue)>prior) {
        		pri_queue.add(prior);
        		idx_queue.add(pri_idx);
        	}else {
        		answer++;
        		if(pri_idx==location) {
        			break;
        		}
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] priorities = {2,1,3,2};
		int location = 2;
		System.out.println(solution(priorities, location));
	}
}
