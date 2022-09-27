import java.util.Scanner;

public class Main {

    public static String solution(String input) {
        String answer = "";
        char[] arr = input.toCharArray();

        for(char c : arr){
            if(Character.isDigit(c)){
                answer += String.valueOf(c);
            }
        }

        while(answer.indexOf("0") == 0) {
            answer = answer.substring(1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(solution(input));
    }
}