package basic;
/*
 * < 객체 지향 >
 * 1. 클래스 
 *  - 집에 대한 설계도
 *  
 * 2. 인스턴스(=객체)
 *  - 집
 *  
 * 3. 레퍼런스(=참조)
 *  - 집의 주소 (인스턴스의 위치 주소)
 *  
 * 4. 레퍼런스 변수(=참조 변수)
 *  - 집의 주소를 적는 메모장
 *  
 * 5. 레퍼런스 타입(=참조자료형)
 *  - 집의 모양
 *  
 *  ** 인스턴스는 Heap 메모리에 할당된다. 
 *             ----------
 *             	주소로만 접근 가능한 메모리
 */
public class Test03 {
	public static void main(String[] args) {
		// 포켓몬 인스턴스 3마리 만들기 
		
		// 참조변수(주소 메모장) 3개 만들기 
		Pokemon p1, p2, p3; 
		
		// Pokemon 인스턴스를 생성하고, 그 주소를 참조변수에 저장
		p1 = new Pokemon();
		p2 = new Pokemon();
		p3 = new Pokemon();
		
		// 생성된 인스턴스에 각각 데이터를 저장
		p1.name = "피카츄"; 
		p1.hp = 1000;
		p1.ap = 7;
		
		p2.name = "라이츄"; 
		p2.hp = 1200;
		p2.ap = 9;
		
		p3.name = "치코리타"; 
		p3.hp = 200;
		p3.ap = 1;
		
		System.out.println(p1.name);
		System.out.println(p1.hp + ", " + p1.ap);
		
		p2.info();
		p3.info();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		p3 = p1;
		p3.name = "잠만보"; 
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println(p3.name);
		System.out.println(p1.name);
		
		p3 = null; // 참조변수는 null을 사용하여 데이터를 지운다.
		// null의 의미 : 인스턴스 아직 없음
		System.out.println(p3.name);
		// null.name ==> (X) 인스턴스가 없음.. 
		// NullPointerException
	}
}







