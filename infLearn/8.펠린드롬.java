import java.util.Scanner;

public class Main {

    public static String solution(String input) {
        String answer = "";
        char[] arr = input.toCharArray();
        int lt = 0, rt = arr.length-1;

        while (lt < rt) {
            while(!Character.isAlphabetic(arr[lt])){
                lt++;
            }
            while(!Character.isAlphabetic(arr[rt])){
                rt--;
            }
            if(Character.toLowerCase(arr[lt]) == Character.toLowerCase(arr[rt])){
                answer = "YES";
                lt++;
                rt--;
            }else{
                answer = "NO";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(solution(input));
    }
}