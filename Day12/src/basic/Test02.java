package basic;
/*
 * < �ڹ��� �⺻ ��Ű���� Ŭ���� >
 * 1. java.lang ��Ű�� 
 *  --> System, String, Object, Integer, Double, Math..
 *  --> �ڹ� ���߿� �ʼ������� ���Ǵ� API Ŭ������ �������
 *  --> �⺻���� import�Ǵ� ��Ű�� 
 * 
 * 2. java.util ��Ű��
 *  --> Scanner, Date, Calendar, Collection, Arrays... 
 *  --> �ڹ� ������ �� ����ϸ� ���� Ŭ������
 * 
 * 3. java.io ��Ű�� 
 *  --> ����� ��Ʈ���� ���� Ŭ���� 
 *  
 * 4. java.awt
 *    javax.swing 
 *  --> GUI ���α׷��� 
 * 
 * 5. java.net 
 *  --> ��Ʈ��ũ ���� 
 *  
 * < java.lang.Object Ŭ���� >
 * - ��� Ŭ�������� root Ŭ���� (Object�� ��� �޴´�.)  
 * - Object���� ������������ ��� Ÿ���� ���۷����� ������ �� �ִ�.
 */
import java.lang.*;
import java.lang.reflect.Field;
import java.util.Scanner;
class Pokemon implements Cloneable{
	String name;
	int level;
	int num;
	
	// num�� ������ �ߺ� ���ϸ� 
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Pokemon) {
			Pokemon another = (Pokemon)o;
			return another.num == this.num;
		}
		return false;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return name + "/lv." + level + "/no." + num;
	}
}
public class Test02 {
	public static void main(String[] args) {
		Object o =  1;
		Object o2 = 3.14;
		Object o3 = true; 
		Object[] oArr = {"ABC", 1, true, new Pokemon() };
		for(Object obj : oArr) {
			System.out.println(obj);
		}
		
		// < ObjectŬ������ �ֿ� �޼��� >
		// 1. boolean equals(Object another)
		// --> another �� �� ��ü�� ���۷����� ������?
		// --> �������̵� �ϱ⸦ ���� (��� �� �뵵)
		Pokemon p1 = new Pokemon();
		Pokemon p2 = new Pokemon();
		boolean result = p1.equals(p2);
		System.out.println(result); // false
		
		String s1 = new String("ABC"); // "ABC"
		String s2 = new String("ABC");
		result = s1.equals(s2);
		System.out.println(result); // true
		
		/*Scanner sc = new Scanner(System.in); 
		System.out.print("�̸� : ");
		p1.name = sc.next();
		System.out.print("������ȣ : ");
		p1.num = sc.nextInt();
		
		System.out.print("�ι�° ���ϸ� �̸� : ");
		p2.name = sc.next();
		System.out.println("�ι�° ���ϸ� ������ȣ : ");
		p2.num = sc.nextInt();
		
		if(p1.equals(p2)) {
			System.out.println("������ȣ�� �ߺ��Ǹ� �ȵ˴ϴ�.");
		}
		else {
			System.out.println("����� �Ϸ��Ͽ����ϴ�.");
		}*/
		
		// 2. int hashCode() : �� ��ü�� �ؽ��ڵ�(������ȣ)�� int������ �˷���
		// --> ���ϼ� �񱳸� ���� �������� �������̵� �ϱ⸦ ����
		// --> equals() �������̵��ߴٸ� hashCode()�� �������̵� �ϱ�
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		Integer num = new Integer(100); 
		System.out.println(num.hashCode());
		
		System.out.println("ABC".hashCode());
		String s = new String("ABC");
		System.out.println(s.hashCode());
		
		// 3. java.lang.Class getClass()
		Class cls = p1.getClass();
		System.out.println(cls.getSimpleName());
		System.out.println(cls.getName());
		
		java.lang.reflect.Field[] fields = cls.getDeclaredFields();
		for(Field f : fields) {
			System.out.println("�ʵ��� �ڷ��� : " + f.getType());
			System.out.println("�ʵ��� �̸� : " + f.getName());
		}
		
		Pokemon p3 = p1; // ��������
		p3.name = "��ī��"; 
		System.out.println(p3.name);
		System.out.println(p1.name);
		
		try {
			p3 = (Pokemon)p1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		p1.name = "������"; 
		p3.name = "Ǫ��"; 
		
		System.out.println(p1.name);
		System.out.println(p3.name);
		
		System.out.println("p1: " + p1);
		System.out.println("p1.toString() : " + p1.toString());
		/*
		 * String toString() : �� ��ü�� ǥ���ϴ� �Ѹ���!
		 *  ���������� ���(sysout, jop) �� �� �ڵ����� toString()�� ȣ��ȴ�.
		 */
		String str = p1 + "";
		 //        = p1.toString();
		System.out.println("str : " + str);
	}
}













