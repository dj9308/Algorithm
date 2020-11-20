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

