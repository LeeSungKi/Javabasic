package basic;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		double d = Math.random(); // 0.0 ~ 0.999999999
		System.out.println(d);
		
		// 0 ~ 9 중 1개 뽑기
		System.out.println( (int)(Math.random() * 10) );
		
		// 1 ~ 10 
		System.out.println( (int)(Math.random() * 10) + 1 );
		
		// 2 ~ 9 
		System.out.println( (int)(Math.random() * 8) + 2);
		
		// (int)(Math.random() * 개수) + 시작수 
		
		// 1 ~ 6 
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println(dice);
		
		// 1 ~ 45
		int lotto = (int)(Math.random() * 45) + 1;
		System.out.println(lotto);
		
		Random r = new Random();
		System.out.println( "랜덤 정수 : " + r.nextInt() );
		System.out.println( "랜덤 bool : " + r.nextBoolean() );
		System.out.println( "0 ~ 10 : " + r.nextInt(11) ); // 0 <= r < 11
		
		if(Math.random() < 0.2) { // 이 식이 true일 확률 20%
			System.out.println("전설템!");
		}
		else {
			System.out.println("일반템..");
		}
	}
}









