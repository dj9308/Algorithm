package practice;

//생각의 흐름
//목요일 풀었을 땐 아직도 dfs bfs를 재대로 몰라 못풀었는데 지금도 런타임에러가 뜨길래 확인해보니
//그놈의 stackoverflow 가 문제
//그래서 재귀함수로는 어렵다 싶어 다르게 생각해본 결과 stack으로 가능하겠다고 생각함.
//스택을 활용할 때 X, Y좌표를 가지고 있는 각각의 스택을 생성.
//공통적인 부분은 메소드를 구현해서 중복성을 제거.

//느낀점: 다음부터 내 목표는 라인이다

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
	                // 위
	                if(y > 0 && picture[y - 1][x] == picture[i][j] && visited[y - 1][x] == false) {
	                    plus(X, Y, visited, x, y - 1);
	                    count++;
	                }
	                // 왼쪽
	                if(x > 0 && picture[y][x - 1] == picture[i][j] && visited[y][x - 1] == false) {
	                    plus(X, Y, visited, x - 1, y);
	                    count++;
	                }
	                // 아래
	                if(y < m - 1 && picture[y + 1][x] == picture[i][j] && visited[y + 1][x] == false) {
	                    plus(X, Y, visited, x, y + 1);
	                    count++;
	                }
	                // 오른쪽
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
