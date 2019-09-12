package quiz;

public class Quiz02 {
	public static void main(String[] args) {
		// Math.random()을 사용하여 1 ~ 45의 수 중 하나의 정수를 랜덤하게 뽑고
		// 뽑힌 정수를 출력하고 짝수 혹은 홀수를 판별하세요.
		int r = (int)(Math.random() * 45) + 1;
		System.out.println("뽑힌 수 : " + r);
		
		if(r % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		/////////////////////////////////////////////////
		// 잘못된 코드
//		System.out.println("뽑힌 수 : " + (int)(Math.random() * 45) + 1);
//		if( ((int)(Math.random() * 45) + 1 ) % 2 == 0) {
//			System.out.println("짝수");
//		}
//		else {
//			System.out.println("홀수");
//		}
		
	}
}





