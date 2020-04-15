package april_second;

import java.util.Scanner;
import java.util.Stack;

public class No_2608 {
	public static int RomeToNum(String num) {
		String[] number = num.split("");
		int answer = 0;
		for(int i=0;i<number.length;i++) {
			if(number[i].equals("M")) {
				answer+=1000;
			}
			if(number[i].equals("D")) {
				answer+=500;
			}
			if(number[i].equals("C")) {
				if(i!=number.length-1) {
					if(number[i+1].equals("D")|| number[i+1].equals("M")) {
						answer-=100;
					}else {
						answer+=100;
					}
				}else answer+=100;
			}
			if(number[i].equals("L")) {
				answer+=50;
			}
			if(number[i].equals("X")) {
				if(i!=number.length-1) {
					if(number[i+1].equals("L") || number[i+1].equals("C")) {
						answer-=10;
					}else {
						answer+=10;
					}
				}else answer+=10;
			}
			if(number[i].equals("V")) {
				answer+=5;
			}
			if(number[i].equals("I")) {
				if(i!=number.length-1) {
					if(number[i+1].equals("V") || number[i+1].equals("X")) {
						answer-=1;
					}else {
						answer+=1;
					}
				}else answer+=1;
			}
		}
		return answer;
	}
	
	public static String NumToRome(int num) {
		String string = String.valueOf(num);
		String[] array = string.split("");
		int count = 1;
		Stack<String> stack = new Stack<String>();
		String answer="";
		for(int i=array.length-1;i>=0;i--) {
			String part = "";
			int numb = Integer.parseInt(array[i]);
			if(count==1) {
				if(numb!=4 && numb!=9) {
					if(numb>=5) {
						part+="V";
						for(int j=0;j<numb-5;j++) {
							part+="I";
						}
					}else {
						for(int j=0;j<numb;j++) {
							part+="I";
						}
					}
				}else if(numb==4) {
					part+="IV";
				}else {
					part+="IX";
				}
				stack.push(part);
			}else if(count==2) {
				if(numb!=4 && numb!=9) {
					if(numb>=5) {
						part+="L";
						for(int j=0;j<numb-5;j++) {
							part+="X";
						}
					}else {
						for(int j=0;j<numb;j++) {
							part+="X";
						}
					}
				}else if(numb==4) {
					part+="XL";
				}else {
					part+="XC";
				}
				stack.push(part);
			}
			else if(count==3) {
				if(numb!=4 && numb!=9) {
					if(numb>=5) {
						part+="D";
						for(int j=0;j<numb-5;j++) {
							part+="C";
						}
					}else {
						for(int j=0;j<numb;j++) {
							part+="C";
						}
					}
				}else if(numb==4) {
					part+="CD";
				}else {
					part+="CM";
				}
				stack.push(part);
			}
			else if(count==4) {
				for(int j=0;j<numb;j++) {
					part+="M";
				}
				stack.push(part);
			}
			count++;
		}
		for(int i=0;i<array.length;i++) {
			answer+=stack.pop();
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		int answer = RomeToNum(num1)+RomeToNum(num2);
		System.out.println(answer);
		System.out.println(NumToRome(answer));
	}

}
