import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public String solution(int k, int[] array) {
        String answer = "";
        int lp = array.length - k;

        while (lp < array.length) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int idx = lp - k + 1;
            int cnt = 0;

            while (idx <= lp) {
                if (!map.containsKey(array[idx])) {
                    map.put(array[idx], 1);
                    cnt++;
                }
                idx++;
            }
            answer += String.valueOf(cnt);
            if (lp++ < array.length - 1) answer += " ";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ary = new int[n];

        for (int i = 0; i < ary.length; i++) {
            ary[i] = in.nextInt();
        }

        System.out.println(main.solution(k, ary));
    }
}