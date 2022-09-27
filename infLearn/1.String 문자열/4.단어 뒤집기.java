//4. 단어 뒤집기
//
//        설명
//        N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
//
//        입력
//        첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
//        두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
//
//        출력
//        N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static String solution(String input) {
        String answer = "";
        Stack<String> stack = new Stack<>();

        for(String s : input.split("")){
            stack.push(s);
        }

        for(int i =0;i<input.length();i++){
            answer += stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String [] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.next();
        }
        for (int i = 0; i < N; i++) {
            System.out.println(solution(arr[i]));;
        }
    }
}