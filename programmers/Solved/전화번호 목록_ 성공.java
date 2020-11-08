package algorithm;


public class hashMap1 {

	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i=0;i<phone_book.length;i++) {
        	for(int j=0;j<phone_book.length;j++) {
        		if(i==j) continue;
        		if(phone_book[j].indexOf(phone_book[i])==0) {
        			answer = false;
        		}
        	}
        	if(!answer) break;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String[] phone_book = {"12","123","1235","567","88"};
		System.out.println(solution(phone_book));
	}

}
