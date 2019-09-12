package basic;
/*
 *  < static >
 *  - 정적인, 고정된
 *  - 메소드, 멤버변수 앞에 선언
 *  - 1. 무조건 만들어진다. 
 *  	클래스 로드 시 무조건 생성된다. (프로그램 실행 직전에 미리 생성해둠)
 *      ==> new 없이도 사용 가능하다.
 *      
 *    2. 1개만 만들어진다.
 *      인스턴스가 아무리 많아도 static으로 선언된 멤버변수는 
 *      프로그램 통틀어 1개만 있다
 *      ==> 공유하는 멤버
 *      
 *    3. static 멤버 접근 방법 : 클래스명.멤버명
 *      
 *  - static의 용도 
 *    1. 모든 인스턴스들이 공유해야하는 데이터인 경우
 *    	-> static으로 필드를 선언한다.
 *     
 *    2. 객체 생성 없이도 사용할 수 있는 메서드인 경우
 *      -> static으로 메서드를 선언한다. 
 *         (메서드 내부에 인스턴스 멤버가 사용되지 않는 메서드)
 */
class Sample {
	static void aa() {
		System.out.println("ㅋㅋㅋㅋㅋ");
	}
	static double getCircelArea(int r) {
		return r * r * 3.14;
	}
}
public class Test01 {
	public static void main(String[] args) {
		//Math.PI;
		//Math.random(); 
		//Integer.parseInt();
		//System.out.println();
		
//		aa()가 static이 아닌 경우는 new로 객체화하여 사용해야 한다.
		Sample s = new Sample();
		s.aa();
		
//		aa()가 static으로 선언되었다면 '클래스명'으로 사용할 수 있다. 
		Sample.aa();
	}
}







