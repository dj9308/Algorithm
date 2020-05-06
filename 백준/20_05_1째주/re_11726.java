package may_first;

import java.util.Scanner;

public class re_11726 {
	static int memo[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		memo = new int[N+1];
		memo[0]=1;
		memo[1]=1;
		
		for(int i=2;i<=N;i++) {
			memo[i]=(memo[i-1]+memo[i-2])%10007;
		}
		
		System.out.println(memo[N]);
		sc.close();
	}
}
