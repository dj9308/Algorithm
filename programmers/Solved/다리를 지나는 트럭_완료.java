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
			answer++; //��� �ð�
			
			if(!time.isEmpty() && time.get(0)==bridge_length) {  // �ٸ� ������ Ȯ���� Ʈ�� ����
				time.remove(0);
				total_weight-=on_bridge.poll();
				done++;
			}
			
			if(done==truck_weights.length) break;  // �� ���������� break
				
			if(i!=truck_weights.length && weight>=total_weight+truck_weights[i]) {  // ���� �� �� ���� ����
				time.add(0);
				on_bridge.add(truck_weights[i]);
				total_weight+=truck_weights[i];
				i++;
			}
			
			for(int j=0;j<time.size();j++) { 	// Ʈ������ �ð� ����
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
