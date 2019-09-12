package basic;

public class Test03 {
	public static void main(String[] args) {
		/*
		 * < break >
		 * - 자신이 속한 switch, while, do-while, for문을 종료한다.
		 * - 중첩 구조인 경우, 가장 가까운(가장 안쪽의) switch/반복문을 종료한다.
		 *   while(){
		 *  	while(){
		 *  		for(; ;){
		 *  			if( ) { break; } // for문을 종료
		 *  		}
		 *  	}
		 *   }
		 * < continue >
		 * - 자신이 속한 while, do-while, for문의 남아있는 종속문장을 건너뛴다.
		 *  ==> 반복은 유지됨 
		 * 
		 * < return >
		 * - 자신이 속한 메서드를 종료한다.
		 *   (메인메서드의 return ==> 프로그램 종료)
		 */
		
		System.out.println("< break test >");
		for(int n = 10; n > 0; --n) {
			if(n % 4 == 0) {
				break;
			}
			System.out.println(n);
		}
		
		System.out.println("< continue test >");
		for(int n = 10; n > 0; --n) {
			if(n % 4 == 0) {
				continue;
			}
			System.out.println(n);
		}
		
//		System.out.println("< return test >");
//		for(int n = 10; n > 0; --n) {
//			if(n % 4 == 0) {
//				return;
//			}
//			System.out.println(n);
//		}

		
		// 1 ~ 100 짝/홀 출력
		for(int n = 1; n <= 100; ++n) {
//			if(n % 2 == 0) {
//				System.out.println(n + " : 짝수");
//			}
//			else {
//				System.out.println(n + " : 홀수");
//			}
			
			if(n % 2 == 0) {
				System.out.println(n + " : 짝수");
				continue;
			}
			System.out.println(n + " : 홀수");
		}
		
	}
}











