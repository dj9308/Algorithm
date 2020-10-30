package may_first;

import java.util.Scanner;

public class No_11727 {
	static int memo[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		memo = new int[T+1];
		System.out.println(dp(T));
	}
	
	public static int dp(int n) {
		if(n<=1) {
			return 1;
		}
		if(memo[n]>0) {
			return memo[n];
		}
		memo[n] = 2*dp(n-2)+dp(n-1);
		memo[n] %= 10007;
		return memo[n];
	}
}
