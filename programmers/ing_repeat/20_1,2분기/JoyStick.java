package practice;

// ������ �帧 :
//1. �ƽ�Ű �ڵ� ����Ͽ� Ǯ�� (Z-A)/2=13�̴� ���ϴ� ������ �ʰ��� �������� �̵�.
//2. ���� ����� ���� ��� ���� �������� �� ���Ƽ�  �������ϰ� ���ҹٿ�
// 	   ���� ���ع����� ���ʰ��� ������ ���� �����ؼ� ���ϴ� �ɷ�.
//3. ���� ���� ������ �� ���ؼ� �ð��� �� �ɸ�
//4. ������ ���̽� ���� �߻�. ��ȣ�� �˷��� ���̽��� ���� Ǯ� ��� ���� �߻�.   ������� 2�ð� ���� �Ѱ� �ҿ�
//5. ���� ��ĵ ���� ���� �ڵ� ����.
//6. hashmap list ���Ǻ� �ٽ������ �ȵǴٰ� ���� ��ĵ �� ��.
//7. ������ �ر��� ����� ���ö� ����. �Ϸ�. 		�� 40�� �ҿ�.

//�� �ҿ�ð� : 3�ð�
//
//������ : 
//1. �ð��� �ʹ� �����ɸ��� �� ����.
//2. ���� �ڵ��� ȿ���� �����Ҵ�. ȿ���� �����ߴ�!!!
//3. �׽�Ʈ ���̽� �ϳ� ������ �ڵ��� ���� ��� ���� �� ����.


public class JoyStick {

	public static void main(String[] args) {
		String name = "ANANAAAAANA";
		System.out.println(solution(name));
	}

	public static int solution(String name) {
		int answer = 0;

		for (int i = 0; i < name.length(); i++) { // �ƽ�Ű�ڵ�� ���ں� ���� ���� ���
			int distance = name.charAt(i) - 'A';
			if (distance <= 13)
				answer += distance;
			else
				answer += 26 - distance;
		}

		int right = name.length() - 1; // ���������� �� ���

		int index = 0;
		for (int i = 1; i < name.length(); i++) { // ó���� A�� �����ϱ� ���� 1���� ����
			index++;
			if (name.charAt(i) != 'A')			//�������� �� ��츦 ����ϱ� ���� �ε��� ����.
				break;

		}

		int left = name.length() - index; // �������� �� ���

		
		// ���ӵ� A ����
		int last = 0;
		int first = 0;
		String check = "";

		for (int i = 0; i < name.length(); i++) {
			check += "A";
			if (name.contains(check))
				continue;
			else {
				check = check.substring(0, check.length() - 1);		//���ӵ� A�� �ִ�ġ�� ���� �� ������ A ���� ���� ������.
				break;
			}
		}
//		System.out.println(check);
		int j = 0;
		for (int i = check.length() - 1; i < name.length(); i++) {		//��� ���ӵ� A���� ¥���߱�.

			if (check.equals(name.substring(i - (check.length() - 1), check.length() + j))) {
				last = check.length() + j;
				first = i - (check.length() - 1)-1;		
			}
			j++;
		}
		
		last = name.length() - last;
		int middle =0;
		
		if(last<first)
		middle = last * 2 + first;			//���ʸ��� ���� ������ ���� ���� ��.
		else middle = first*2+last;
		
//		System.out.println("�̵� : " + middle+" : "+first+" "+last);
		
		if (right <= left && right <= middle) {
			answer += right;
		} else if (left <= right && left <= middle) {
			answer += left;
		} else {
			answer += middle;
		}

		return answer;
	}

}
