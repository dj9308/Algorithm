package practice;

//������
//1. ���� ������ �����. ������ Ǯ�� �ʾҴ���� �Ƹ� ������� �ᱹ ������.
//2. ������ ���� ���� �����̴�. �ᱹ�� comapreTo�� ������ ��� �ִ����� �����̾����ϱ�.


//�� �ҿ�ð� : 2�ð�

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Supply implements Comparable<Supply> {
    int date;
    int supply;
    
    public Supply(int date, int supply) {
        this.date = date;
        this.supply = supply;
    }
 
    //���޷��� �������� ���� ��¥�� �������� �� �켱������ �ִ°ɷ� ����.
    @Override
    public int compareTo(Supply o) {
        if (this.supply > o.supply) {
            return -1;
        } else if (this.supply == o.supply) {
            if (this.date < o.date) return -1;
            else return 1;
        } else return 1;
    }
}

public class Heap2 {
	
	public static void main(String[] args) {
		int stock = 4;
		int [] dates = {4,10,15};
		int [] supplies = {20,5,10};
		int k = 30;
		System.out.println(solution(stock, dates, supplies, k));
	}
	public static int solution(int stock, int[] dates, int[] supplies, int k) {
		 
		 PriorityQueue<Supply> pq = new PriorityQueue<>();
	        List<Supply> list = new ArrayList<>();
	        

	        for (int i = 0; i < supplies.length; i++) {
	            pq.add(new Supply(dates[i], supplies[i]));
	        }
	        

	        for (int i = 0; i < supplies.length; i++) {
	            list.add(pq.poll());
	        }
	        
	        int answer = 0;

	        while (stock < k) {

	            for (int i = 0; i < list.size(); i++) {

	                if (stock >= list.get(i).date) {
	                    stock += list.get(i).supply;
	                    list.remove(i);
	                    answer++;
	                    break;
	                }
	            }
	        }
	        
	        return answer;
		
//		int answer = 0;
//	        Queue<Integer> heap = new PriorityQueue<Integer>(Comparator.reverseOrder());
//	 
//	        
//	        for(int i =0;i<dates.length;i++) {
//	        	heap.add(supplies[i]);
//	        }
//	        
//	        for (int i = 0; i < k; i++) {
//	            if(stock == 0) {
//	                stock += heap.poll();
//	                answer++;
//	            }
//	            stock -= 1;
//	        }
//	        return answer;
    }

}
