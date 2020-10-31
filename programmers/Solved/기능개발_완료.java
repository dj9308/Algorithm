package algorithm;

import java.util.*;

public class Stack1 {
	
    public static int[] solution(int[] progresses, int[] speeds) {
    	Queue<Integer> ans = new LinkedList<Integer>();
        int first = 0;	// ���ϱ� ���� ù ��° ����
        int count = 1;  //�����ؾ� �ϴ� �۾� ����
        
        for(int i=0;i<progresses.length;i++) {
        	int achivement = progresses[i];	// ������
        	int date=0;						// ���� ��¥
        	
        	while(achivement<100) {		//���� ��¥ ����
        		achivement+=speeds[i];
        		date++;
        	}
        	if(i==0) {
        		first = date;  // ù ��° ���� �ʱ�ȭ
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
			System.out.println("��: "+answer[i]);
		}
	}

}
