package practice;

//// 느낀점
//1. 전체적으로 라면공장 문제와 많이 유사했다.
//2. 그래서 이름은 모르지만 목요일날 알고리즘을 굳이 알지 못해도 풀수 있었던 것 같다.
//3. compareto의 조건문만 잘 건드리면 되는 문제였다.
//
//사족: 알바하고 하는 코딩이 오히려 잘되는 것 같다. 힘이 다 빠져서 그런가 너무 긴장하지 않고
//풀면 되는 것 같다. 마치 음주 코딩처럼. 하지만 몸에 무리가 가는건 백퍼 확실.
//
//총 풀이시간: 목요일 스터디 시간 40분 포함 1시간 40분


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
 
class Job implements Comparable<Job> {
    int start;
    int workTime;
    
    public Job(int start, int time) {
        this.start = start;
        this.workTime = time;
    }
    
    //걸리는 소요시간이 짧을수록, 시작 시간이 짧을 수록 우선수위를 높게함
    
    @Override
    public int compareTo(Job o) {
        if (this.workTime < o.workTime) return -1;
        else if (this.workTime == o.workTime) {
            if (this.start < o.start) return -1;
            else return 1;
        } else return 1;
    }
}
 
class Heap3 {
    public int solution(int[][] jobs) {
        PriorityQueue<Job> pq = new PriorityQueue<>();
        List<Job> list = new ArrayList<>();
        
        
        for (int i = 0; i < jobs.length; i++) {
            pq.add(new Job(jobs[i][0], jobs[i][1]));
        }
        
        for (int i = 0; i < jobs.length; i++) {
            list.add(pq.poll());
        }
        
        int time = 0;
        int sum = 0;
        while (list.size()>0) {
            for (int i = 0; i < list.size(); i++) {
            	
                //시작시간이 현재 시간보다 이전이라면 시작 가능
                if (time>=list.get(i).start) {
                    time+=list.get(i).workTime;
                    sum+=time-list.get(i).start;
                    list.remove(i);
                    break;
                }
                
                //시작시간이 현재 시간보다 이전인 것이 없다면 시간 1초 증가
                if (i == list.size()-1) time++;
            }
        }
        
        int answer = (sum/jobs.length);
        return answer;
    }
}
