package practice;

//느낀점
//1. 처음에 생각을 해본결과 굳이 우선순위 큐를 쓸 필요가 없다고 생각했다.
//2. 그래서 리스트로만 구현하면 될거같아 싶어서 구현한 결과 좋게 나왔다.
//3. 비교적 쉽다고 생각했는데 아직도 시간이 오래걸린다. 쉬는 시간까지 합하면 거의 2시간 반이 걸린다.
//	조금더 복습하고 생각의 흐름을 빨리 읽어야 할듯.

//총 풀이 시간 : 2시간

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class Heap4 {
 
    public static void main(String[] args) {
        String operations [] = {"I 7","I 5","I -5","D -1"};
        System.out.println(solution(operations));
    }
    
    
    public static int[] solution(String[] operations) {
        int[] answer = new int[2];
        List<Integer> heap = new ArrayList<Integer>();
        for(int i=0;i<operations.length;i++){
            String[] a = operations[i].split(" ");
            if(a[0].equals("I")){
                   heap.add(Integer.parseInt(a[1]));
                   Collections.sort(heap);
            }
            if(a[0].equals("D")&&heap.size()>0){
                if(a[1].equals("1")){
//                    System.out.println("D 1 : "+heap.get(0));
                    heap.remove(heap.size()-1);
                    
                }
                if(a[1].equals("-1")){
//                    System.out.println("D -1 : "+heap.get(heap.size()-1));
                    heap.remove(0);
                }
            }
        }
        if(heap.size()!=0){
            answer[0] = heap.get(heap.size()-1);
            answer[1] = heap.get(0);
        }
        else{
            heap.add(0);
            heap.add(0);
        }
        return answer;
    }
}
