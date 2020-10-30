package may_first;

import java.util.Scanner;

public class No_11653 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int prime[] = new int[T];
		int pn = 0; 
		boolean check[] = new boolean[T+1];
		int n = T;
		
		for(int i=2;i<=n;i++){
		    if(check[i] == false){
		        prime[pn++] = i;
		        for(int j =i+i; j<=n ; j+=i){
		            check[j] =true;
		        }
		    }
		}
		
		while(true) {
			for(int i=0;i<pn;i++) {
				if(T%prime[i]==0) {
					T = T/prime[i];
					System.out.println(prime[i]);
					break;
				}
			}
			if(T==1) {
				break;
			}
		}
	}
}
