package basic;
/*
 * < 다형성(polymorphism) >
 * - 형태가 다양하게 변할 수 있는 성질 
 * - 레퍼런스 형변환
 * - 1개의 인스턴스가 여러 자료형을 가질 수 있는 것
 *   (단, 상속 관계) 
 * - 장점) 
 *      하나의 배열에 여러 타입의 객체가 저장될 수 있다.
 *      하나의 매개변수에 여러 타입의 객체가 들어갈 수 있다.
 * - 부모타입은 모든 자식타입을 소화할 수 있다!!!!!!!
 * - 다형성의 한계 : 부모가 물려준 멤버와 오버라이드된 메서드만 인식할 수 있다.
 * - 업캐스팅 : 위로 형변환 (자식 레퍼런스가 부모타입으로 형변환) ==> 자동형변환 
 *   다운캐스팅 : 아래로 형변환 (부모타입이었던 인스턴스가 본래모습으로 형변환) ==> 강제형변환
 */
class Ironman extends Hero {
	int money;
	void move() {
		System.out.println("아이언맨 날아간ㄷㅏ!");
	}
}
public class Test05 {
	public static void main(String[] args) {
		Hero h;
		// h가 슈퍼맨이 됨
		h = (Hero)new Superman();
		h.move();
		
		// h가 배트맨이 됨 
		h = (Hero)new Batman();
		h.move();
		
		Hero[] heros = { new Hero(), 
						new Superman(), 
						new Batman(),
						new Spiderman() };
		for(Hero hero : heros) {
			hero.move();
		}
		
		Hero h2 = new Ironman();
		h2.move();
		((Ironman)h2).money = 1000; 
		
		Ironman i = new Ironman();
		i.money = 1000; 
		
	}
}

	
	
	
	
	