import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
	        Arrays.sort(people);
	        HashMap<Integer, Integer> ary = new HashMap<Integer, Integer>();
	        
	        for(int i=0;i<people.length;i++) {	//배열을 hashmap에 담기(앞뒤로 수월하게 빼려고)
	        	ary.put(i, people[i]);
	        }
	        
	        int i =0;
	        int j =0;
	        
	        while(true) {
	        	if(ary.get(i)+ary.get(people.length-1-j)<=limit) {	// 제일 작은 몸무게+제일 큰 몸무게 <= 제한 
	        		// : 둘다 보트에 태우고 (remove) 구명모트++(answer++)
	        		ary.remove(i);
	        		ary.remove(people.length-1-j);
	        		i++;
	        		j++;
	        		answer++;
	        	}else{		// 클 경우 제일 큰 사람만 구명보트 태우기
	        		ary.remove(people.length-1-j);
	        		answer++;
	        		j++;
	        	}
	        	if(ary.size()==0) {
	        		break;
	        	}
	        }
	        return answer;
    }
}