package algorithm;


public class hashMap1 {

	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        int headLength = 0;
        
        for(int i=0;i<phone_book.length;i++) {
        	headLength = phone_book[i].length();
        	for(int j=i+1;j<phone_book.length;j++) {
        		System.out.println(phone_book[i]+" : "+phone_book[j].substring(0, headLength));
        		if(headLength<=phone_book[j].length() &&
        				phone_book[i].equals(phone_book[j].substring(0, headLength))) {
        			answer = false;
        			break;
        		}
        	}
        	if(!answer) break;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String[] phone_book = {"123","456","789"};
		System.out.println(solution(phone_book));
	}

}
