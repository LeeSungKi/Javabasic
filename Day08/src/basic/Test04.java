package basic;
/*
 * < ������ (Constructor) >
 * - ���� : 
 * 		Ŭ������(){
 * 	
 * 		}
 * ==> ���� �ڷ��� X
 * ==> Ŭ���� �̸��� ����
 * 
 * - ��ü ���� �� ��ü 1���� 1���� ȣ���� �� �ִ� 
 *   �ʱ�ȭ�� Ư�� �޼���
 * - ���� �����ڸ� �������� ������ '�⺻ ������'�� �ڵ����� ���ǵ�
 * 	 (���� ������ �����ϸ� '�⺻������'�� ��������� �ʴ´�!!!!)
 *   �⺻������ ����
 *    	public Ŭ������(){
 *    		// ���� ����
 *    	}
 */
class Person {
	String name;
	int age;
	
	Person(String name, int a){
		this.name = name;
		age = a;
		System.out.println("�ν��Ͻ� ���� �Ϸ�!");
		
	}
}

public class Test04 {
	public static void main(String[] args) {
		Person p1; // �������� ����
		//p1 = new Person(); // �ν��Ͻ� ����
		p1 = new Person("����ī��", 10); 
		System.out.println(p1.name);
		System.out.println(p1.age);
	}
}
