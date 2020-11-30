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

### 병합 정렬 단점

- 반드시 정렬에 사용되는 배열은 '전역 변수'로 선언해야 한다.
- 만약 함수 안에서 배열을 선언하게 되면 매번 배열을 선언해야 한다는 점에서 자원의 낭비가 커질 수 있다.
- 이와 같이 기본적으로 병합 정렬은 기존의 데이터를 담을 추가적인 배열 공간이 필요하다는 점에서 메모리 활용이 비효율적이라는 문제가 있다.

## SORT() 함수 다루기

- 알고리즘 문제를 풀 때 주로 C++ 문법을 사용한다.
- C++ 문법에선 다양한 라이브러리가 존재하기 때문이다. STL 라이브러리가 여기 속한다.
- STL 라이브러리에 sort함수가 속한다.

```c++
#include <iostream>
#include <algorithm>

using namespace std;

class Student {
	public:
		string name;
		int score;
		Student(string name, int score){  //초기화 함수 
			this->name = name;
			this->score = score;
		}
		// 점수가 작은 순서 
		bool operator<(Student &student){  // 왼쪽이 오른쪽보다 작다는 꺾쇠. 삽입 오른쪽이어야 함. 
			return this -> score > student.score;  //C언어는 기본적으로 내부 변수를 화살표로 가리킴 
		}
};

int main(void){
	Student students[] = {
		Student("설동재",99),
		Student("박건호",85),
		Student("권민균",95),
		Student("민용학",80),
		Student("김정현",80),
	};
	sort(students,students+5);
	for(int i=0;i<5;i++){
		cout << students[i].name << ' ';
	}; 
	return 0;
}
```

- 클래스를 정의하는 방식은 프로그래밍 속도 측면에서 별로 유리하지 않기 때문에 페어(Pair) 라이브러리를 사용한다.

```c++
#include <iostream> // C++ 라이브러리
#include <vector>	// C++ 사용시 벡터 라이브러리도 주로 쓰인다. 
#include <algorithm>

using namespace std;  // C++ 문법 사용하기 

int main(void){
	// vector와 Pair를 이용해 클래스 설정 필요 없이 코딩 가능하다. 
	vector<pair<int, string> > v;   // Pair로 쌍을 이뤄 구성하게 한다   > > : 띄워써야 한다. 
	v.push_back(pair<int, string>(90,"설동재")); // push_back: 벡터에 데이터 삽입 
	v.push_back(pair<int, string>(85,"박건호"));
	v.push_back(pair<int, string>(82,"박찬우"));
	v.push_back(pair<int, string>(98,"권민균"));
	v.push_back(pair<int, string>(79,"김정현"));
	
	for(int i=0;i<v.size();i++){
		cout << v[i].second <<' ';	// second: vector의 두번째 값 
	} 
}
```

- 주로 이렇게 소스코드의 길이를 짧게 해주는 기법을 숏코딩(Short Coding)이라고 한다.
- 작성한 소스코드의 시간 복잡도가 동일하다면, 프로그래밍 대회에서는 소스코드가 짧을 수록 남들보다 앞설 수 있다.
- Vector STL은 마치 배열과 같이 작동하는데 원소를 선택적으로 삽입(push) 및 삭제(Pop)을 할 수 있다. 즉 단순한 배열을 보다 사용하기 쉽게 개편한 자료구조라고 할 수 있다.
- 페어(Pair) STL은 한 쌍의 데이터를 처리할 수 있도록 해주는 자료구조라고 할 수 있다.
- 이러한 STL을 적절하게 혼용하는 방법이 소스코드를 획기적으로 단축시킬 수 있다.
- 

```c++
#include <iostream>
#include <vector>	 
#include <algorithm>

using namespace std;  

bool compare(pair<string, pair<int,int> > a, pair<string, pair<int,int> > b){
	if(a.second.first == b.second.first){
		return a.second.second > b.second.second;
	}else{
		return a.second.first > b.second.first;
	}
}

int main(void){
	vector<pair<string,pair<int,int> > > v; 
	v.push_back(pair<string,pair<int,int> >("설동재",pair<int,int>(90,19930830)));
	v.push_back(pair<string,pair<int,int> >("박건호",pair<int,int>(88,19940118)));
	v.push_back(pair<string,pair<int,int> >("권민균",pair<int,int>(90,19930629)));
	v.push_back(pair<string,pair<int,int> >("김정현",pair<int,int>(78,19931118)));
	v.push_back(pair<string,pair<int,int> >("박찬우",pair<int,int>(70,19940101)));
	// pair로 쓰기 복잡하면 class를 쓰면 된다. 
	
	sort(v.begin(),v.end(),compare);
	
	for(int i=0;i<v.size();i++){
		cout << v[i].first <<' ';	// second: vector의 두번째 값 
	} 
}
```



