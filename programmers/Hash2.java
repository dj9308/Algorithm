package algori;
import java.util.Arrays;
class Hash2 {
    public boolean solution(String[] phoneBook) {
        Arrays.sort(phoneBook);
        
        boolean result = true;
        
        for (int i=0; i<phoneBook.length-1; i++) {
        	 
            if (phoneBook[i+1].substring(0, phoneBook[i].length()).equals(phoneBook[i])) {
                result = false;
                break;
            }
        }
        return result;
    }
}