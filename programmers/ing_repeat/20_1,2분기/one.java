import java.util.*;

public class Solution {
    int answer = Integer.MAX_VALUE;

    public int solution(String begin, String target, String[] words) {
    	
        int[] isUsed = new int[words.length];
        for(int a=0;a<isUsed.length;a++)
        	isUsed[a]=0;		//���ڿ� �� �˻縦 ���� �ϱ� ���� �迭  

        dfs(begin, target,words,0,isUsed);
        
        if(!target.equals(words[words.length-1]))
        	answer= 0;		//�迭�� ������ ���ڿ��� Ÿ���� �ƴѰ�� 0����
        return answer;
    }
    
    public void dfs(String begin, String target, String[] words, int count,int[] isUsed) {
    	
        if(target.equals(begin)) {
            answer = Math.min(answer, count);
            return;
        }else
        count++;

        for(int i = 0 ; i < words.length; i++) {
            //���� �Ǿ�� �� ������ �� 
            int strCnt = 0;
            for(int j = 0 ; j < begin.length(); j++) {
                if(begin.charAt(j) != words[i].charAt(j)) {
                    strCnt++;
                }
            }
            //���� ���� �ϳ��� ���̰� ���� dfs �����Ѵ� 
            if(strCnt == 1 && isUsed[i] == 0) {
                isUsed[i] = -1;
                dfs(words[i], target, words,count,isUsed);
                isUsed[i] = 0;
            }
        }
        return;
    }
}
