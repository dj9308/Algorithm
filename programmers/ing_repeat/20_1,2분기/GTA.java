package algori;

// 목요일 풀었을 때 건호에게서 힌트를 얻음.
// 그것은 처음엔 그냥 최대값을 먼저 구해서 풀면 되는줄 알았는데
// 최대값을 먼저 구한 답보다 아닌 답이 더 클 수 있다는 것.

// 그래서 최대값을 먼저 구하고 풀었을 때와 두번째로 큰 값으로 풀었을 때를
// 비교하는 것.

// 목요일 풀던 방법인 노드이동은 한계가 있어 싹다 지움.
// 멘탈 갈아졌드ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ

// 총시간  : 약 6시간. (뻘짓만 6시간)

// 느낀 점 : 문제 푸는데 이렇게 시간이 오래 걸린다는 것은 한참 멀었다는 것. 
// 좀 더 문제 풀이에 시간을 할애하고 더 나은 방법을 찾아보기.
// 어려울 것 같으면 구현 도식도는 무조건 그려보고 시작하기.
// 그리고 집에서는 절대 하지 말기.
// 아니 근데 왜 런타임에러가 나는거야 진짜 신박하게 한거같은디 ㄲㄲ

// 근데 그 강사님은 2주 만에 알고리즘 다 할수있다는데 이걸 어떻게 2주만에 하냐

class GTA {

	public static void main(String[] args) {
		int[] money = {1,2,3,1};
		System.out.println(solution(money));
	}	
	  public static int solution(int[] money) {
		return Math.max(Maxmoney(money, 0, money.length-1), Maxmoney(money, 1, money.length)); 
	    }
	  public static int Maxmoney(int[] money, int start, int finish) {
		  int don =0;		//돈
		  int preO = 0;		//이전 집 탈탈 O
		  int preX = 0;		//이전 집 탈탈 X
		  
		  int TodO = 0;		//현재 집 탈탈 O
		  int TodX = 0;		//현재 집 탈탈 X
		  
		  for(int i=start;i<finish;i++) {
			TodO = preX+money[i];			// 현재 집을 탈탈 할 경우 이전 집을 탈탈 하지 않을 경우와 더하기
			TodX = Math.max(preO, preX);	// 현재 집을 탈탈 하지 않을 경우엔 이전집을 탈탈 하지 않을 경우와 탈탈할 경우중 큰 값을 저장.
			
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
