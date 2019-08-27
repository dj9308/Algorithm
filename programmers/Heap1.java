package practice;

//
//������
//�̸� ������, ��Ʈ��, �׸��� �켱���� ť�� ���� �����ϰ� ������ �̸� ���� ���ּ� �׷���
//���� ���� Ǯ�ȴ�.
//2. �̹����� ���� ���� ������ ���ӻ��� ���� Ȯ���� �˾Ҵ�. ���� ���� ������ �����ϰ� ������ �ϸ� 
//���׿� ���͵� ����� �����Ҽ� ���� ��.
//

//�� �ҿ�ð�: 1�ð�

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
