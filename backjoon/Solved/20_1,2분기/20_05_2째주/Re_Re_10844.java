package may_second;

import java.util.Scanner;

public class Re_Re_10844 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int memo[][] = new int[101][11];
		int div = 1000000000;
		
		for(int i=1;i<=9;i++) {
			memo[1][i]=1;
		}
		
		for(int i=2;i<=100;i++) {
			for(int j=0;j<=9;j++) {
				if(j==0) memo[i][j] = memo[i-1][j+1];
				else if(j==9) memo[i][j] = memo[i-1][j-1];
				else memo[i][j] = memo[i-1][j-1]+memo[i-1][j+1];
				memo[i][j]%=div;
			}
		}
		
		int answer = 0;
		for(int i=0;i<=9;i++) {
			answer += memo[N][i];
			answer%=div;
		}
		System.out.println(answer);
		sc.close();
	}

}
