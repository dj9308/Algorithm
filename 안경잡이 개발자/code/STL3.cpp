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
