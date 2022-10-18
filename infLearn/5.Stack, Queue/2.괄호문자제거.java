import java.util.Scanner;
import java.util.Stack;

public class Main {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') ;
            } else stack.push(x);
        }

        for (Character character : stack) answer += character;
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(main.solution(str));
    }
}