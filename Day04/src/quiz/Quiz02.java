package quiz;

public class Quiz02 {
	public static void main(String[] args) {
		// 1. 1 ~ 20 �� ������ ������ 5�� ��� (�ߺ� ����)
		// 2. 1 ~ 1000 �� 11�� 17�� ������� ���
		// 3. 2�� ~ 9�ܱ��� ��� �������� ���
		
		// ���� 1
		for(int a = 0; a < 5; ++a) {
			System.out.println( (int)(Math.random() * 20) + 1);
		}
		
		// ����2 
		for(int b = 1; b <= 1000; ++b) {
			if(b % 11 == 0 && b % 17 == 0) {
				System.out.println(b);
			}
		}
		// ����2
		for(int b = 11*17; b <= 1000; b += 11*17) {
			System.out.println(b);
		}
		
		// ����3
		for(int dan = 2; dan <= 9; ++dan) {
			System.out.println("< " + dan + "�� >");
			for(int n = 1; n <= 9; ++n) {
				System.out.println(dan + " X " + n + " = " + dan*n );
			}
		}
	}
	
}





