package algori;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2 {

	public String solution(int[] numbers) {
		String answer = "";

		String[] arr = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			arr[i] = (String.valueOf(numbers[i]));
		}
		Arrays.sort(arr, new cmp());
		for (int j = 0; j < arr.length; j++) {
			answer += arr[j];
		}
		return answer;
	}
}

class cmp implements Comparator<String> {
	public int compare(String a, String b) {
		return (b + a).compareTo(a + b);
	}

}
