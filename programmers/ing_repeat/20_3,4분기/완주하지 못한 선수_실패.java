package algorithm;


public class hashMap1 {

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		for(int i=0;i<participant.length;i++) {
			boolean check = true;
			for(int j=0;j<completion.length;j++) {
				if(participant[i].equals(completion[j])) {
					completion[j]=null;
					check = false;
					break;
				}
			}
			if(check) {
				answer = participant[i];
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
