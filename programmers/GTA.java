package algori;

// ����� Ǯ���� �� ��ȣ���Լ� ��Ʈ�� ����.
// �װ��� ó���� �׳� �ִ밪�� ���� ���ؼ� Ǯ�� �Ǵ��� �˾Ҵµ�
// �ִ밪�� ���� ���� �亸�� �ƴ� ���� �� Ŭ �� �ִٴ� ��.

// �׷��� �ִ밪�� ���� ���ϰ� Ǯ���� ���� �ι�°�� ū ������ Ǯ���� ����
// ���ϴ� ��.

// ����� Ǯ�� ����� ����̵��� �Ѱ谡 �־� �ϴ� ����.
// ��Ż �������夿������������������������������������������

// �ѽð�  : �� 6�ð�. (������ 6�ð�)

// ���� �� : ���� Ǫ�µ� �̷��� �ð��� ���� �ɸ��ٴ� ���� ���� �־��ٴ� ��. 
// �� �� ���� Ǯ�̿� �ð��� �Ҿ��ϰ� �� ���� ����� ã�ƺ���.
// ����� �� ������ ���� ���ĵ��� ������ �׷����� �����ϱ�.
// �׸��� �������� ���� ���� ����.
// �ƴ� �ٵ� �� ��Ÿ�ӿ����� ���°ž� ��¥ �Ź��ϰ� �ѰŰ����� ����

// �ٵ� �� ������� 2�� ���� �˰��� �� �Ҽ��ִٴµ� �̰� ��� 2�ָ��� �ϳ�

class GTA {

	public static void main(String[] args) {
		int[] money = {1,2,3,1};
		System.out.println(solution(money));
	}	
	  public static int solution(int[] money) {
		return Math.max(Maxmoney(money, 0, money.length-1), Maxmoney(money, 1, money.length)); 
	    }
	  public static int Maxmoney(int[] money, int start, int finish) {
		  int don =0;		//��
		  int preO = 0;		//���� �� ŻŻ O
		  int preX = 0;		//���� �� ŻŻ X
		  
		  int TodO = 0;		//���� �� ŻŻ O
		  int TodX = 0;		//���� �� ŻŻ X
		  
		  for(int i=start;i<finish;i++) {
			TodO = preX+money[i];			// ���� ���� ŻŻ �� ��� ���� ���� ŻŻ ���� ���� ���� ���ϱ�
			TodX = Math.max(preO, preX);	// ���� ���� ŻŻ ���� ���� ��쿣 �������� ŻŻ ���� ���� ���� ŻŻ�� ����� ū ���� ����.
			
			if(TodO>TodX) 
				don=Math.max(don,TodO);
			else
				  don=Math.max(don, TodX);
			
			
			
			preO = TodO;
			preX = TodX;
		  }
		  return don;
	  }
}
