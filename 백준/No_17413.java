package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class No_17413 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		Stack<String> stack = new Stack<String>();
		String subject = sc.nextLine();
		while(true) {
			String arrayWord ="";
			if(subject.length()==0) break;
			if(subject.substring(0, 1).equals("<")) {
				int last = subject.indexOf(">");
				arrayWord = subject.substring(0, last+1);
				list.add(arrayWord);
				subject = subject.substring(last+1);
			}else {
				if(subject.contains("<")) {
					int first = subject.indexOf("<");
					arrayWord=subject.substring(0, first);
					subject=subject.substring(first);
				}else {
					arrayWord=subject;
					subject="";
				}
				String split[] = arrayWord.split(" ");
				String word [];
				for(int i=0;i<split.length;i++) {
					word = split[i].split("");
					for(int j=0;j<word.length;j++) {
						stack.push(word[j]);
					}
					arrayWord ="";
					for(int j=0;j<word.length;j++) {
						arrayWord+= stack.pop();
					}
					if(i<split.length-1) {
						arrayWord+=" ";
					}
					list.add(arrayWord);
				}
			}
		}
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
	}

}
