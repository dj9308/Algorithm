#include <stdio.h>

int number = 6;
int data[10] = {1,6,2,4,3,5};

void quickSort(int *data, int start, int end){
	if(start>=end){ //  원소가 1개인 경우 
		return; 
	}
	
	int key = start; // 키는 첫번째 원소(피벗 값) 
	int i = start + 1;
	int j = end;
	int temp;
	
	while(i<=j){ 	//엇갈리기 전까지 
		
		while(data[i] <= data[key]){ // 키 값보다 큰 값을 만날 때까지 
			i++;
		}
		while(data[j] >= data[key] && j>start){  // 키 값보다 작은 값을 만날 때까지 
			j--;		// 내림차순의 경우 위 두개의  while문 등호만 바꾸면 된다. 
		} 
		if(i>j){ // 현재 엇갈린 상태면 키 값과 교환 
			temp = data[j];
			data[j] = data[key];
			data[key] = temp;
		}else{	// 엇갈리지 않았을땐 큰값, 작은값만 교체 
			temp = data[j];
			data[j] = data[i];
			data[i] = temp;
		}
	}
	// 엇갈리고 인덱스 변경후 재귀적 함수 실행. 
	quickSort(data,start,j-1);
	quickSort(data,j+1,end);
}

int main(void){
	quickSort(data,0,number-1);
	for(int i=0;i<number;i++){
		printf("%d ",data[i]);
	}
	return 0; 
}
