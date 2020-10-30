package practice;

//������
//1. ó���� ������ �غ���� ���� �켱���� ť�� �� �ʿ䰡 ���ٰ� �����ߴ�.
//2. �׷��� ����Ʈ�θ� �����ϸ� �ɰŰ��� �; ������ ��� ���� ���Դ�.
//3. ���� ���ٰ� �����ߴµ� ������ �ð��� �����ɸ���. ���� �ð����� ���ϸ� ���� 2�ð� ���� �ɸ���.
//	���ݴ� �����ϰ� ������ �帧�� ���� �о�� �ҵ�.

//�� Ǯ�� �ð� : 2�ð�

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
