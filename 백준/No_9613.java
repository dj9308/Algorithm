package algorithm;

import java.util.*;

public class No_9613 {
	
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0;i<T;i++) {
        	long answer = 0;
        	int N = sc.nextInt();
        	int array[] = new int[N];
        	
        	for(int j=0;j<N;j++) {
        		array[j] = sc.nextInt();
        	}
        	
        	for(int j=0;j<N;j++) {
        		for(int k=j+1;k<N;k++) {
        			int a = array[j];
        			int b = array[k];
    				while(a!=0) {
    					int r = b%a;
    					b = a;
    					a = r;
    				}
    				answer+=b;
        		}
        	}
        	System.out.println(answer);
        }
    }
}