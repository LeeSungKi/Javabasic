package basic;

public class Person {
	String name;
	int age;
	
	void setInfo(String n, int a) {
		name = n;
		age = a;
		System.out.println("���� ���� �Ϸ�!");
	}
	
	void introduce() {
		System.out.println("���� " + name + "�̰�, " + age + "���Դϴ�.");
	}
	
	String getInfo() {
		return "[" + name + "/" + age + "��]";
	}
}





