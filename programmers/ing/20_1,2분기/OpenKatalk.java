package practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//총 소요시간 : 1시간 10분

//느낀점 : 이거 이러다 예선 통과 각이냐???
//          --> 응 쌉소리~~~~~~~~~~~

public class OpenKatalk {

	public static void main(String[] args) {
		String [] record = {"Enter uid1234 Muzi",
				"Enter uid4567 Prodo",
				"Leave uid1234",
				"Enter uid1234 Prodo",
				"Change uid4567 Ryan"};
		String [] ans = solution(record);
		for(int i =0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}
	public static String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        List<String[]> tmp = new LinkedList<>();
 
        for (String records : record)
        {
            String[] keyWord = records.split(" ");
            if (keyWord[0].equals("Enter"))
            {
                map.put(keyWord[1], keyWord[2]);
                tmp.add(keyWord);
            } else if (keyWord[0].equals("Change"))
            {
                map.put(keyWord[1], keyWord[2]);
            } else
            {
                tmp.add(keyWord);
            }
        }
 
        String[] answer = new String[tmp.size()];
        int index = 0;
        for (String[] keyWords : tmp)
        {
            String nickName = map.get(keyWords[1]);
            if (keyWords[0].equals("Enter"))
                answer[index++] = nickName + "님이 들어왔습니다.";
            else
                answer[index++] = nickName + "님이 나갔습니다.";
        }
        return answer;
    }

}
