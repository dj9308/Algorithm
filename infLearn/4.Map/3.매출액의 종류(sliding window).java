import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int k, int[] array) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k - 1; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k - 1; rt < array.length; rt++) {
            answer.add(map.size());
            map.put(array[lt], map.get(array[lt]) - 1);
            if (map.get(array[lt]) == 0) map.remove(array[lt]);
            lt++;
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