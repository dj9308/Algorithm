package may_first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Re_2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int sum = 0;
		for(int i=0;i<9;i++) {
			int num = sc.nextInt();
			list.add(num);
			sum+=num;
		}
		Collections.sort(list);
		int a = 0;
		int b = 0;
		for(int i=0;i<9;i++) {
			for(int j=i+1;j<9;j++) {
				if(sum-list.get(i)-list.get(j)==100) {
					a = i;
					b = j;
				}
			}
		}
		
		for(int i=0;i<9;i++) {
			if(i!=a && i!=b) {
				System.out.println(list.get(i));
			}
		}
	}

}
