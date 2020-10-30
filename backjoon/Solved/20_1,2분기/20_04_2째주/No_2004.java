package april_second;

import java.util.Scanner;

public class No_2004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int n1=0 ,n2=0, m1=0, m2=0, mn1=0, mn2 = 0;
		int two =2, five=5;
		while(true) {
			if(N>=two) {
				n1+=N/two;
			}
			if(M>=two) {
				m1+=M/two;
			}
			if(N-M>=two) {
				mn1+=(N-M)/two;
			}
			
			if(M>two || N>two || N-M>two) {
				two*=2;
			}else break;
		}
		while(true) {
			if(N>=five) {
				n2+=N/five;
			}
			if(M>=five) {
				m2+=M/five;
			}
			if(N-M>=five) {
				mn2+=(N-M)/five;
			}
			
			if(M>five || N>five || N-M>five) {
				five*=5;
			}else break;
		}
		two = n1-m1-mn1;
		five = n2-m2-mn2;
		System.out.println(Math.min(two, five));
		
	}

}
