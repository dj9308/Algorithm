package may_first;

import java.util.Scanner;

//bottom-up ¹öÀü

public class re_1463 {
	static int memo[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		memo = new int[N+1];
		memo[0]=0;
		memo[1]=0;
		
		for(int i=2;i<=N;i++) {
		memo[i]=memo[i-1]+1;
		
		if(i%2==0) {
			memo[i]=Math.min(memo[i], memo[i/2]+1);
		}
		if(i%3==0) {
			memo[i]=Math.min(memo[i], memo[i/3]+1);
		}
		}
		System.out.println(memo[N]);
	}
}
