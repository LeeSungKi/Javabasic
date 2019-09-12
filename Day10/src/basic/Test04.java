package basic;
/*
 * < 메서드 오버라이드(Override) > 
 * - 메서드 재정의
 * - 부모가 물려준 메서드를 자식클래스가 {} 만 다시 쓰는 것 
 * 
 * < 오버라이드 목적 >
 * - 같은 식구 클래스 간의 메서드 사용방식 통일
 *   예) 유닛을 이동시키는 메서드는 move()로 통일하자! 
 * - 다형성 구현 ******
 */
class Hero {
	// 필드 생략....
	void move() {
		System.out.println("영웅 이동~");
	}

}
class Superman extends Hero {
	@Override // annotation : JVM에게 건네는 메시지
	void move() { System.out.println("슈퍼맨 날아간당~");	}
}
class Batman extends Hero {
	void move() { System.out.println("배트맨, 배트카로 이동!!"); }
}
class Spiderman extends Hero {
	void move() { System.out.println("스파이더맨, 거미줄로 이동!"); }
}
public class Test04 {
	public static void main(String[] args) {
		Superman superman = new Superman();
		Batman batman = new Batman();
		Spiderman spiderman = new Spiderman();
		
		superman.move();
		batman.move();
		spiderman.move();
	}
	
}
