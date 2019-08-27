package algori;

import java.util.Arrays;
import java.util.Comparator;

public class Sort3 {
	public int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);

		for (int i = 0; i < citations.length; i++) {
			int h = citations.length - i;

			if (citations[i] >= h) {
				answer = h;
				break;
			}
		}

		return answer;
	}
}
