package april_second;

import java.util.Scanner;

public class No_1676 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int count =0;
		int five = 5;
		while(true) {
			count+=T/five;
			if(T>five) {
				five*=5;
			}else {
				break;
			}
		}
		System.out.println(count);
	}

}