## 힙정렬(Heap Sort)

- 힙 정렬은 병합 정렬과 퀵 정렬만큼 빠른 정렬 알고리즘이다.
- 또한 실제로 고급 프로그래밍 기법으로 갈 수 록 힙(Heap)의 개념이 자주 등장하기 때문에 반드시 알고 넘어가야 하는 정렬 알고리즘이기도 하다.
- 힙 정렬은 힙 트리 구조를 이용하는 정렬 방법이다.
- Heap을 알기 위해서, 먼저 이진 트리에 대해 알고 있을 필요가 있다.
- 힙 정렬의 시간 복잡도는 항상 O(N * log N)을 보장한다.
- 힙 정렬은 병합 정렬과 다르게 별도로 추가적인 배열이 필요하지 않다는 점에서 메모리 측면에 몹시 효울적이다.
- 하지만 단순히 속도만 가지고 비교하면 퀵 정렬이 평균적으로 더 빠르기 때문에 힙 정렬이 많이 사용되지는 않는다.

### 이진 트리 (Binary Tree)

- 이진 트리란 컴퓨터 안에서 데이터를 표현할 때 데이터를 각 노드(Node)에 담은 뒤 노드를 두 개씩 이어 붙이는 구조를 말한다.
- 트리 구조에 맞게 부모 노드에서 자식 노드로 가지가 뻗히는데, 이진 트리는 모든 노드의 자식 노드가 2개 이하인 노드이다.
- 트리(Tree)란 가지를 뻗어가는 것 처럼 데이터가 위에서 아래로 서로 연결돼 있다는 것이다.
- Heap은 이진 트리 중 Complete Binary Tree 구조를 따른다.

### Heap

- Heap은 최솟값이나 최댓값을 빠르게 찾아내기 위해 완전 이진 트리를 기반으로 하는 트리이다.
- heap에는 최대 힙과 최소 힙이 존재하는데, 최대 힙은 부모 노드가 자식 노드보다 큰 힙이라 할 수 있다.
- 힙 정렬을 하기 위해서는 정해진 데이터를 힙 구조를 가지도록 만들어야 한다.

### Heapify Algorithm

- 힙 정렬을 사용하기 위해 힙 생성 알고리즘(Heapify Algorithm)을 사용한다.
- 힙 생성 알고리즘은 하나의 노드에 대해 수행하는 것이다.
- 하나의 노드를 제외하고는 최대 힙이 구성돼 있는 상태라고 가정한다는 특징이 있다.
- 힙 생성 알고리즘의 시간 복잡도는 O(logN)이다.

### Heap 정렬 순서

1. 순서대로 배열에 담는다.
2. 실제 힙 구조는 전체 노드 개수 / 2 만 보면 된다.
3. leaf 노드 부터 차근차근 부모 노드와 비교해 정렬한다. (상향식) / 하향식도 가능
4. root 노드를 마지막 노드와 바꾼다. => 최대(최소)값이 맨 아래로 내려간다.
5. 다시 Heapify를 수행한다.
6. 수행 완료일 시 다시 아래와 root노드를 맞바꾼다.
7. leaf노드부터 정렬이 수행된다.

``` c++
#include <stdio.h>

int number = 9;
int heap[9] = {7,6,5,8,3,5,9,1,6};

int main(void){
	//힙 구성 
	for(int i=1;i<number;i++){
		int c =i;
		do{
			int root = (c-1)/2;  //부모의 값
			if(heap[root] < heap[c]){
				int temp = heap[root];
				heap[root] = heap[c];
				heap[c] = temp;
			}
			c = root; // 재귀적으로 heapify 수행 
		}while(c !=0); // 루트 노드까지 반복  
	}
	//크기를 줄여가며 반복적으로 힙을 구성
	for(int i=number-1;i>=0;i--){
		int temp = heap[0];
		heap[0] = heap[i]; 	//root와 마지막 노드 바꿈 
		heap[i] = temp;
		int root = 0;
		int c = 1;
		do{
			c = 2 * root +1; // 자식 중 왼쪽 노드 
			//두개의 자식 중에 더 큰 값을 찾기
			if(heap[c] < heap[c+1] && c<i-1){ //c<i-1) : 범위를 더 벗어나지 못하게 하는 것(마지막 노드의 형제 노드 전까지)
				c++;
			} 
			// 루트보다 자식이 더 크다면 교환
			if(heap[root] < heap[c] && c<i){ // c<i: 마지막 노드(최대/최소값) 전까지
				temp = heap[root];
				heap[root] = heap[c];
				heap[c] = temp;
			} 
			root = c;  // 재귀적으로 heapify 수행 
		}while(c<i);	
	}
	for(int i=0;i<number;i++){
		printf("%d ",heap[i]);
	}
}
```



## 계수 정렬(Counting Sort)