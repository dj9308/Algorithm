package algorithm;


public class Hash3 {
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i=0;i<phone_book.length;i++) {
        	for(int j=0;j<phone_book.length;j++) {
            	if(i==j) continue;
            	if(phone_book[j].startsWith(phone_book[i])) {
            		answer = false;
            		break;
            	}
            }
        	if(!answer) break;
        }
        return answer;
    }

	public static void main(String[] args) {
		String[] phone_book = {"119","97674223","1195524421"};
		System.out.println(solution(phone_book));
	}

}
