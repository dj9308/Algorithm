import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> solution(int[] input1, int[] input2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while(p1<input1.length && p2<input2.length){
            if(input1[p1] < input2[p2]){
                answer.add(input1[p1++]);
            }else{
                answer.add(input2[p2++]);
            }
        }

        while(p1 < input1.length){
            answer.add(input1[p1++]);
        }

        while(p2 < input2.length){
            answer.add(input2[p2++]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] input1 = new int[n];

        for (int i = 0; i < n; i++) {
            input1[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] input2 = new int[m];

        for (int i = 0; i < m; i++) {
            input2[i] = in.nextInt();
        }

        ArrayList<Integer>  answer = solution(input1, input2);

        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i));
            if (i < answer.size() - 1) System.out.print(" ");
        }
    }
}