package basic;
/*
 * < ��ü ���� >
 * 1. Ŭ���� 
 *  - ���� ���� ���赵
 *  
 * 2. �ν��Ͻ�(=��ü)
 *  - ��
 *  
 * 3. ���۷���(=����)
 *  - ���� �ּ� (�ν��Ͻ��� ��ġ �ּ�)
 *  
 * 4. ���۷��� ����(=���� ����)
 *  - ���� �ּҸ� ���� �޸���
 *  
 * 5. ���۷��� Ÿ��(=�����ڷ���)
 *  - ���� ���
 *  
 *  ** �ν��Ͻ��� Heap �޸𸮿� �Ҵ�ȴ�. 
 *             ----------
 *             	�ּҷθ� ���� ������ �޸�
 */
public class Test03 {
	public static void main(String[] args) {
		// ���ϸ� �ν��Ͻ� 3���� ����� 
		
		// ��������(�ּ� �޸���) 3�� ����� 
		Pokemon p1, p2, p3; 
		
		// Pokemon �ν��Ͻ��� �����ϰ�, �� �ּҸ� ���������� ����
		p1 = new Pokemon();
		p2 = new Pokemon();
		p3 = new Pokemon();
		
		// ������ �ν��Ͻ��� ���� �����͸� ����
		p1.name = "��ī��"; 
		p1.hp = 1000;
		p1.ap = 7;
		
		p2.name = "������"; 
		p2.hp = 1200;
		p2.ap = 9;
		
		p3.name = "ġ�ڸ�Ÿ"; 
		p3.hp = 200;
		p3.ap = 1;
		
		System.out.println(p1.name);
		System.out.println(p1.hp + ", " + p1.ap);
		
		p2.info();
		p3.info();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		p3 = p1;
		p3.name = "�Ḹ��"; 
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println(p3.name);
		System.out.println(p1.name);
		
		p3 = null; // ���������� null�� ����Ͽ� �����͸� �����.
		// null�� �ǹ� : �ν��Ͻ� ���� ����
		System.out.println(p3.name);
		// null.name ==> (X) �ν��Ͻ��� ����.. 
		// NullPointerException
	}
}







