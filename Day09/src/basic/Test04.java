package basic;
/*
 * < final >
 * - ������, ������ �� ����
 * - ���� �տ� ( �������, �Ű�����, �������� ��� ���� ) 
 * 		: �� ���� �Ұ�
 * 
 *   Ŭ���� �տ� 
 * 		: ��� �Ұ� 
 *   
 *   �޼��� �տ� 
 *   	: �������̵�(������) �Ұ�  (�����ε�� �������)
 *   
 */
class Sample3 {
	//final int num; // final ��� ������ ���� �� �ʱ�ȭ�� �ݵ�� �ؾ� �Ѵ�.
	//final int num = 10;
	final int NUM = 10; // final ������ all �빮��, ���� ��� '_' �۸�� ���
}
public class Test04 {
	public static void main(String[] args) {
		final int num;
		num = 10;
		//num = 20; // ���� �Ұ�
	}
}




