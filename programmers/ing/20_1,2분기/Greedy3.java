import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
	        Arrays.sort(people);
	        HashMap<Integer, Integer> ary = new HashMap<Integer, Integer>();
	        
	        for(int i=0;i<people.length;i++) {	//�迭�� hashmap�� ���(�յڷ� �����ϰ� ������)
	        	ary.put(i, people[i]);
	        }
	        
	        int i =0;
	        int j =0;
	        
	        while(true) {
	        	if(ary.get(i)+ary.get(people.length-1-j)<=limit) {	// ���� ���� ������+���� ū ������ <= ���� 
	        		// : �Ѵ� ��Ʈ�� �¿�� (remove) �����Ʈ++(answer++)
	        		ary.remove(i);
	        		ary.remove(people.length-1-j);
	        		i++;
	        		j++;
	        		answer++;
	        	}else{		// Ŭ ��� ���� ū ����� ����Ʈ �¿��
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