package basic;

public class Pokemon {
	// 메인메소드 X
	
	// Pokemon 클래스의 멤버변수  (=필드) 
	String name;
	int hp, ap; 
	
	// Pokemon 클래스의 멤버메서드
	void info() {
		System.out.println("이름 : " + name);
		System.out.println("체력 : " + hp);
		System.out.println("공격력 : " + ap);
	}
}
