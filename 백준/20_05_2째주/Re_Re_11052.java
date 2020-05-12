package may_second;

import java.util.Scanner;

public class Re_Re_11052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int memo[] = new int [N+1];
		int price[] = new int[5];
		
		for(int i=1;i<=N;i++) {
			price[i]=sc.nextInt();
		}
		memo[0] = 0;
		memo[1] = price[1];
		
		for(int i=2;i<=N;i++) {
			int temp =0;
			for(int j=1;j<=N;j++) {
				if(i>=j) {
					temp = memo[i-j]+price[j];
					memo[i] = Math.max(memo[i], temp);
				}else break;
				
			}
		}
		System.out.println(memo[N]);
		sc.close();
	}

}
