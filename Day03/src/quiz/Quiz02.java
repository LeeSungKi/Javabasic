package quiz;

public class Quiz02 {
	public static void main(String[] args) {
		// Math.random()�� ����Ͽ� 1 ~ 45�� �� �� �ϳ��� ������ �����ϰ� �̰�
		// ���� ������ ����ϰ� ¦�� Ȥ�� Ȧ���� �Ǻ��ϼ���.
		int r = (int)(Math.random() * 45) + 1;
		System.out.println("���� �� : " + r);
		
		if(r % 2 == 0) {
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}
		/////////////////////////////////////////////////
		// �߸��� �ڵ�
//		System.out.println("���� �� : " + (int)(Math.random() * 45) + 1);
//		if( ((int)(Math.random() * 45) + 1 ) % 2 == 0) {
//			System.out.println("¦��");
//		}
//		else {
//			System.out.println("Ȧ��");
//		}
		
	}
}





