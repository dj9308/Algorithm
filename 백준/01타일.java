package algorithm;

import java.util.*;

public class No_1904 {
	static int n;
	
	static int dp[];

	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		
		
		n = sc.nextInt();
		dp = new int[1000001];
		dp[0] = 1;
		dp[1] = 2;
		dp[2] = 3;
		for(int i=3;i<=n;i++) {
			dp[i] = dp[i-1] + dp[i-2];
			dp[i] %= 15746;
		}
		
		System.out.println(dp[n-1]);
	}
	
}