//10. ���� ª�� ���� �Ÿ�
//
// ������ : max ���� ������ ����� �߾����� ����� �� ���� ��������.


package algorithm;

import java.util.Scanner;

public class Main {
	public String solution(String input) {
		String answer = "NO";
		String input2 = input.toUpperCase().replaceAll("[^A-Z]", "");
		String relative = new StringBuilder(input2).reverse().toString();
		
		if(relative.equals(input2)) answer = "YES";
		
		return answer;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		String answer = main.solution(input);
		System.out.println(answer);
	}
}