package basic;
/*
 * < ����ȯ(casting) >
 * 1. �ڵ�����ȯ -> ��ǻ�Ͱ� �ڵ����� ���� (������ �ս� ����� ���� �� ����)
 * 2. ��������ȯ -> �����ڰ� ���� �ϴ� �� (casting ������ ���)
 * 
 * < ĳ���� ������ >
 * ���� : (�ڷ���)����ȯ �� ���  
 *           -------------
 *           	������(���), ����
 * 
 * < �Ľ� (Parsing) >
 * - ���ڿ�(String) ==> �ٸ��ڷ������� ��ȯ(�ؼ�)
 */
public class Test01 {
	public static void main(String[] args) {
		double a = '��'; // char���� '��'�� �Ǽ��� '�ڵ�����ȯ'
		System.out.println(a);
		
		char b = (char)44032.0; // �Ǽ��� �Ҽ��� ���� ������ �ڵ�����ȯ ������
		System.out.println(b);
		
		String s = "10"; 
		System.out.println(s + 1); // 101
		// System.out.println( (int)s  + 1); // ����!
		System.out.println( Integer.parseInt(s) + 1); // 11
		System.out.println((int)'1');
	}
}








