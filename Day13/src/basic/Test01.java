package basic;

public class Test01 {
	public static void main(String[] args) {
		String a = "ABC"; 
		System.out.println("concat 전 a : " + a.hashCode());
		a += "DEF"; 
		System.out.println("concat 후 a : " + a.hashCode());
		// String 객체는 '+' 할 때 마다 새 객체를 생성한다.
		// 심각한 경우 메모리 부하가 일어날 수 있다.
		// 문자열 누적을 자주해야 하는 경우 StringBuilder/StringBuffer 클래스를 사용한다.
		
		
		StringBuffer b = new StringBuffer("ABC");
		System.out.println("concat 전 b : " + b.hashCode());
		b.append("DEF");
		System.out.println("concat 후 b : " + b.hashCode());
		System.out.println(b); // b.toString()
		// 객체를 1개만 만들어놓고, 문자열을 저장할 버퍼를 생성한다.
		// append() 실행하면 해당 문자열을 버퍼에 추가한다. 
		// 객체가 매번 생성되지 않으므로 메모리 부담을 줄일 수 있다.
	}
}
