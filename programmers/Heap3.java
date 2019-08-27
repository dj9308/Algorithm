package algori;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

class fulfill implements Comparable<fulfill> {
	int jobs;

	public fulfill(int jobs) {
		this.jobs = jobs;
	}

	// 공급량이 많을수록 공급 날짜가 빠를수록 더 우선순위를 줌
	@Override
	public int compareTo(fulfill o) {
		if (this.jobs < o.jobs) {
			return -1;
		} else 
			return 1;
	}
}

public class Heap3 {

	public static void main(String[] args) {
		int[][] jobs = { { 0, 3 }, { 1, 9 }, { 2, 6 } };
		System.out.println(solution(jobs));
	}

	public static int solution(int[][] jobs) {
		
		Queue<fulfill> heap = new PriorityQueue<>();
		ArrayList<fulfill> list = new ArrayList<fulfill>();
		for(int i =0;i<jobs.length;i++) {
			heap.offer(new fulfill(jobs[i][1]));
			list.add(heap.poll());
		}
		int min = jobs[0][1];
		int[] cal = new int[jobs.length];
		
		while(true) {
			for(int i =1;i<list.size();i++) {
				if(min<list.get(i).jobs)
				min = min+list.get(i).jobs-jobs[i][0];
				heap.offer(new fulfill(min));
				list.add(heap.poll());
			}
			
			if(list.size()==0) {
				break;
			}
		}
		
		int sum=0;
		for(int i =0;i<cal.length;i++) {
			sum+=cal[i];
		}
		return sum/3;
		
	}
}
