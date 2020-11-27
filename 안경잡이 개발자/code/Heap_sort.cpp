#include <stdio.h>

int number = 9;
int heap[9] = {7,6,5,8,3,5,9,1,6};

int main(void){
	//힙 구성 
	for(int i=1;i<number;i++){
		int c =i;
		do{
			int root = (c-1)/2;  //부모의 값
			if(heap[root] = heap[c]){
				int temp = heap[root];
				heap[root] = heap[c];
				heap[c] = temp;
			}
			c = root;	
		}while(c !=0);
	}
	//크기를 줄여가며 반복적으로 힙을 구성
	for(int i=number-1;i>=0;i--){
		int temp = heap[0];
		heap[0] = heap[i];
		heap[i] = temp;
		int root = 0;
		int c = 1;
		do{
			c = 2 * root +1; // 자식 
			//자식 중에 더 큰 값을 찾기
			if(heap[c] < heap[c+1] && c<i-1){ //c<i-1) : 범위를 더 벗어나지 못하게 하는 것 
				c++;
			} 
			// 루트보다 자식이 더 크다면 교환
			if(heap[root] < heap[c] && c<i){
				temp = heap[root];
				heap[root] = heap[c];
				heap[c] = temp;
			} 
			root = c;
		}while(c<i);	
	}
	for(int i=0;i<number;i++){
		printf("%d ",heap[i]);
	}
}
