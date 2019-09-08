package practice;

public class FailRate {

// 총 소요시간 : 1시간 40분
	
	public static void main(String[] args) {
		int N = 4;
		int stages [] = {4,4,4,4,4};
		int ans []= solution(N, stages);
		for(int i =0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}

	}
    public static int[] solution(int N, int[] stages) {
        int[] count = new int[N + 2];
        double[] rate = new double[N + 1];
        int[] answer = new int[N];
        for (int i = 0; i < stages.length; i++) {
            count[stages[i]]++;
        }
        int sum = 0;
        for (int i = count.length - 1; i > 0; i--) {
            sum += count[i];
            if (i <= N) {
                rate[i] = (double)count[i] / sum;
            }
        }

        double max;
        boolean[] check = new boolean[N + 1];
        for (int i = 0; i < rate.length-1; i++) {
            max = rate[i+1];
            int key =i+1;
            for (int j = 1; j < rate.length; j++) {
                if(!check[j]){
                    if (max < rate[j]) {
                        max = rate[j];
                        key = j;
                    } else if (max == rate[j]) {
                        if (key > j) {
                            key = j;
                        }
                    }
                }
            }
            answer[i] = key;
            check[key] = true;
            rate[key] = 0;
        }

        return answer;
    }

}
