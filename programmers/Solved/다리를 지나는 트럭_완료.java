package algorithm;

import java.util.*;
import java.util.ArrayList;

public class Stack1 {
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		Queue<Integer> on_bridge = new LinkedList<Integer>();
		ArrayList<Integer> time = new ArrayList<Integer>();
		int done = 0;
		int answer = 0;
		int total_weight=0;
		int i =0;
		
		while(true) {
			answer++; //경과 시간
			
			if(!time.isEmpty() && time.get(0)==bridge_length) {  // 다리 지난것 확인후 트럭 빼기
				time.remove(0);
				total_weight-=on_bridge.poll();
				done++;
			}
			
			if(done==truck_weights.length) break;  // 다 지나갔으면 break
				
			if(i!=truck_weights.length && weight>=total_weight+truck_weights[i]) {  // 무게 비교 후 변수 설정
				time.add(0);
				on_bridge.add(truck_weights[i]);
				total_weight+=truck_weights[i];
				i++;
			}
			
			for(int j=0;j<time.size();j++) { 	// 트럭마다 시간 증가
				time.set(j, time.get(j)+1);
			}
			
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
		System.out.println(solution(bridge_length, weight, truck_weights));
	}
}
