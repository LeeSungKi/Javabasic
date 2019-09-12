package basic;
/*
 * < 형변환(casting) >
 * 1. 자동형변환 -> 컴퓨터가 자동으로 해줌 (데이터 손실 우려가 없을 때 해줌)
 * 2. 강제형변환 -> 개발자가 직접 하는 것 (casting 연산자 사용)
 * 
 * < 캐스팅 연산자 >
 * 형식 : (자료형)형변환 할 대상  
 *           -------------
 *           	데이터(상수), 변수
 * 
 * < 파싱 (Parsing) >
 * - 문자열(String) ==> 다른자료형으로 변환(해석)
 */
public class Test01 {
	public static void main(String[] args) {
		double a = '가'; // char형인 '가'가 실수로 '자동형변환'
		System.out.println(a);
		
		char b = (char)44032.0; // 실수는 소숫점 유실 때문에 자동형변환 안해줌
		System.out.println(b);
		
		String s = "10"; 
		System.out.println(s + 1); // 101
		// System.out.println( (int)s  + 1); // 에러!
		System.out.println( Integer.parseInt(s) + 1); // 11
		System.out.println((int)'1');
	}
}








