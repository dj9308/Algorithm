#include <iostream> // C++ ���̺귯��
#include <vector>	// C++ ���� ���� ���̺귯���� �ַ� ���δ�. 
#include <algorithm>

using namespace std;  // C++ ���� ����ϱ� 

int main(void){
	// vector�� Pair�� �̿��� Ŭ���� ���� �ʿ� ���� �ڵ� �����ϴ�. 
	vector<pair<int, string> > v;   // Pair�� ���� �̷� �����ϰ� �Ѵ�   > > : ������ �Ѵ�. 
	v.push_back(pair<int, string>(90,"������")); // push_back: ���Ϳ� ������ ���� 
	v.push_back(pair<int, string>(85,"�ڰ�ȣ"));
	v.push_back(pair<int, string>(82,"������"));
	v.push_back(pair<int, string>(98,"�ǹα�"));
	v.push_back(pair<int, string>(79,"������"));
	
	for(int i=0;i<v.size();i++){
		cout << v[i].second <<' ';	// second: vector�� �ι�° �� 
	} 
}
