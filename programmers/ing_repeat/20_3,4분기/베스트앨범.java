package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Hash3 {
	public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String, Integer> PlaysCountedMap = new HashMap<String, Integer>();
        
        for(int i=0;i<plays.length;i++) {
        	if(PlaysCountedMap.get(genres[i])==null)	
        		PlaysCountedMap.put(genres[i], plays[i]);
        	else {
        		PlaysCountedMap.put(genres[i], PlaysCountedMap.get(genres[i])+plays[i]);
        	}
        }

        for(String key : PlaysCountedMap.keySet()) { // 내림차순 정렬 
        
        }
        
        return answer;
    }

	public static void main(String[] args) {
		String[] genres = {"classic","pop","classic","classic","pop"};
		int[] plays = {500,600,150,800,2500};
		System.out.println(solution(genres, plays));
	}

}
