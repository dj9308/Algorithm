package algori;

// 鯉推析 熱醸聖 凶 闇硲拭惟辞 微闘研 条製.
// 益依精 坦製殖 益撹 置企葵聖 胡煽 姥背辞 熱檎 鞠澗匝 硝紹澗汽
// 置企葵聖 胡煽 姥廃 岩左陥 焼観 岩戚 希 適 呪 赤陥澗 依.

// 益掘辞 置企葵聖 胡煽 姥馬壱 熱醸聖 凶人 砧腰属稽 笛 葵生稽 熱醸聖 凶研
// 搾嘘馬澗 依.

// 鯉推析 熱揮 号狛昔 葛球戚疑精 廃域亜 赤嬢 熟陥 走崇.
// 伍纏 哀焼然球たたたたたたたたたたたたたたたたたたたたたた

// 恥獣娃  : 鉦 6獣娃. (珊憎幻 6獣娃)

// 汗海 繊 : 庚薦 祢澗汽 戚係惟 獣娃戚 神掘 杏鍵陥澗 依精 廃凧 菰醸陥澗 依. 
// 岨 希 庚薦 熱戚拭 獣娃聖 拝蕉馬壱 希 蟹精 号狛聖 達焼左奄.
// 嬢形随 依 旭生檎 姥薄 亀縦亀澗 巷繕闇 益形左壱 獣拙馬奄.
// 益軒壱 増拭辞澗 箭企 馬走 源奄.
// 焼艦 悦汽 訊 訓展績拭君亜 蟹澗暗醤 遭促 重酵馬惟 廃暗旭精巨 ああ

// 悦汽 益 悪紫還精 2爽 幻拭 硝壱軒葬 陥 拝呪赤陥澗汽 戚杏 嬢胸惟 2爽幻拭 馬劃

class GTA {

	public static void main(String[] args) {
		int[] money = {1,2,3,1};
		System.out.println(solution(money));
	}	
	  public static int solution(int[] money) {
		return Math.max(Maxmoney(money, 0, money.length-1), Maxmoney(money, 1, money.length)); 
	    }
	  public static int Maxmoney(int[] money, int start, int finish) {
		  int don =0;		//儀
		  int preO = 0;		//戚穿 増 纏纏 O
		  int preX = 0;		//戚穿 増 纏纏 X
		  
		  int TodO = 0;		//薄仙 増 纏纏 O
		  int TodX = 0;		//薄仙 増 纏纏 X
		  
		  for(int i=start;i<finish;i++) {
			TodO = preX+money[i];			// 薄仙 増聖 纏纏 拝 井酔 戚穿 増聖 纏纏 馬走 省聖 井酔人 希馬奄
			TodX = Math.max(preO, preX);	// 薄仙 増聖 纏纏 馬走 省聖 井酔殖 戚穿増聖 纏纏 馬走 省聖 井酔人 纏纏拝 井酔掻 笛 葵聖 煽舌.
			
			if(TodO>TodX) 
				don=Math.max(don,TodO);
			else
				  don=Math.max(don, TodX);
			
			
			
			preO = TodO;
			preX = TodX;
		  }
		  return don;
	  }
}
