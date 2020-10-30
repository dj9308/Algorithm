package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//생각의 흐름
//1. 먼저 큐로 숫자 수만큼 순위를 넣고 하나하나 방문해서 체크할 visit를 만든다.
//2. 다음 큐에 순위가 있다면 빼내고 방문한 다음 조건부에 따라 다시 true를 설정.
//3. 넣을 지 안넣을지 어떻게 해야하나 고민하고 구선생님께 물어모던 찰나 hashmap에 getOrDefault라는
// 아주 개꿀인 방법을 찾아냄.
//4. 그래서 key 값이 없을경우 default로 반환시켜 조건부가 성립하게 만듦.
// 그래서 조건부가 성립되고 큐가 이저 없는것, 즉 순위가 다 끝났다면 false 를 리턴하여 상황종료.

////느낀점
//hashmap에 list를 넣어서 실행시킨 것, 그리고 getOrDefault를 알았다는 점이 이번 문제에서 가장 큰 소득.
//하지만 방법을 찾기위해 다른사람의 풀이를 참고했을 뿐더러 구글링만 한시간 넘게 걸렸으니 풀어도 풀은게 아닌듯.
//아무래도 이게 가장 제일 힘든 알고리즘 문제 였던것 같다.
//다음엔 정말 힘들고 오래걸린다 하면 다음날로 넘기듯 시간을 더 충분히 들여 풀어야 할 것 같다.
// 솔직히 다시 풀라고 한다면 절대 못풀듯.
//총 풀이시간 : 4시간 30분 정도





public class Num {

	public static void main(String[] args) {
		int n = 5;
		int [][] results = {{4,3},{4,2},{3,2},{1,2},{2,5}};
		System.out.println(solution(n, results));
	}
	
	public static int solution(int n, int[][] results) {
        int answer = 0;

        boolean[][] m = new boolean[n + 1][n + 1];
        HashMap<Integer, List<Integer>> HashMap = WTF(results);

        for (int i = 1; i <= n; i++) {
            boolean[] visit = new boolean[n + 1];
            Queue<Integer> queue = new LinkedList<>();
            queue.add(i);
            visit[i] = true;
            
            while(!queue.isEmpty()) {
                int num = queue.poll();
                List<Integer> list = new ArrayList<Integer>();
                list = HashMap.getOrDefault(num, new ArrayList<>());
                
                for (Integer integer : list) {
                    if(!visit[integer]) {
                        visit[integer] = true;
                        m[i][integer] = true;
                        queue.add(integer);
                    }
                }
            }
        }

        for(int i = 1; i < n + 1; i++) {
            boolean pass = true;
            for(int j = 1; j < n + 1; j++) {
                if(i != j && !(m[i][j] || m[j][i])) {
                    pass = false;
                    break;
                }
            }
            if(pass) {
                answer++;
            }
        }

        return answer;
    }
    
     public static HashMap<Integer, List<Integer>> WTF(int[][] result) {
         
        HashMap<Integer, List<Integer>> HashMap = new HashMap<>();
         
        for (int[] test : result) {
            List<Integer> list = HashMap.getOrDefault(test[0], new ArrayList<>());
            list.add(test[1]);
            HashMap.put(test[0], list);
        }
         
        return HashMap;
    }
}
