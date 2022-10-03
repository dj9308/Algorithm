import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static int[] solution(int[] input1, int[] input2) {
        int[] answer = new int[input1.length + input2.length];
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for (int j : input1) {
            stack.push(j);
        }

        for (int j : input2) {
            int num2 = stack.pop();
            while (stack.size() > 0 && num2 > j) {
                stack2.push(num2);
                num2 = stack.pop();
            }
            if(num2>j){
                stack.push(j);
                stack.push(num2);
            }else{
                stack.push(num2);
                stack.push(j);
            }
            while (stack2.size() > 0) {
                stack.push(stack2.pop());
            }
        }

        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] input1 = new int[n];

        for (int i = 0; i < n; i++) {
            input1[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] input2 = new int[m];

        for (int i = 0; i < m; i++) {
            input2[i] = in.nextInt();
        }

        int[] answer = solution(input1, input2);

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
            if (i < answer.length - 1) System.out.print(" ");
        }
    }
}