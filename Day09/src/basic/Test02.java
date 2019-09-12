package basic;
class Sample2 {
	String insStr = "나는 인스턴스 멤버~"; 
	static String clsStr = "나는 클래스 멤버~";
	
	// 인스턴스 멤버 : non-static 멤버 ==> 인스턴스가 생성되어야 사용가능하다
	// 클래스 멤버 : static 멤버 ==> 클래스 영역에 있는 멤버
	
	void insMethod() {
		System.out.println(insStr);
		System.out.println(clsStr);
	}
	
	static void clsMethod() {
		// System.out.println(insStr); // 에러!
		System.out.println(clsStr);
		// static 메서드 안에서는 non-static 멤버를 사용할 수 없다.
		// (하려면 객체 생성을 해야 한다..)
		// ==> static 메서드가 non-static인 멤버보다 먼저 생성되어야하기 때문임
	}
}
public class Test02 {
	public static void main(String[] args) {
		// System.out.println( Sample2.insStr ); // 에러! 
		System.out.println( Sample2.clsStr );
	}
}
