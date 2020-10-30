package may_first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No_2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum =0;
		
		for(int i=0;i<9;i++) {
			int num = sc.nextInt();
			list.add(num);
			sum+=num;
		}
		
		Collections.sort(list);
		
		int one =0;
		int two =0;
		
		for(int i=0;i<9;i++) {
			for(int j=i+1;j<9;j++) {
				if(sum-list.get(i)-list.get(j)==100) {
					one = i;
					two = j;
				}
			}
		}
		
		for(int i=0;i<9;i++) {
			if(i!=one && i!=two)
				System.out.println(list.get(i));
		}
		sc.close();
	}

}
