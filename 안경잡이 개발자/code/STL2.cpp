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
