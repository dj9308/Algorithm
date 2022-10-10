import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public String solution(String input1, String input2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        char[] arr1 = input1.toCharArray();
        char[] arr2 = input2.toCharArray();

        for (char c : arr1) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : arr2) {
            if (map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }

        for(char c : map.keySet()){
            if(map2.get(c) == null){
                answer = "NO";
            }else if(!Objects.equals(map2.get(c), map.get(c))){
                answer = "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        System.out.println(main.solution(input1, input2));

    }
}