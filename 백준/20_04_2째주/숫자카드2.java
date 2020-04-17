package april_second;

import java.util.Scanner;

public class No_10816 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arrayN[] = new int[N];
		StringBuilder sd = new StringBuilder();
		for(int i =0;i<N;i++) {
			arrayN[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		for(int i =0;i<M;i++) {
			int numM = sc.nextInt();
			int count = 0;
			for(int j=0;j<N;j++) {
				if(arrayN[j]==numM) {
					count++;
				}
			}
			sd.append(count+" ");
		}
		System.out.println(sd.toString());
	}

}
