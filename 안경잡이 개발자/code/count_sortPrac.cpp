#include <stdio.h>

int main(void){
	int temp;
	int count[5];
	
	int array[30] = {
	1,3,2,4,3,2,6,3,1,2,
	3,4,4,3,5,1,2,3,5,2,
	3,1,4,3,5,1,2,1,1,1};
	
	for(int i=0;i<5;i++){
			count[i]=0;
	};
	
	// 배열에 담기 
	for(int i=0;i<30;i++){
			count[array[i]-1]++;
	};
	
	for(int i=0;i<5;i++){
		if(count[i]!=0){
			// count 배열의 갯수 만큼 j에 적용해 출력 
			for(int j=0;j<count[i];j++){
				printf("%d",i+1);
			}	
		}
	}
	
	return 0;
}
