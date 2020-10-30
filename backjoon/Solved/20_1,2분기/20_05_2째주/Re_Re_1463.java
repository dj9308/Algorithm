package may_second;

import java.util.Scanner;

public class Re_Re_1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int memo[] = new int[N+1];
		
		memo[0] = memo[1] = 0;
		for(int i=2;i<=N;i++) {
			memo[i]=memo[i-1]+1;
			
			if(i%2==0) {
				int temp = memo[i/2]+1;
				if(memo[i]>temp) {
					memo[i]=temp;
				}
			}
			if(i%3==0) {
				int temp = memo[i/3]+1;
				if(memo[i]>temp) {
					memo[i]=temp;
				}
			}
		}
		System.out.println(memo[N]);
		sc.close();
	}

}
