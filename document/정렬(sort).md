# 정렬(sort)

- 정렬 문제 만큼 알고리즘의 효율성 차이를 극명하게 보여주는 것이 없다.

## 선택 정렬

- 가장 작은 것을 선택해서 제일 앞으로 보내는 알고리즘이다.

- 선택 정렬의 시간복잡도는 O(n^2) 이다.

- ```c
  # include <stdio.h>
  
  int main(void){
  	int i,j,min,index,temp;
  	int array[10] = {1,10,5,8,7,6,4,3,2,9};
  	for(i=0;i<10;i++){
  		min = 9999;
  		for(j=i;j<10;j++){
  			if(min>array[j]){
  				min = array[j];
  				index = j;
  			}
  		}
  		temp = array[i];
  		array[i] = array[index];
  		array[index] = temp;
  		printf("%d ",array[i]);
  	}
  	return 0;
  }
  ```

  ## 버블정렬

  - 가까이에 있는 두 숫자끼리 비교해서 당장 더 작은 숫자를 앞으로 보내주는 것을 반복하는 알고리즘이다.

  - 구현은 가장 쉽지만 가장 비효율적이다.

  - 두 번째 반복문에서 마지막 원소를 하나씩 줄어들며 수행한다.

  - 한 번의 반복이 끝날 시 가장 큰 것이 맨 뒤로 움직인다.

  - 버블 정렬의 시간복잡도는 O(N*N)이다.

  - 선택정렬과 시간복잡도가 같지만, 버블정렬은 매번 배열을 교체해야 하기 때문에 더 느리다.

  - ```c
    # include <stdio.h>
    
    int main(void){
    	int i,j,temp;
    	int array[10] = {1,10,5,8,7,6,4,3,2,9};
    	
    	for(i=0;i<10;i++){
    		for(j=0;j<9-i;j++){
    			if(array[j]>array[j+1]){
    				temp = array[j];
    				array[j] = array[j+1];
    				array[j+1] = temp;
    			}
    		}
    	}
    	
    	for(i=0;i<10;i++){
    		printf("%d ",array[i]);
    	}
    	return 0;
    }
    ```

## 삽입 정렬

- 문제를 풀 때 각 숫자를 적절한 위치에 삽입하는 방법으로 문제를 해결한다. 

- 다른 정렬 방식들은 무조건 위치를 바꾸는 방식이었다면 삽입 정렬은 '적절한 위치'에 삽입한다.

- 인덱스가 커질 때마다 정렬하려는 해당 숫자를 왼쪽 인덱스 중 어디에 삽입 할지 확인 하며 정렬한다.

- 정렬이 되어 있다고 가정한 점에서 특정한 경우에 따라 굉장히 빠른 속도를 자랑한다.

- 시간 복잡도는 O(N^2) 이지만, 실제로 삽입 정렬의 연산의 수가 가장 적다. 

- 2,3,4,5,6,7,8,9,10,1 와 같이 거의 정렬된 상태라면 모든 정렬 중 삽입 정렬이 가장 효율적이다.

- ```c
  #include <stdio.h>
  
  int main(void){
  	int i, j, temp, min, index;
  	int array[10] = {1,10,5,8,7,6,4,3,2,9};
  	
  	for(i=0;i<9;i++){
  		j = i;
  		while(array[j] > array[j+1]){ // 왼쪽은 정렬된 상태이니까.
  			temp = array[j];
  			array[j] = array[j+1];
  			array[j+1] =  temp;
  			j--;
  		}
  	}
  	
  	for(i=0;i<10;i++){
  		printf("%d ",array[i]);
  	}
  }
  ```

## 퀵 정렬

- 선택, 버블, 삽입 정렬 알고리즘은 모두 시간 복잡도가 O(N^2)이기 때문에 데이터의 갯수가 10만 개만 넘어도 사용하기 어려운 알고리즘이다.

- 때문에 더 빠른 알고리즘이 필요한데, 대표적인 빠른 알고리즘이 퀵 정렬 알고리즘이다.

- 퀵 정렬은 대표적인 **분할 정복(divide and conquer)** 알고리즘으로, 평균 속도가 O(N * logN)이다. => logN = log(작은)2N => 2개로 분할하기 떼문.

- 퀵 정렬은 하나의 큰 문제를 두 개의 작은 문제로 분할하는 식으로 빠르게 정렬한다.

- 특정한 값을 기준으로 큰 숫자와 작은 숫자를 서로 교환한 뒤에 배열을 반으로 나눈다.

- 일반적으로 퀵 정렬에서는 기준 값이 있는데, 이것을 피벗(Pivot)이라고 한다.

- 보통 첫 번째 원소를 피벗 값으로 설정하고 사용한다.

