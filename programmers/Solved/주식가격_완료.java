package algorithm;


public class Stack1 {
	
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i=0;i<prices.length;i++) {
        	for(int j=i+1;j<prices.length;j++) {
            	if(prices[i]>prices[j]) {
            		answer[i]=j-i;
            		break;
            	}
            	if(j==prices.length-1) answer[i]=j-i;
            }
        }
        for(int i=0;i<prices.length;i++) {
        	System.out.println(answer[i]);
        }
        return answer;
    }
    
	public static void main(String[] args) {
		int prices[] = {4,5,4,0,0,4};
		System.out.println(solution(prices));;
	}

}
