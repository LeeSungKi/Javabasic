package basic;
/*
 * < ��� (Inheritance) >
 * - Ȯ�� 
 * - ����Ŭ����(����)�� 'Ȯ��'�Ͽ� �� Ŭ������ ����� �۾�
 * ���� : �θ�Ŭ����, ����Ŭ����, ����Ŭ���� 
 * Ȯ�� : �ڽ�Ŭ����, ����Ŭ����, ����Ŭ����
 * 
 */
class Person { // �θ�Ŭ����
	String name;
	int age;
	void printPerson() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + "��");
	}
}
class Student extends Person {
	String grade;
	int num;
}
class Teacher extends Person {
	String subject;
	int salary;
}
class Employee extends Person {
	String department; // �μ�
}
public class Test01 {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name = "ȫ�浿";
		t.age = 30;
		t.subject = "����"; 
		t.printPerson();
	}
}
