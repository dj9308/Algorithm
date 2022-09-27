//설명
//
//대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
//
//문자열은 영어 알파벳으로만 구성되어 있습니다.

//배울 점
//1. 아스키 넘버 활용
//  - 대문자 : 65~90
//  - 소문자 : 97~122

import java.util.Scanner;

public class Main {

    public static String solution(String input){
        String answer = "";

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                answer += Character.toString(Character.toUpperCase(c));
            }else{
                answer += Character.toString(Character.toLowerCase(c));
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }
}