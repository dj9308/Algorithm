package algorithm;

import java.util.ArrayList;

public class hashMap1 {

	public static String solution(String[] participant, String[] completion) {
		ArrayList<String> array = new ArrayList<String>();
		String answer = "";
		
		for(int i=0;i<completion.length;i++) {
			array.add(completion[i]);
		}
		
		for(int i=0;i<participant.length;i++) {
			for(int j=0;j<array.size();j++) {
				if(participant[i].equals(array.get(j))) {
					array.remove(j);
					break;
				}else {
					if(j==array.size()-1) {
						answer=participant[i];
						break;
					}
				}
			}
			if(!answer.equals("") || array.isEmpty()) {
				answer=participant[i];
				break;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String[] participant = new String[] { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = new String[] { "josipa", "filipa", "marina", "nikola" };
		System.out.println(solution(participant, completion));
	}

}
