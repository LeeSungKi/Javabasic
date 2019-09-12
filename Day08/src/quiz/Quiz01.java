package quiz;
class Person {
	String name;
	int age;
	String contact;
	
	// setData(�̸�)
	void setData(String n){
		setData(n, 0, null);
	}
	
	// setData(�̸�, ����)
	void setData(String n, int a) {
		setData(n, a, null);
	}
	// setData(�̸�, ����, ����ó)
	void setData(String n, int a, String c) {
		name = n == null ? "����": n;
		age = a;
		contact = c == null ? "����" : c;
	}
	// setData(����)
	void setData(int a) {
		setData(null, a, null);
	}
	
	// getData() : ��� ������ String������ ��� ���� 
	String getData(){
		return "[" + name + ", " + age + "��, " + contact + "]";
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setData("����ī��", 10, "010-1111-1111");
		System.out.println(p.getData()); // [����ī��/10��/010-1111-1111]
		
		Person p2 = new Person();
		p2.setData(20);
		System.out.println(p2.getData());
		
		Person p3 = new Person();
		p3.setData("��Ǫ��", 22);
		System.out.println(p3.getData());
	}
}






