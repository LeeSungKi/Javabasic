package basic;

public class Test02 {
	public static void main(String[] args) {
		// MyMethod�� ������ �޼������ �����غ��� (=�޼��� ȣ��)
		
		// �޼��带 ����Ϸ��� ��ü ���� �ؾ� �� 
		MyMethod my = new MyMethod();
		
		double d = my.getCircleArea(10); 
		System.out.println(d);
		
		System.out.println( my.getCircleArea(100) );
		
		System.out.println("������ : " + my.getRandom());
		System.out.println("������ : " + my.getRandom());
		System.out.println("������ : " + my.getRandom());
		
		my.printInfo("��ī��", 10);
		my.printInfo("ȫ�浿", 25);
		
		//////////////////////////////////////////////
		int data = my.getSum(10, 1);
		System.out.println(data);
		//System.out.println(my.getSum(10, 1));
		
		double data2 = my.calc(10, 3, '*');
		System.out.println(data2);
		
		System.out.println(my.getRandomName());
	}
}












