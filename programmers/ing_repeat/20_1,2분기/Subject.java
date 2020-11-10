package practice;

import java.util.*;

// 생각의 흐름
// 1. 문제 보자마자 queue 써야겠다고 생각.
// 2. 배포는 순차적으로 되야하므로 for문을 통해 progresses 배열을 탐색 후 완료되면 q에 저장후 포문 종료.
// 3. 진행률이 100 이상이면 q에 num 저장에
// 4. 100 미만이면  num이 0이 아닐때만 q에 저장, 0이면 기능이 없다는 것이므로 무시
// 5. 기능의 진행률이 100 미만인 기능이 완료되려면 걸리는 시간을 계산한 후 해당 기능의 뒤에 위치한 기능들에도 진행률을 더해줌
// 6. q의 size만큼 answer 배열을 선언해준 후 for문을 통해 q의 내용을 answer에 넣어줌

// 느낀점 : 다행히 스택과 큐는 문제가 나올시 어느정도 맞출 수 있겠다고 생각함.
// 문제를 풀면 풀수록 뭔가 실제로 코딩을 짤때 많이 써먹겠다고 생각하기도...
// 근데 왜 시간은 오래걸릴까 ㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲ
// 총 소요시간 : 1시간 20분

public class Subject {

	public static void main(String[] args) {
		int [] progresses = {93,30,55};
		int [] speeds = {1,30,5};
		System.out.println(solution(progresses, speeds));

	} public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
         
        int num = 0;		//기능의 갯수를 count
        
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
