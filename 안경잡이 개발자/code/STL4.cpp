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
	v.push_back(pair<string,pair<int,int> >("������",pair<int,int>(90,19930830)));
	v.push_back(pair<string,pair<int,int> >("�ڰ�ȣ",pair<int,int>(88,19940118)));
	v.push_back(pair<string,pair<int,int> >("�ǹα�",pair<int,int>(90,19930629)));
	v.push_back(pair<string,pair<int,int> >("������",pair<int,int>(78,19931118)));
	v.push_back(pair<string,pair<int,int> >("������",pair<int,int>(70,19940101)));
	// pair�� ���� �����ϸ� class�� ���� �ȴ�. 
	
	sort(v.begin(),v.end(),compare);
	
	for(int i=0;i<v.size();i++){
		cout << v[i].first <<' ';	// second: vector�� �ι�° �� 
	} 
}