- 1,2,3,4,5,6,7,8,9,10 을 선택,버블,삽입 정렬할 경우 N*N = 10 * 10 = 100 이지만 퀵정렬을 할 경우 1,2,3,4,5 => 5 * 5 = 25, 6,7,8,9,10 => 5 * 5 = 25 => 25+25이기 때문에, 차이가 심하게 난다.

- 

  ```c
  #include <stdio.h>
  
  int number = 10;
  int data[10] = {1,10,5,8,7,6,4,3,2,9};
  
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
  			j--;
              // 내림차순의 경우, 위 두개의 while문에서 부등호 방향만 바꾸면 된다.
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
      // 실행시 무한루프가 돌 경우, 십중팔구 미스타이핑(사소한 타이핑 오류)에서 나온다.
  	return 0; 
  }
  ```

### 퀵 정렬 단점

- 피벗값 설정하는 것에 따라서 최악의 시간 복잡도는 O(N^2)이다.  하지만 대부분의 경우 퀵 정렬이 제일 많이 쓰인다. 
- C언어에서 정렬 관련 라이브러리를 제공해 주는데, 이 경우 퀵 정렬을 사용한다.
- 알고리즘 대회에서 O(N * logN)을 요구하는 경우 퀵 정렬을 이용하면 틀리는 경우가 있다.
  - 1,2,3,4,5,6,7,8,9,10 처럼 거의 정렬된 배열의 경우, 퀵 정렬의 시간 복잡도는 O(N^2)에 가까워진다.
  - 한 바퀴 돌았을때 엇갈리지 않기 때문에, 정렬 된 것은 피벗 값 하나만 되기 때문이다.
  - 이때는 주로 삽입정렬을 사용한다.

## 병합 정렬

- 병합 정렬도 대표적인 '분할 정복' 방법을 채택한 알고리즘이다.

- 결과적으로 퀵 정렬과 동일하게 O(N * logN)의 시간 복잡도를 가진다.

- 편향되게 분할할 가능성이 있는 퀵 정렬과 달리, 병합 정렬은 정확히 반절씩 나눈다는 점에서 최악의 경우에도 시간복잡도는 같다. 대신 퀵 정렬보다 다소 느릴 수 있다.

- 병합 정렬은 하나의 큰 문제를 두 개의 작은 문제로 분할한 뒤에 각자 계산하고 나중에 합치는 방법을 채택한다.

- 즉, 정확히 반으로 나누고 나중에 정렬한다.

- 처음부터 반으로 나누기 때문에, 피벗값이 없고 단계의 크기가 logN이 보장된다.

- 너비는 N, 높이는 logN이 된다. 예를 들어, 너비가 8인 배열이 있을 경우, 높이는 log(작은)2의8이니 3이 된다. 즉 계층간 지수적으로 차이가 난다.

- 너비가 N인 이유는 계층에 올라가면 이미 정렬된 상태에서 또 정렬을 하기 때문에 N * N이 아닌 N으로 계산이 가능해진다.

- 

  ```c
  #include <stdio.h>
  
  int number = 8;
  int sorted[8]; // 정렬 배열은 반드시 전역 변수로 만들어줘야 한다.
  
  void merge(int a[], int m, int middle, int n){ // 시작점, 중간점, 끝점 
  	int i = m;
  	int j = middle+1;
  	int k = m;	// 합칠 배열의 인덱스 
  	// 작은 순서대로 배열에 삽입
  	while(i<=middle && j<=n){
  		if(a[i] <= a[j]){
  			sorted[k] = a[i];
  			i++;
  		}else{
  			sorted[k]=a[j];
  			j++;
  		}
  		k++;	// 다음 원소의 값을 받을 수 있도록 준비. 
  	} 
  	// 남은 데이터도 삽입
  	if(i > middle){
  		for(int t = j; t<=n; t++){
  			sorted[k] = a[t];
  			k++;
  		}
  	}else{
  		for(int t = i; t<=middle; t++){
  			sorted[k] = a[t];
  			k++;
  		}
  	} 
  	//정렬된 배열 삽입
  	for(int t = m; t<=n; t++){
  		a[t] = sorted[t];
  	} 
  }
  
  void mergeSort(int a[], int m, int n){
  	// 크기가 1보다 큰 경우 
  	if(m<n){
  		int middle = (m+n)/2;
  		mergeSort(a,m,middle);
  		mergeSort(a,middle+1,n);
  		merge(a,m,middle,n);
  	}
  }
  
  int main(void){
  	int array[number] = {7,6,5,8,3,5,9,1};
  	mergeSort(array, 0, number-1);
  	for(int i=0;i<number;i++){
  		printf("%d ", array[i]);
  	}
  	return 0;
  } 
  
  ```















