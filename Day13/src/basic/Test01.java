package basic;

public class Test01 {
	public static void main(String[] args) {
		String a = "ABC"; 
		System.out.println("concat �� a : " + a.hashCode());
		a += "DEF"; 
		System.out.println("concat �� a : " + a.hashCode());
		// String ��ü�� '+' �� �� ���� �� ��ü�� �����Ѵ�.
		// �ɰ��� ��� �޸� ���ϰ� �Ͼ �� �ִ�.
		// ���ڿ� ������ �����ؾ� �ϴ� ��� StringBuilder/StringBuffer Ŭ������ ����Ѵ�.
		
		
		StringBuffer b = new StringBuffer("ABC");
		System.out.println("concat �� b : " + b.hashCode());
		b.append("DEF");
		System.out.println("concat �� b : " + b.hashCode());
		System.out.println(b); // b.toString()
		// ��ü�� 1���� ��������, ���ڿ��� ������ ���۸� �����Ѵ�.
		// append() �����ϸ� �ش� ���ڿ��� ���ۿ� �߰��Ѵ�. 
		// ��ü�� �Ź� �������� �����Ƿ� �޸� �δ��� ���� �� �ִ�.
	}
}
