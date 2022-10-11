import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public char solution(int input1, String input2) {
        char answer = ' ';
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = input2.toCharArray();

        for (Character c : arr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        Character[] keyAry = map.keySet().toArray(new Character[map.size()]);

        for (Character character : keyAry) {
            if (max < map.get(character)) {
                max = map.get(character);
                answer = character;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        String input2 = in.next();
        System.out.println(main.solution(input1, input2));

    }
}