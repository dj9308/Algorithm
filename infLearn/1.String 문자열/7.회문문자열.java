import java.util.Scanner;

public class Main {

    public static String solution(String input) {
        String answer = "YES";
        char[] arr = input.toCharArray();
        int lt = 0, rt = arr.length-1;

        while (lt < rt) {
            if(Character.toLowerCase(arr[lt]) == Character.toLowerCase(arr[rt])){
                rt--;
                lt++;
            }else{
                answer = "NO";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }
}