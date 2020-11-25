#include <iostream>
#include <algorithm>

using namespace std;

class Student {
	public:
		string name;
		int score;
		Student(string name, int score){  //�ʱ�ȭ �Լ� 
			this->name = name;
			this->score = score;
		}
		// ������ ���� ���� 
		bool operator<(Student &student){  // ������ �����ʺ��� �۴ٴ� ����. ���� �������̾�� ��. 
			return this -> score > student.score;  //C���� �⺻������ ���� ������ ȭ��ǥ�� ����Ŵ 
		}
};

int main(void){
	Student students[] = {
		Student("������",99),
		Student("�ڰ�ȣ",85),
		Student("�ǹα�",95),
		Student("�ο���",80),
		Student("������",80),
	};
	sort(students,students+5);
	for(int i=0;i<5;i++){
		cout << students[i].name << ' ';
	}; 
	return 0;
}
