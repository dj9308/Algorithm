package practice;

import java.util.Arrays;
import java.util.Collections;

/*
생각의 흐름 : 
1. 더할때마다 포문을 돌려야하나? => 개소리
2. 처음에 더하면서 비교하는건 뭔가 표현이 어려울거 같음. 여기까지 소요시간 약 2시간
3. 그러면 빼서 비교를 해보자. 
4. 1씩 증가하는 결과값에 큰것부터 빼면서 0이 될경우 그 결과값은 표현할 수 있는 결과값이라는 것.
5. 효율성에서 다 틀림------------------------------------------------------
6. 아무래도 반복문을 이중으로 돌려서 그렇거나 정렬을 이용해서 그런듯.
7. 에러를 잡으려다 나 자신이 에러가 걸려 break;
이걸 한번에 맞추는 사람은 정말 천재인 것 같다.

느낀점 : 
	
1. ★내림차순 정렬을 시행하기 위한 과정을 알았다.★
특히 sort를 하고 Collections.reverseOrder()을 하려 했는데 오류가 걸리길래 뭔지 봤는데
int 와 integer의 차이 때문이라는 것을 알게 되었고. 그 차이점은 언박싱과 박싱의 차이점.

2. 생각을 전환하는것이 유의미했다.
처음엔 값을 더하려고 포문을 여러번 돌릴까 하는 미친 생각을 했었는데 빼고 비교하자라는 생각을 해서 표현시키는 것이 유효했다.

3. 어느 순간 알고리즘 문제는 아이큐테스트와 별반 차이가 없다는 것을 느끼게 된다.
나자신의 아이큐가 그렇게 내세울 것이 아니기 때문에 더 반복해서 문제에 익숙해져야 겠다라는 생각이 들었다.

문제 풀이 총 소요 시간 : 3시간
*/
public class Scale {

	public static void main(String[] args) {
		int[] weight = { 3, 1, 6, 2, 7, 30, 1 };
		System.out.println(solution(weight));

	}

	public static int solution(int[] weight) {

		Integer[] weight1 = new Integer[weight.length];
		for (int i = 0; i < weight.length; i++) {
			weight1[i] = weight[i];
		}
		Arrays.sort(weight1, Collections.reverseOrder());

		int w = 0;
		while (true) {
			int s = w;
			for (int i = 0; i < weight.length; i++) {
				s -= weight1[i];
				if (s < 0) {			// 무게를 너무 많이 빼서 0보다 작을 경우 
					s += weight1[i]; 	// 다시 더하기
				} else if (s == 0) {	// 무게가 같을 경우 넘어감
					break;
				} else if (i == weight.length - 1 && s >= 1) {	//weight 의 길이대로 다 돌려졌는데 무게가 남아있다면 그것이 답.
					return w;
				}

			}
			w++;
		}

	}

}
