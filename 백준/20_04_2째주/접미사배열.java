package april_second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class No_11656 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String subject = sc.next();
		String answer [] = new String[subject.length()];
		List<String> list = new ArrayList<String>();
		for(int i=0;i<subject.length();i++) {
			answer[i]= subject.substring(i);
		}
		Arrays.sort(answer);
		for(int i=0;i<subject.length();i++) {
			System.out.println(answer[i]);
		}
	}

}
