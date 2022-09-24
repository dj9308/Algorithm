package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public String solution(String input) {
		String answer = "";
		ArrayList<Character> list = new ArrayList<Character>();
		char[] array = input.toCharArray();
		char first = '`';
 		
		for(int i =0; i<array.length;i++) {
			if(list.indexOf(array[i]) == -1) list.add(array[i]);
		}
		
		for(int i =0; i<list.size();i++) {
			answer+=String.valueOf(list.get(i));
		}
		
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