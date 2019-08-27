package practice;

import java.util.Arrays;
import java.util.Comparator;

//������ �帧:
//1. �յڰ� Ŭ�� ���� ���� ���� ���ǹ����� ���� Ǯ��߰ڴ�. => �ԼҸ�
//2. �����ϰ� ���ϸ� �ǰڴ�.
//3. �������� ���� �� ������ ������ ������ �������� ũ�� ��ġ�� �ʴ� �ɷ� ����.
//4. �������� ������ comparator�� ���ͳݿ� �˻� �� ���� Ǯ��.

// ������ : ������ �� �����ϸ� �� Ǯ���� ��������. ������ �ȵż� ������ -��-
// ���� Comparator�� �ٽ� ���ͳݿ� �˻����� �ʰ� �ٽ� ���־� �� �� ����.
// ����Ǯ�� �� �ð� : 1�ð� ����


public class Dansock {

	public static void main(String[] args) {
		int[][] routes = { { -20, 15 }, { -14, -5 }, { -18, -13 }, { -5, -3 },{10,20} };
		System.out.println(solution(routes));

	}

	public static int solution(int[][] routes) {
		int answer = 0;
        int min = 30000;
        Arrays.sort(routes, new Comparator<int[]>() {		//��������
            public int compare(int[] route1, int[] route2) {
                return route2[0] - route1[0];
            }
        });
        
//        for(int i=0;i<routes.length;i++)
//        	System.out.print(routes[i][0]);
//        
        
        for(int i = 0; i < routes.length; i++) {			
            if(min > routes[i][1]) {		// ������ ������ ������ �������� ũ�� ��ġ�� �ʴ� ���̹Ƿ�
                min = routes[i][0];			// �ּҰ� �ٽ� ���� ��
                answer++;					// ī�޶� ��ġ
            }
        }
        return answer;

	}

}
