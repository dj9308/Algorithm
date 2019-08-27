package algori;

import java.util.LinkedList;
import java.util.Queue;

public class StackQueue2 {

	public static void main(String[] args) {
		int [] heights = {6,9,5,7,4};
		System.out.println(solution(heights));

	}
	public static int[] solution(int[] heights) {
    	int[] answer = new int[heights.length];
    	Queue<Integer> qu = new LinkedList<Integer>();
    	for(int i =0;i<heights.length;i++) {
        	for(int j =1;j<heights.length;j++) {
        		if(heights[heights.length-1-i]<heights[heights.length-1-j]) {
            		qu.offer(heights.length-1-j);
            	}else {
            		qu.offer(0);
            	}
        	}
    	}
    	for(int i=0;i<heights.length;i++) {
    		answer[i] = qu.poll();
    	}
        
        return answer;
    }

}
