#include <stdio.h>

int number = 8;
int sorted[8];

int merge(int a[], int m, int middle, int n){
	int i = m;
	int j = middle+1;
	int k = m;
	
	while(i<=middle && j<=n){
		if(a[i]>a[j]){
			sorted[k] = a[j];
			j++;
		}else{
			sorted[k] = a[i];
			i++;
		}
		k++;
	}
	
	if(i>middle){ // i 가 middle까지 가서 a[k]에 집어넣고 i++됨. 그래서 i가 middle보다 큰 것. 
		for(int t=j;t<=n;t++){
			sorted[k] = a[t];
			k++;
		} 
	}else{
		for(int t=i;t<=middle;t++){
			sorted[k] = a[t];
			k++;
		}
	}
	
	for(i=0;i<=n;i++){
		a[i] = sorted[i];
	}
}

int mergeSort(int a[], int m, int n){
	if(m<n){
		int middle = (m+n)/2;
		mergeSort(a,m,middle);
		mergeSort(a,middle+1,n);
		merge(a,m,middle,n);
	}
	
}

int main(void){
	int array[number] = {7,6,5,8,3,5,9,1};
	mergeSort(array,0,number-1);
	for(int i=0;i<number;i++){
		printf("%d ",array[i]);
	}
	return 0;
}
