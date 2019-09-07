import java.util.*;

public class Solution {
    int answer = Integer.MAX_VALUE;

    public int solution(String begin, String target, String[] words) {
    	
        int[] isUsed = new int[words.length];
        for(int a=0;a<isUsed.length;a++)
        	isUsed[a]=0;		//문자열 재 검사를 방지 하기 위한 배열  

        dfs(begin, target,words,0,isUsed);
        
        if(!target.equals(words[words.length-1]))
        	answer= 0;		//배열의 마지막 문자열이 타겟이 아닌경우 0리턴
        return answer;
    }
    
    public void dfs(String begin, String target, String[] words, int count,int[] isUsed) {
    	
        if(target.equals(begin)) {
            answer = Math.min(answer, count);
            return;
        }else
        count++;

        for(int i = 0 ; i < words.length; i++) {
            //변경 되어야 할 글자의 수 
            int strCnt = 0;
            for(int j = 0 ; j < begin.length(); j++) {
                if(begin.charAt(j) != words[i].charAt(j)) {
                    strCnt++;
                }
            }
            //글자 수가 하나만 차이가 나면 dfs 수행한다 
            if(strCnt == 1 && isUsed[i] == 0) {
                isUsed[i] = -1;
                dfs(words[i], target, words,count,isUsed);
                isUsed[i] = 0;
            }
        }
        return;
    }
}
