package basic;
/*
 * < final >
 * - 최후의, 변경할 수 없는
 * - 변수 앞에 ( 멤버변수, 매개변수, 지역변수 모두 가능 ) 
 * 		: 값 변경 불가
 * 
 *   클래스 앞에 
 * 		: 상속 불가 
 *   
 *   메서드 앞에 
 *   	: 오버라이드(재정의) 불가  (오버로드랑 상관없음)
 *   
 */
class Sample3 {
	//final int num; // final 멤버 변수는 선언 및 초기화를 반드시 해야 한다.
	//final int num = 10;
	final int NUM = 10; // final 변수는 all 대문자, 띄어쓰기 대신 '_' 작명법 사용
}
public class Test04 {
	public static void main(String[] args) {
		final int num;
		num = 10;
		//num = 20; // 변경 불가
	}
}




