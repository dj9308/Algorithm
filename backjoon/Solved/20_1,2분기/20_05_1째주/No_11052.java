package may_first;

import java.util.Scanner;


public class No_11052 {
	static int memo[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		memo = new int[T+1];
		int array[] = new int[T+1];
		for(int i=1;i<=T;i++) {
			array[i] = sc.nextInt();
		}
		for(int i=1;i<=T;i++) {
			for(int j=1;j<=i;j++) {
				memo[i]=Math.max(memo[i], memo[i-j]+array[j]);
			}
		}
		System.out.println(memo[T]);
		sc.close();
	}
}
