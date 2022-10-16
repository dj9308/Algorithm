import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public int solution(int[] arr, int n, int k) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            for (int j= i + 1; j < n; j++) {
                for (int l= j + 1; l < n; j++) {
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }

        int cnt = 0;

        for(int x : Tset){
            System.out.println(x);
            cnt++;
            if(cnt == k) return x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ary = new int[n];

        for (int i = 0; i < n; i++) {
            ary[i] = in.nextInt();
        }

        System.out.println(main.solution(ary, n, k));
    }
}