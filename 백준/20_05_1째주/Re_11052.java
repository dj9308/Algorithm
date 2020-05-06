package may_first;

import java.util.Scanner;

public class Re_11052 {
	static int memo[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		memo = new int[T+1];
		int array[] = new int[T+1];
		for(int i=1;i<=T;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(dp(T,array));
		sc.close();
	}

	public static int dp(int n, int[] array) {
		if(memo[n]>0) {
			return memo[n];
		}
		for(int i=1;i<=n;i++) {
			memo[n]= Math.max(memo[n], dp(n-i,array)+array[i]);
		}
		return memo[n];
	}
}
