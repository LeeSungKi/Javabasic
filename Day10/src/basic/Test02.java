package basic;
/*
 * < super >
 * - �ڽ� ��ü ���� �θ�ü�� ���۷���
 * 
 * < super() >
 * - �θ� Ŭ������ ������ ȣ��
 */
class Parent {
	String str = "���� Parent�� str~"; 
}
class Child extends Parent {
	String str = "���� Child�� str~";
	void aa() {
		String str = "���� �������� str~!";
		System.out.println(str);
		System.out.println(this.str);
		System.out.println(super.str);
	}
}
public class Test02 {
	public static void main(String[] args) {
		Child c = new Child();
		// System.out.println(c.str); // ���� Child�� str~
		//c.aa();
		System.out.println(((Parent)c).str); // ���� Parent�� str~
	}
}







