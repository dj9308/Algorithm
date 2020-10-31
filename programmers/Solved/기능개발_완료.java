package algorithm;

import java.util.*;

public class Stack1 {
	
    public static int[] solution(int[] progresses, int[] speeds) {
    	Queue<Integer> ans = new LinkedList<Integer>();
        int first = 0;	// 비교하기 위한 첫 번째 변수
        int count = 1;  //배포해야 하는 작업 갯수
        
        for(int i=0;i<progresses.length;i++) {
        	int achivement = progresses[i];	// 진도율
        	int date=0;						// 배포 날짜
        	
        	while(achivement<100) {		//배포 날짜 생성
        		achivement+=speeds[i];
        		date++;
        	}
        	if(i==0) {
        		first = date;  // 첫 번째 변수 초기화
        	}else {
        		if(first<date) {
        			ans.add(count);
        			first=date;
        			count=1;
        		}else {
        			count++;
        		}
        		if(i==progresses.length-1) ans.add(count);
        	}
        	
        }
        
        int[] answer = new int[ans.size()];
        
        for(int i=0;i<answer.length;i++) {
        	answer[i]=ans.poll();
        }
        
        return answer;
    }
    
	public static void main(String[] args) {
		int progresses[] = {95,90,99,99,80,99};
		int speeds[] = {1,1,1,1,1,1};
		int answer[] = solution(progresses, speeds);
		for(int i=0;i<answer.length;i++) {
			System.out.println("답: "+answer[i]);
		}
	}

}
