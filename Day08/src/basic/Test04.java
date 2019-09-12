package basic;
/*
 * < 생성자 (Constructor) >
 * - 형식 : 
 * 		클래스명(){
 * 	
 * 		}
 * ==> 리턴 자료형 X
 * ==> 클래스 이름과 동일
 * 
 * - 객체 생성 시 객체 1개당 1씩만 호출할 수 있는 
 *   초기화용 특수 메서드
 * - 직접 생성자를 정의하지 않으면 '기본 생성자'가 자동으로 정의됨
 * 	 (직접 생성자 정의하면 '기본생성자'는 만들어지지 않는다!!!!)
 *   기본생성자 형식
 *    	public 클래스명(){
 *    		// 내용 없음
 *    	}
 */
class Person {
	String name;
	int age;
	
	Person(String name, int a){
		this.name = name;
		age = a;
		System.out.println("인스턴스 생성 완료!");
		
	}
}

public class Test04 {
	public static void main(String[] args) {
		Person p1; // 참조변수 선언
		//p1 = new Person(); // 인스턴스 생성
		p1 = new Person("김피카츄", 10); 
		System.out.println(p1.name);
		System.out.println(p1.age);
	}
}
