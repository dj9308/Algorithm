package may_second;

import java.util.Scanner;

public class Re_Re_15990 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 100000;
		int memo[][] = new int [max+1][4];
		int div = 1000000009;
		
		memo[1][1] = memo[2][2] = memo[3][3] = memo[3][2] = memo[3][1] = 1;

		for(int i=4;i<=max;i++) {
			for(int j=1;j<=3;j++) {
				if(j==1) memo[i][j] = memo[i-j][2]+memo[i-j][3];
				if(j==2) memo[i][j] = memo[i-j][1]+memo[i-j][3];
				if(j==3) memo[i][j] = memo[i-j][2]+memo[i-j][1];
				memo[i][j]%=div;
			}
		}
		
		int answer = 0;
		for(int j=0;j<N;j++) {
			int num = sc.nextInt();
			for(int i=1;i<=3;i++) {
				answer += memo[num][i];
				answer%=div;
			}
			System.out.println(answer);
		}
		sc.close();
	}

}
