package practice;

//������ �帧
//����� Ǯ���� �� ������ dfs bfs�� ���� ���� ��Ǯ���µ� ���ݵ� ��Ÿ�ӿ����� �߱淡 Ȯ���غ���
//�׳��� stackoverflow �� ����
//�׷��� ����Լ��δ� ��ƴ� �;� �ٸ��� �����غ� ��� stack���� �����ϰڴٰ� ������.
//������ Ȱ���� �� X, Y��ǥ�� ������ �ִ� ������ ������ ����.
//�������� �κ��� �޼ҵ带 �����ؼ� �ߺ����� ����.

//������: �������� �� ��ǥ�� �����̴�

import java.util.Stack;

public class Apeach {

	public static void main(String[] args) {
		int picture [][] = {
				{1, 1, 1, 0},
				{1, 2, 2, 0},
				{1, 0, 0, 1},
				{0, 0, 0, 1},
				{0, 0, 0, 3},
				{0, 0, 0, 3}
				};
		int m = 6;
		int n = 4;
		System.out.println(solution(m, n, picture));
		}

	public static int[] solution(int m, int n, int[][] picture) {
		
	    int[] answer = new int[2];
	    
	    boolean[][] visited = new boolean[m][n];
	    Stack<Integer> X = new Stack<Integer>();
	    Stack<Integer> Y = new Stack<Integer>();
	    
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            int count = 0;
	            if(picture[i][j] > 0 && visited[i][j] == false) {
	                plus(X, Y, visited, j, i);
	                count++;
	                answer[0]++;
	            }
	            
	            while(!X.isEmpty()) {
	                int x = X.pop();
	                int y = Y.pop();
	                // ��
	                if(y > 0 && picture[y - 1][x] == picture[i][j] && visited[y - 1][x] == false) {
	                    plus(X, Y, visited, x, y - 1);
	                    count++;
	                }
	                // ����
	                if(x > 0 && picture[y][x - 1] == picture[i][j] && visited[y][x - 1] == false) {
	                    plus(X, Y, visited, x - 1, y);
	                    count++;
	                }
	                // �Ʒ�
	                if(y < m - 1 && picture[y + 1][x] == picture[i][j] && visited[y + 1][x] == false) {
	                    plus(X, Y, visited, x, y + 1);
	                    count++;
	                }
	                // ������
	                if(x < n - 1 && picture[y][x + 1] == picture[i][j] && visited[y][x + 1] == false) {
	                    plus(X, Y, visited, x + 1, y);
	                    count++;
	                }
	            }
	            answer[1] = Math.max(answer[1], count);
	        }
	    }
	 
	    return answer;
	}
	 
	public static void plus(Stack<Integer> X, Stack<Integer> Y, boolean[][] visited, int j, int i) {
	    X.add(j);
	    Y.add(i);
	    visited[i][j] = true;
	}

}
