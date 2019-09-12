package quiz;

public class Quiz02 {
	public static void main(String[] args) {
		// 1. 1 ~ 20 중 랜덤한 정수를 5번 출력 (중복 가능)
		// 2. 1 ~ 1000 중 11과 17의 공배수만 출력
		// 3. 2단 ~ 9단까지 모든 구구단을 출력
		
		// 문제 1
		for(int a = 0; a < 5; ++a) {
			System.out.println( (int)(Math.random() * 20) + 1);
		}
		
		// 문제2 
		for(int b = 1; b <= 1000; ++b) {
			if(b % 11 == 0 && b % 17 == 0) {
				System.out.println(b);
			}
		}
		// 문제2
		for(int b = 11*17; b <= 1000; b += 11*17) {
			System.out.println(b);
		}
		
		// 문제3
		for(int dan = 2; dan <= 9; ++dan) {
			System.out.println("< " + dan + "단 >");
			for(int n = 1; n <= 9; ++n) {
				System.out.println(dan + " X " + n + " = " + dan*n );
			}
		}
	}
	
}





