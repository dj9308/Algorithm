package may_first;

import java.util.Scanner;

// ��ȭ�� ���ϴ� ���� �ٽ� ������ ��.
// �ʱ�ȭ �ٽ� �ѹ� ������ �� ��.
// �������� �� ���������� ���ؾ� �ϴ��� �����ؾ� ��
//


public class No_15990 {
	static int memo[][], answer;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int div = 1000000009;
		int max = 100000;
		memo = new int[max+1][4];
		memo[1][1] = memo[2][2] = memo[3][3] = memo[3][1] = memo[3][2] = 1; //�ʱ�ȭ
		for(int i=4;i<=max;i++) {
			for(int j=1;j<=3;j++) {
				if(j==1) memo[i][1] = memo[i-j][2]+memo[i-j][3];
				if(j==2) memo[i][2] = memo[i-j][1]+memo[i-j][3];
				if(j==3) memo[i][3] = memo[i-j][2]+memo[i-j][1];
				memo[i][j]%=div;
			}
		}
		
		for(int i=0;i<T;i++) {
			int num = sc.nextInt();
			answer = 0;
			for(int j=1;j<=3;j++) {
				answer+=memo[num][j];
				answer%=div;
			}
			System.out.println(answer);
		}
		
		sc.close();
	}
}
