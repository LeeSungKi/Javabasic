package basic;
/*
 *  < static >
 *  - ������, ������
 *  - �޼ҵ�, ������� �տ� ����
 *  - 1. ������ ���������. 
 *  	Ŭ���� �ε� �� ������ �����ȴ�. (���α׷� ���� ������ �̸� �����ص�)
 *      ==> new ���̵� ��� �����ϴ�.
 *      
 *    2. 1���� ���������.
 *      �ν��Ͻ��� �ƹ��� ���Ƶ� static���� ����� ��������� 
 *      ���α׷� ��Ʋ�� 1���� �ִ�
 *      ==> �����ϴ� ���
 *      
 *    3. static ��� ���� ��� : Ŭ������.�����
 *      
 *  - static�� �뵵 
 *    1. ��� �ν��Ͻ����� �����ؾ��ϴ� �������� ���
 *    	-> static���� �ʵ带 �����Ѵ�.
 *     
 *    2. ��ü ���� ���̵� ����� �� �ִ� �޼����� ���
 *      -> static���� �޼��带 �����Ѵ�. 
 *         (�޼��� ���ο� �ν��Ͻ� ����� ������ �ʴ� �޼���)
 */
class Sample {
	static void aa() {
		System.out.println("����������");
	}
	static double getCircelArea(int r) {
		return r * r * 3.14;
	}
}
public class Test01 {
	public static void main(String[] args) {
		//Math.PI;
		//Math.random(); 
		//Integer.parseInt();
		//System.out.println();
		
//		aa()�� static�� �ƴ� ���� new�� ��üȭ�Ͽ� ����ؾ� �Ѵ�.
		Sample s = new Sample();
		s.aa();
		
//		aa()�� static���� ����Ǿ��ٸ� 'Ŭ������'���� ����� �� �ִ�. 
		Sample.aa();
	}
}







