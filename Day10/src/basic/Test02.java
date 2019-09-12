package basic;
/*
 * < super >
 * - 자식 객체 안의 부모객체의 레퍼런스
 * 
 * < super() >
 * - 부모 클래스의 생성자 호출
 */
class Parent {
	String str = "나는 Parent의 str~"; 
}
class Child extends Parent {
	String str = "나는 Child의 str~";
	void aa() {
		String str = "나는 지역변수 str~!";
		System.out.println(str);
		System.out.println(this.str);
		System.out.println(super.str);
	}
}
public class Test02 {
	public static void main(String[] args) {
		Child c = new Child();
		// System.out.println(c.str); // 나는 Child의 str~
		//c.aa();
		System.out.println(((Parent)c).str); // 나는 Parent의 str~
	}
}







