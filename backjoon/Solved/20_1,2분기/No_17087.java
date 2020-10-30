package algorithm;

import java.util.Scanner;


public class No_17087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int sis = sc.nextInt();
		int array[] = new int[T];
		
		for(int i =0 ;i<T;i++) {
			array[i] = Math.abs(sis-sc.nextInt());
		}
		int answer = array[0];
		for(int i=1;i<array.length;i++) {
			int a = array[i];
			while(a!=0) {
				int r = answer%a;
				answer = a;
				a = r;
			}
		}
		System.out.println(answer);
	}

}
