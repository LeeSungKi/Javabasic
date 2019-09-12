package basic;
/*
 * < 메서드 오버로드( Overload ) >
 * - 하나의 메서드를 '매개변수 개수 혹은 자료형'에 차이를 두어 여러 메서드로 만드는 것
 * - 주의!
 *    메서드를 구분하는 기준은 매개변수의 '자료형'과 '개수'임 
 *    리턴자료형은 각자 달라도 된다.
 */
class Sample {
	void aa() {
		System.out.println("aa() 실행! 매개변수 없음!");
	}
	void aa(int a) {
		System.out.println("aa() 실행! 매개변수 int형 : " + a);
	}
	void aa(String a) {
		System.out.println("aa() 실행! 매개변수 String 형 : " + a);
	}
	void aa(int a, int b) {
		System.out.println("aa() 실행! 매개변수 int, int : " + a + ", "+b);
	}
}
public class Test01 {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.aa();
		s.aa(10); 
		s.aa("ABC"); 
		s.aa(1, 10);
		// s.aa(1, 2, 3); 
		System.out.println();
		System.out.println(1);
		System.out.println("ABC");
	}
}









