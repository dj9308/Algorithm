package may_first;
import java.util.Scanner;

public class No_9095 {
	static int memo[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		memo = new int[11];
		for(int i=0;i<T;i++) {
			int N = sc.nextInt();
			System.out.println(dp(N));
		}
	}
	public static int dp(int n) {
		if(n==1) {
			memo[n]=1;
			return memo[n];
		}else if(n==2) {
			memo[n]=2;
			return memo[n];
		}else if(n==3) {
			memo[n]=4;
			return memo[n];
		}
		if(memo[n]>0) {
			return memo[n];
		}
		memo[n]=dp(n-1)+dp(n-2)+dp(n-3);
		return memo[n];
	}
}
