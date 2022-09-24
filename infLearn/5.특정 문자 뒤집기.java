package algorithm;

import java.util.Scanner;

public class Main {
	public String solution(String input) {
		String answer = "";
		char[] array = input.toCharArray();
		int lt = 0, rt = array.length-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(array[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(array[rt])) {
				rt--;
			}else {
				char tmp = array[lt];
				array[lt] = array[rt];
				array[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(array);
		return answer;
	}
	
  public static void main(String[] args){
	Main main = new Main();
    Scanner in=new Scanner(System.in);
    String input = in.next();
    
    String answer = main.solution(input);
    System.out.println(answer);
  }
}