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
