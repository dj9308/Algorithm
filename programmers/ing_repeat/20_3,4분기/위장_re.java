package algorithm;

import java.util.HashMap;

public class Hash3 {
	public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        for(int i=0;i<clothes.length;i++) {
        	if(hashmap.get(clothes[i][1])==null) {
        		hashmap.put(clothes[i][1],1);
        	}else {
        		hashmap.put(clothes[i][1], hashmap.get(clothes[i][1])+1);
        	}
        }
        
        for(String key : hashmap.keySet()) {
        	answer*=(hashmap.get(key)+1);
        }
        answer-=1;
        return answer;
    }

	public static void main(String[] args) {
		String [][] clothes = {
				{"yello_hat","headgear"},
				{"blue_sunglassess","eyewear"},
				{"green_turban","headgear"},
		};
		System.out.println(solution(clothes));
	}

}
