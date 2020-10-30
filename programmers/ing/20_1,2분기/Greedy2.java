class Solution {
    public String solution(String number, int k) {
        int m = 0;
        char max;
	StringBuffer answer = new StringBuffer();


	for(int i = 0; i < number.length() - k; i++) {
		max = '0';
		for(int j = m; j <= k + i; j++) {
	        	if(max < number.charAt(j)) {
	        		max = number.charAt(j); 
                    m = j + 1;
	        	}
		}			
		answer.append(max);
	}
        return answer.toString();
    }
}