package practice;

import java.util.Arrays;
import java.util.Comparator;

//생각의 흐름:
//1. 앞뒤가 클때 작을 때를 각각 조건문으로 놓고 풀어야겠다. => 쌉소리
//2. 정렬하고 비교하면 되겠다.
//3. 내림차순 정렬 후 들어오는 지점이 나가는 지점보다 크면 겹치지 않는 걸로 생각.
//4. 내림차순 때문에 comparator를 인터넷에 검색 후 문제 풀이.

// 느낀점 : 생각만 잘 정리하면 잘 풀리는 문제였다. 정리가 안돼서 문제지 -ㅅ-
// 또한 Comparator는 다시 인터넷에 검색하지 않게 다시 봐둬야 할 것 같다.
// 문제풀이 총 시간 : 1시간 내외


public class Dansock {

	public static void main(String[] args) {
		int[][] routes = { { -20, 15 }, { -14, -5 }, { -18, -13 }, { -5, -3 },{10,20} };
		System.out.println(solution(routes));

	}

	public static int solution(int[][] routes) {
		int answer = 0;
        int min = 30000;
        Arrays.sort(routes, new Comparator<int[]>() {		//내림차순
            public int compare(int[] route1, int[] route2) {
                return route2[0] - route1[0];
            }
        });
        
//        for(int i=0;i<routes.length;i++)
//        	System.out.print(routes[i][0]);
//        
        
        for(int i = 0; i < routes.length; i++) {			
            if(min > routes[i][1]) {		// 들어오는 지점이 나가는 지점보다 크면 겹치지 않는 것이므로
                min = routes[i][0];			// 최소값 다시 설정 후
                answer++;					// 카메라 설치
            }
        }
        return answer;

	}

}
