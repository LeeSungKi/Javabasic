package basic;
class Sample2 {
	String insStr = "���� �ν��Ͻ� ���~"; 
	static String clsStr = "���� Ŭ���� ���~";
	
	// �ν��Ͻ� ��� : non-static ��� ==> �ν��Ͻ��� �����Ǿ�� ��밡���ϴ�
	// Ŭ���� ��� : static ��� ==> Ŭ���� ������ �ִ� ���
	
	void insMethod() {
		System.out.println(insStr);
		System.out.println(clsStr);
	}
	
	static void clsMethod() {
		// System.out.println(insStr); // ����!
		System.out.println(clsStr);
		// static �޼��� �ȿ����� non-static ����� ����� �� ����.
		// (�Ϸ��� ��ü ������ �ؾ� �Ѵ�..)
		// ==> static �޼��尡 non-static�� ������� ���� �����Ǿ���ϱ� ������
	}
}
public class Test02 {
	public static void main(String[] args) {
		// System.out.println( Sample2.insStr ); // ����! 
		System.out.println( Sample2.clsStr );
	}
}
