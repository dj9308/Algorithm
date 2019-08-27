package practice;

//
//느낀점
//미리 힙정렬, 힙트리, 그리고 우선순위 큐에 대해 예습하고 예제를 미리 많이 봐둬서 그런지
//비교적 쉽게 풀렸다.
//2. 이문제로 인해 힙의 구조와 쓰임새에 대해 확실히 알았다. 이제 상위 문제를 공부하고 복습만 하면 
//코테에 나와도 충분히 대응할수 있을 듯.
//

//총 소요시간: 1시간

import java.util.PriorityQueue;
import java.util.Queue;

public class Heap1 {

	public static void main(String[] args) {
		int [] scoville = {1,2,3,9,10,12};
		int K = 7;
		System.out.println(solution(scoville, K));
	}
	public static int solution(int[] scoville, int K) {
        int answer;
        int a1, a2;
        int stir;
        int time=0;
        
        
        Queue<Integer> heap = new PriorityQueue<Integer>();
        
        for(int i =0;i<scoville.length;i++) {
        	heap.offer(scoville[i]);
        }
        
        while(true) {
        	if(heap.peek()>=K) {
        		answer=time;
        		break;
        	}
        	a1=heap.poll();
        	a2=heap.poll();
        	stir=a1+(a2*2);
        	heap.offer(stir);
        	time++;
        }
        if(heap.poll()>=K) {
        	answer=time;
        }
        return answer;
    }

}
