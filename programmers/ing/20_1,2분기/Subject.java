package practice;

import java.util.*;

// ������ �帧
// 1. ���� ���ڸ��� queue ��߰ڴٰ� ����.
// 2. ������ ���������� �Ǿ��ϹǷ� for���� ���� progresses �迭�� Ž�� �� �Ϸ�Ǹ� q�� ������ ���� ����.
// 3. ������� 100 �̻��̸� q�� num ���忡
// 4. 100 �̸��̸�  num�� 0�� �ƴҶ��� q�� ����, 0�̸� ����� ���ٴ� ���̹Ƿ� ����
// 5. ����� ������� 100 �̸��� ����� �Ϸ�Ƿ��� �ɸ��� �ð��� ����� �� �ش� ����� �ڿ� ��ġ�� ��ɵ鿡�� ������� ������
// 6. q�� size��ŭ answer �迭�� �������� �� for���� ���� q�� ������ answer�� �־���

// ������ : ������ ���ð� ť�� ������ ���ý� ������� ���� �� �ְڴٰ� ������.
// ������ Ǯ�� Ǯ���� ���� ������ �ڵ��� ©�� ���� ��԰ڴٰ� �����ϱ⵵...
// �ٵ� �� �ð��� �����ɸ��� ��������������������������������������������������������������������������������������������������������������������������
// �� �ҿ�ð� : 1�ð� 20��

public class Subject {

	public static void main(String[] args) {
		int [] progresses = {93,30,55};
		int [] speeds = {1,30,5};
		System.out.println(solution(progresses, speeds));

	} public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
         
        int num = 0;		//����� ������ count
        
        for(int i = 0; i <= progresses.length; i++){
            if(i == progresses.length){
                q.add(num);
                break;
            }
            if(progresses[i] >= 100){
                num++;
                continue;
            }
            if(num != 0){
                q.add(num);
            }
             
            num = 0;
            int remain = 100 - progresses[i];
            int day = remain / speeds[i];
            if(remain % speeds[i] != 0){
                day++;
            }
             
            for(int j = i; j < progresses.length; j++){
                progresses[j] += (day * speeds[j]);
            }
            num++;
        }
     
        int[] answer = new int[q.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = q.remove();
        }
        return answer;
    }

}
