package algorithm;

import java.util.LinkedList;

public class Stack1 {
	
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        LinkedList<Integer> queue1 = new LinkedList<Integer>();
        int pre=0;
        int second=0;
        int index=0;
        
        for(int i=0;i<prices.length;i++) {
        	queue1.add(prices[i]);
        }
        
        while(!queue1.isEmpty()) {
        	second=0;
        	pre = queue1.poll();
        	LinkedList<Integer> queue2 = new LinkedList<Integer>();
        	queue2 = (LinkedList<Integer>) queue1.clone();
        	while(!queue2.isEmpty()) {
        		if(pre<=queue2.poll()) {
        			second++;
        		}else {
        			second=0;
        		}
        	}
        	answer[index++]=second;
        }
        for(int i=0;i<prices.length;i++) {
        	System.out.println(answer[i]);
        }
        return answer;
    }
    
	public static void main(String[] args) {
		int prices[] = {1,1,1,1,11,1};
		System.out.println(solution(prices));;
	}

}
