package practice;

// 생각의 흐름 :
//1. 아스키 코드 사용하여 풀고 (Z-A)/2=13이니 이하는 오른쪽 초과는 왼쪽으로 이동.
//2. 왠지 경우의 수를 계속 보면 귀찮아질 것 같아서  어정쩡하게 더할바엔
// 	   먼저 더해버리고 왼쪽갈때 오른쪽 갈때 구분해서 더하는 걸로.
//3. 왼쪽 갈때 구현을 잘 못해서 시간이 좀 걸림
//4. 마지막 케이스 오류 발생. 건호가 알려준 케이스를 봐서 풀어도 계속 오류 발생.   여기까지 2시간 조금 넘게 소요
//5. 맥주 한캔 따고 음주 코딩 시작.
//6. hashmap list 별의별 다써봤지만 안되다가 맥주 한캔 더 땀.
//7. 불현듯 해괴한 방법이 떠올라 실행. 완료. 		약 40분 소요.

//총 소요시간 : 3시간
//
//느낀점 : 
//1. 시간이 너무 오래걸리는 것 같다.
//2. 음주 코딩의 효험을 맛보았다. 효과는 굉장했다!!!
//3. 테스트 케이스 하나 때문에 코딩의 양이 배로 늘은 것 같다.


public class JoyStick {

	public static void main(String[] args) {
		String name = "ANANAAAAANA";
		System.out.println(solution(name));
	}

	public static int solution(String name) {
		int answer = 0;

		for (int i = 0; i < name.length(); i++) { // 아스키코드로 문자별 숫자 전부 계산
			int distance = name.charAt(i) - 'A';
			if (distance <= 13)
				answer += distance;
			else
				answer += 26 - distance;
		}

		int right = name.length() - 1; // 오른쪽으로 갈 경우

		int index = 0;
		for (int i = 1; i < name.length(); i++) { // 처음의 A는 제외하기 위해 1부터 시작
			index++;
			if (name.charAt(i) != 'A')			//왼쪽으로 갈 경우를 계산하기 위해 인덱스 설정.
				break;

		}

		int left = name.length() - index; // 왼쪽으로 갈 경우

		
		// 연속된 A 구현
		int last = 0;
		int first = 0;
		String check = "";

		for (int i = 0; i < name.length(); i++) {
			check += "A";
			if (name.contains(check))
				continue;
			else {
				check = check.substring(0, check.length() - 1);		//연속된 A가 최대치가 됐을 시 마지막 A 빼고 포문 끝내기.
				break;
			}
		}
//		System.out.println(check);
		int j = 0;
		for (int i = check.length() - 1; i < name.length(); i++) {		//어디가 연속된 A인지 짜맞추기.

			if (check.equals(name.substring(i - (check.length() - 1), check.length() + j))) {
				last = check.length() + j;
				first = i - (check.length() - 1)-1;		
			}
			j++;
		}
		
		last = name.length() - last;
		int middle =0;
		
		if(last<first)
		middle = last * 2 + first;			//왼쪽먼저 갈지 오른쪽 먼저 갈지 비교.
		else middle = first*2+last;
		
//		System.out.println("미들 : " + middle+" : "+first+" "+last);
		
		if (right <= left && right <= middle) {
			answer += right;
		} else if (left <= right && left <= middle) {
			answer += left;
		} else {
			answer += middle;
		}

		return answer;
	}

}
