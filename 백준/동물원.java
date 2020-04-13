package algorithm;

import java.util.*;

public class No_1309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int d[] = new int[n+1];
        d[0] = 1; d[1] = 3;
        for(int i=2;i<=n;i++){
            d[i] = d[i-2]+d[i-1]*2;
            d[i]%=9901;
        }
        System.out.println(d[n]%9901);
        sc.close();
    }
}