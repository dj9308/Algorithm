package algorithm;

import java.util.HashMap;

public class Hash3 {
	public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> kind = new HashMap<String, Integer>();
        
        for(int i=0;i<clothes.length;i++) {
        	if(kind.get(clothes[i][1])==null) {
        		kind.put(clothes[i][1], 1);
        	}else {
        		kind.put(clothes[i][1], kind.get(clothes[i][1])+1);
        	}
        }
        
        for(String keys : kind.keySet()) {
        	answer *= (kind.get(keys)+1);
        }
        answer-=1;
        
        return answer;
    }

	public static void main(String[] args) {
		String[][] clothes = {
			{"crow_mask","face"},
			{"blue_sunglasses","face"},
			{"smoky_maskup","face"},
		};
		System.out.println(solution(clothes));
	}

}
