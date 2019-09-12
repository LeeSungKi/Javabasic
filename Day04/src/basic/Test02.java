package basic;

public class Test02 {
	public static void main(String[] args) {
		for(int n = 1; n <= 10; ++n) {
			System.out.println(n);
		}
		
//		int n;
//		for(n = 1; n <= 10; ++n) {
//			System.out.println(n);
//		}
		
		/*
		 *  for( 초기식 ; 조건식 ; 증감식 ){
		 *  	종속문장
		 *  }
		 * 
		 */
		
		int a;
		int b;
		for(a = 1, b = 1; a <= 10; ++a, b += 2) {
			System.out.println("a : " + a);
			System.out.println("b : " + b);
		}
	}
}







