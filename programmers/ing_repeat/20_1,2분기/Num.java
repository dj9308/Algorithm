package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//������ �帧
//1. ���� ť�� ���� ����ŭ ������ �ְ� �ϳ��ϳ� �湮�ؼ� üũ�� visit�� �����.
//2. ���� ť�� ������ �ִٸ� ������ �湮�� ���� ���Ǻο� ���� �ٽ� true�� ����.
//3. ���� �� �ȳ����� ��� �ؾ��ϳ� ����ϰ� �������Բ� ������ ���� hashmap�� getOrDefault���
// ���� ������ ����� ã�Ƴ�.
//4. �׷��� key ���� ������� default�� ��ȯ���� ���Ǻΰ� �����ϰ� ����.
// �׷��� ���Ǻΰ� �����ǰ� ť�� ���� ���°�, �� ������ �� �����ٸ� false �� �����Ͽ� ��Ȳ����.

////������
//hashmap�� list�� �־ �����Ų ��, �׸��� getOrDefault�� �˾Ҵٴ� ���� �̹� �������� ���� ū �ҵ�.
//������ ����� ã������ �ٸ������ Ǯ�̸� �������� �Ӵ��� ���۸��� �ѽð� �Ѱ� �ɷ����� Ǯ� Ǯ���� �ƴѵ�.
//�ƹ����� �̰� ���� ���� ���� �˰��� ���� ������ ����.
//������ ���� ����� �����ɸ��� �ϸ� �������� �ѱ�� �ð��� �� ����� �鿩 Ǯ��� �� �� ����.
// ������ �ٽ� Ǯ��� �Ѵٸ� ���� ��Ǯ��.
//�� Ǯ�̽ð� : 4�ð� 30�� ����





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
