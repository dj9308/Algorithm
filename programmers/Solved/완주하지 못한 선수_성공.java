package algorithm;

import java.util.Arrays;

public class hashMap1 {

	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
        int i;
		for(i=0;i<completion.length;i++) {
			if(!participant[i].equals(completion[i]))		
				return participant[i];
		}
		return participant[i];
	}
	
	public static void main(String[] args) {
		String[] participant = new String[] { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = new String[] { "josipa", "filipa", "marina", "nikola" };
		System.out.println(solution(participant, completion));
	}

}
