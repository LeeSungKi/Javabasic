package basic;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		double d = Math.random(); // 0.0 ~ 0.999999999
		System.out.println(d);
		
		// 0 ~ 9 �� 1�� �̱�
		System.out.println( (int)(Math.random() * 10) );
		
		// 1 ~ 10 
		System.out.println( (int)(Math.random() * 10) + 1 );
		
		// 2 ~ 9 
		System.out.println( (int)(Math.random() * 8) + 2);
		
		// (int)(Math.random() * ����) + ���ۼ� 
		
		// 1 ~ 6 
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println(dice);
		
		// 1 ~ 45
		int lotto = (int)(Math.random() * 45) + 1;
		System.out.println(lotto);
		
		Random r = new Random();
		System.out.println( "���� ���� : " + r.nextInt() );
		System.out.println( "���� bool : " + r.nextBoolean() );
		System.out.println( "0 ~ 10 : " + r.nextInt(11) ); // 0 <= r < 11
		
		if(Math.random() < 0.2) { // �� ���� true�� Ȯ�� 20%
			System.out.println("������!");
		}
		else {
			System.out.println("�Ϲ���..");
		}
	}
}









