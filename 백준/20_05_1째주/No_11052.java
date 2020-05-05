package may_first;

import java.util.Scanner;

// 20200505 일자 실패
// top-down 형식이 아직 이해가 덜된 듯.

public class No_11052 {
	static int memo[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		memo = new int[T+1];
		int array[] = new int[T];
		for(int i=0;i<T;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(dp(T,array));
	}
	
	public static int dp(int n, int array[]) {
		if(n<=0) return 0;
		if(memo[n]>0) return memo[n];

		memo[n] = dp(n-1,array)+array[0];
		
		for(int i=1;i<array.length;i++) {
			if(n-(i+1)>=0) {
				int temp = dp(n-1,array)+array[i];
				if(memo[n]<temp) {
					memo[n]=temp;
				}
			}
		}
		return memo[n];
	}
}
