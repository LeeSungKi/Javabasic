package basic;
/*
 * < �޼��� �������̵�(Override) > 
 * - �޼��� ������
 * - �θ� ������ �޼��带 �ڽ�Ŭ������ {} �� �ٽ� ���� �� 
 * 
 * < �������̵� ���� >
 * - ���� �ı� Ŭ���� ���� �޼��� ����� ����
 *   ��) ������ �̵���Ű�� �޼���� move()�� ��������! 
 * - ������ ���� ******
 */
class Hero {
	// �ʵ� ����....
	void move() {
		System.out.println("���� �̵�~");
	}

}
class Superman extends Hero {
	@Override // annotation : JVM���� �ǳ״� �޽���
	void move() { System.out.println("���۸� ���ư���~");	}
}
class Batman extends Hero {
	void move() { System.out.println("��Ʈ��, ��Ʈī�� �̵�!!"); }
}
class Spiderman extends Hero {
	void move() { System.out.println("�����̴���, �Ź��ٷ� �̵�!"); }
}
public class Test04 {
	public static void main(String[] args) {
		Superman superman = new Superman();
		Batman batman = new Batman();
		Spiderman spiderman = new Spiderman();
		
		superman.move();
		batman.move();
		spiderman.move();
	}
	
}
