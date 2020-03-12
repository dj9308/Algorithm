package algorithm;

import java.util.Scanner;

public class no_1972 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String string = sc.next();
			if(string.equals("*")) {
				break;
			}
			
			boolean check = true;
			String[] subject = string.split("");
			
			for(int i=1;i<string.length()-1;i++) {
				String a, b;
				for(int j=0;j<string.length()-i;j++) { // 첫번째 비교대상 설정
					a = subject[j]+subject[j+i];
					for(int k=j+1;k<string.length()-i;k++) { // 두번째 비교대상 설정
						b = subject[k]+subject[k+i];
						if(a.equals(b)) {
							check= false;
							break;
						}
					}if(check==false) break;
				}if(check==false) break;
			}
			if(check) {
				System.out.println(string+" is surprising.");
			}else {
				System.out.println(string+" is NOT surprising.");
			}
		}
	}
}
