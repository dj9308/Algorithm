#include <iostream>
#include <algorithm>

using namespace std;

bool compare(int a, int b){
	return a<b; // a가 b보다 작을 때 우선적을 정렬(true값 반환);
	//작은 값이 앞으로 감 : 오름차순 
}

int main(void){
	int a[10] = {9,3,5,4,1,10,8,6,7,2};
	sort(a,a+10,compare); // (배열 메모리 주소, 정렬할 마지막 원소의 메모리 주소) 
	// 배열 자체는 메모리주소를 의미하는 하나의 변수이다. 
	for(int i=0;i<10;i++){
		cout << a[i] << ' ';
	}	
}
