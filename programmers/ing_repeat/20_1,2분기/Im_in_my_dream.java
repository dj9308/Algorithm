package practice;

//持唖税 斐硯
//
//刃穿貼事 唖戚陥. 
//3舘 壱製聖 馬形檎 鋼球獣 固 蒋拭 *戚 人醤馬壱 固 及拭澗 ++亜 赤嬢醤敗.
//魚虞辞 戚 鋭帳聖 塘企稽 姥失吉 庚切伸聖 蝕蓄旋背亜悟 穿端貼事聖 遭楳馬奄稽.
//坦製 製蝕 1稽 獣拙背辞 n聖 幻球澗 暗虞 n聖 3生稽 蟹刊暗蟹 1聖 皐辞 1聖 幻級 呪 赤生檎 岩戚 馬蟹 装亜馬澗 依.
// stackoverflow => ???????????????????????????????????????????????????????????
// 繕闇採研 馬蟹 隔嬢醤拝依旭精汽 亀巷走 持唖戚 照害.
// 益掘辞 姥識持還 達陥亜 衣厩 陥献紫寓 岩戚 沙 岩引 搾汁廃 惟 赤嬢辞 繕杯背沙衣引 庚薦研 達製.

//1聖 皐澗 依精 +税 鯵呪研 装亜獣徹澗 依聖 税耕. 戚闇 *++ 莫殿拭辞 +税 鯵呪澗 *税 砧 壕亜 鞠悟 鋭帳拭 限惟 庚切伸聖 壕帖梅陥檎 戚 去硲澗 鋼球獣 限製.
//
//魚虞辞 +庚切研 装亜獣迭 凶原陥 亜管廃 *税 鯵呪税 2壕亜 +税 鯵呪研 角嬢竺 呪 蒸陥檎 +税 呪亜 格巷 弦精 依戚糠稽 蒋生稽 希 戚雌 遭楳拝 琶推亜 製戎.
//戚持唖戚 照蟹辞 20歳 舛亀 走端
//砺什闘追戚什 刃戟昔汽 獣娃戚 巷充 7000戚蟹 鞠澗亜....

//汗海繊 : 庚薦幻 薦企稽 戚背馬壱 呪俳旋生稽 繕榎 持唖馬檎 蟹硯 習錘庚薦.
//悦汽 庚薦戚背幻 30歳 杏顕せせせせせせせせせせせせせせせ 獣採啓傾
//杭亜 刃穿貼事戚蟹 貼水狛旭精闇 焼戚泥砺什闘旭精 汗界.
//
//亀企端 獣娃聖 匝戚形檎 杖原蟹 希 切爽 坐醤拝猿 焼送 廃凧 菰醸陥.
//戚腰鰍亀 朝朝神 坪砺澗 砧庚薦 祢澗 依戚 鯉妊. 荷層馬惟. 戚薦 鎧 紺誤精 竺荷層戚陥.
//恥 社推獣娃 : 1獣娃 30歳

public class Im_in_my_dream {

	public static void main(String[] args) {
		int n = 2147483647;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
	      int answer = 0;
	      answer = back(n-2, 2);
	      return answer;
	   }

	    public static int back(int n, int num) {
	    	
	        if(n == 3) {
	        	if(num ==2) {
	        		return 1;
	        	}else {
	        		return 0;
	        	}
	        }
	        
	        if(n < 1 || 2*Math.log10(n)/Math.log10(2) < num) return 0;
	        
	        int ret = 0;
	        
	        if(n%3 == 0 && num >= 2)
	            ret += back(n/3, num-2);

	        ret += back(n-1, num+1);

	        return ret;
	        

	    }

}
