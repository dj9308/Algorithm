class Solution {
    public int solution(int[] numbers, int target) {
     int answer = 0;
	        int num =0;
	        for(int i =0;i<numbers.length;i++) {
	        	num+=numbers[i];
	        }
	        for(int i =0;i<numbers.length;i++) {
	        	if(num-numbers[i]*2==target) {
	        		answer++;
	        	}
	        }
	        return answer;
    }
}