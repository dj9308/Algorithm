package may_second;

import java.util.Scanner;

public class Re_Re_2193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long memo[][] = new long[90+1][2];
		memo[1][1] = memo[2][0] = 1;
		
		for(int i=3;i<=90;i++) {
			for(int j=0;j<=1;j++) {
				if(memo[i-1][1]>0 && j==1) memo[i][j] = memo[i-1][0];
				else memo[i][j] = memo[i-1][0]+memo[i-1][1];
			}
		}
		
		long answer = 0;
		
		for(int i=0;i<=1;i++) {
			answer+=memo[N][i];
		}
		
		System.out.println(answer);
		sc.close();
	}

}
