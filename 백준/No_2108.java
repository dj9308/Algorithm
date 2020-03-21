package algorithm;

import java.util.Scanner;
import java.util.Arrays;
 
public class No_2108 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int Total = 0;
        int[] Result = new int[4];	
        int[] Int_Arrays = new int[N];	
        int[] Much_Number = new int[8001];	
        
        for(int i = 0; i < N; i++) {
            Int_Arrays[i] = sc.nextInt();
            Total += Int_Arrays[i];	
            Much_Number[Int_Arrays[i] + 4000]++;
        }
        
        int min = 0;
        
        for(int i = 0; i < Much_Number.length; i++) {
            if(min < Much_Number[i]) {
                min = Much_Number[i];
            }
        }
        
        int[] two_min = new int[2];	
        int j = 0;
        
        for(int i = 0; i < Much_Number.length; i++) {
            if(two_min[0] != 0 && two_min[1] != 0)
                break;
            
            if(min == Much_Number[i]) {
                two_min[j] = i;
                j++;
            }
        }
        
        if(two_min[1] == 0)
            two_min[1] = two_min[0];
        
        Arrays.sort(Int_Arrays);	//	Á¤·Ä
        
        Result[0] = (int) Math.round((double)Total / N);	//	»ê¼úÆò±Õ
        Result[1] = Int_Arrays[N/2];	//	Áß¾Ó°ª
        Result[2] = two_min[1] - 4000;	//	ÃÖºó°ª
        Result[3] = Int_Arrays[N-1] - Int_Arrays[0];	//	¹üÀ§
        
        System.out.println(Result[0]);
        System.out.println(Result[1]);
        System.out.println(Result[2]);
        System.out.println(Result[3]);
    }
}