package basic;
/*
 * < �޼��� �����ε�( Overload ) >
 * - �ϳ��� �޼��带 '�Ű����� ���� Ȥ�� �ڷ���'�� ���̸� �ξ� ���� �޼���� ����� ��
 * - ����!
 *    �޼��带 �����ϴ� ������ �Ű������� '�ڷ���'�� '����'�� 
 *    �����ڷ����� ���� �޶� �ȴ�.
 */
class Sample {
	void aa() {
		System.out.println("aa() ����! �Ű����� ����!");
	}
	void aa(int a) {
		System.out.println("aa() ����! �Ű����� int�� : " + a);
	}
	void aa(String a) {
		System.out.println("aa() ����! �Ű����� String �� : " + a);
	}
	void aa(int a, int b) {
		System.out.println("aa() ����! �Ű����� int, int : " + a + ", "+b);
	}
}
public class Test01 {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.aa();
		s.aa(10); 
		s.aa("ABC"); 
		s.aa(1, 10);
		// s.aa(1, 2, 3); 
		System.out.println();
		System.out.println(1);
		System.out.println("ABC");
	}
}









