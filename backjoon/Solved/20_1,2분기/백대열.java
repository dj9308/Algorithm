package algorithm;

import java.util.Scanner;

public class No_14490 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		int num1 = Integer.parseInt(string.substring(0,string.indexOf(":")));
		int num2 = Integer.parseInt(string.substring(string.indexOf(":")+1));
		int a = num1, b = num2;
		while(b!=0) {
			int r = a%b;
			a= b;
			b = r;
		}
		System.out.println(num1/a+":"+num2/a);
	}

}
