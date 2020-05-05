package may_first;

import java.util.Scanner;

public class No_1463 {
	static int memo[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		memo = new int[T+1];
		System.out.println(dp(T));
	}
	
	public static int dp(int n) {
		if(n<=1) {
			return 0;
		}
		if(memo[n]>0) {
			return memo[n];
		}
		memo[n]=dp(n-1)+1;
		if(n%2==0) {
			int tmp = dp(n/2)+1;
			if(memo[n]>tmp) {
				memo[n]=tmp;
			}
		}
		if(n%3==0) {
			int tmp = dp(n/3)+1;
			if(memo[n]>tmp) {
				memo[n]=tmp;
			}
		}
		return memo[n];
	}
}
