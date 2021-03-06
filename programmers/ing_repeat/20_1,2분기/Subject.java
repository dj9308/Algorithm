package practice;

import java.util.*;

// 持唖税 斐硯
// 1. 庚薦 左切原切 queue 潤醤畏陥壱 持唖.
// 2. 壕匂澗 授託旋生稽 鞠醤馬糠稽 for庚聖 搭背 progresses 壕伸聖 貼事 板 刃戟鞠檎 q拭 煽舌板 匂庚 曽戟.
// 3. 遭楳懸戚 100 戚雌戚檎 q拭 num 煽舌拭
// 4. 100 耕幻戚檎  num戚 0戚 焼諌凶幻 q拭 煽舌, 0戚檎 奄管戚 蒸陥澗 依戚糠稽 巷獣
// 5. 奄管税 遭楳懸戚 100 耕幻昔 奄管戚 刃戟鞠形檎 杏軒澗 獣娃聖 域至廃 板 背雁 奄管税 及拭 是帖廃 奄管級拭亀 遭楳懸聖 希背捜
// 6. q税 size幻鏑 answer 壕伸聖 識情背層 板 for庚聖 搭背 q税 鎧遂聖 answer拭 隔嬢捜

// 汗海繊 : 陥楳備 什澱引 泥澗 庚薦亜 蟹臣獣 嬢汗舛亀 限窒 呪 赤畏陥壱 持唖敗.
// 庚薦研 熱檎 熱呪系 杭亜 叔薦稽 坪漁聖 息凶 弦戚 潤股畏陥壱 持唖馬奄亀...
// 悦汽 訊 獣娃精 神掘杏険猿 あああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああ
// 恥 社推獣娃 : 1獣娃 20歳

public class Subject {

	public static void main(String[] args) {
		int [] progresses = {93,30,55};
		int [] speeds = {1,30,5};
		System.out.println(solution(progresses, speeds));

	} public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
         
        int num = 0;		//奄管税 姐呪研 count
        
        for(int i = 0; i <= progresses.length; i++){
            if(i == progresses.length){
                q.add(num);
                break;
            }
            if(progresses[i] >= 100){
                num++;
                continue;
            }
            if(num != 0){
                q.add(num);
            }
             
            num = 0;
            int remain = 100 - progresses[i];
            int day = remain / speeds[i];
            if(remain % speeds[i] != 0){
                day++;
            }
             
            for(int j = i; j < progresses.length; j++){
                progresses[j] += (day * speeds[j]);
            }
            num++;
        }
     
        int[] answer = new int[q.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = q.remove();
        }
        return answer;
    }

}
