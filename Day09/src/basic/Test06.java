package basic;

import basic2.Pokemon;

/*
 * < 접근제어자(=접근제한자/ access modifiers) >
 * 
 * 				클래스 내부		같은 패키지의 다른 클래스		다른패키지
 * 1. public		O				O					O
 * 2. protected		O				O					X(자식클래스에게는 O)
 * 3. 				O				O					X
 * 4. private 		O				X					X
 * 
 * public, package 접근제한자 : 클래스, 멤버(변수,메서드,생성자) 앞에 붙일 수 있다.
 * protected, private 접근제한자 : 멤버(변수,메서드,생성자) 앞에 붙일 수 있다.
 * 
 * ** 참고 
 *  하나의 소스파일(.java)에는 복수의 public 클래스를 정의할 수 없다.
 *  public 클래스가 선언된 경우, 그 클래스의 이름은 소스파일의 이름과 같아야 한다.
 * 
 * 
 * < 객체 무결성 >
 * - 잘못된 데이터가 들어가면 안된다.
 * 
 * < 데이터 은닉화 >
 * - 필요한 것만 노출
 * - 목적 : 무결성 지키기, 이 클래스를 사용할 다른 개발자들이 쉽게 사용할 수 있도록 
 * 
 * < 데이터 캡슐화 >
 * - 은닉화를 구현하는 방법 중 하나
 * - 데이터에 보호막 치기
 * - 필드(멤버변수)는 무조건 private으로 선언한다. 
 *   간접적으로 필드에 접근할 수 있도록 getter와 setter 메서드를 만든다.
 *   
 * 
 * 
 */
public class Test06 {
	public static void main(String[] args) {
		Pokemon p1 = new Pokemon(); 
		// p1.name = "피카츄";
		
		p1.setName("피카츄"); 
		System.out.println(p1.getName());
		
		p1.setLevel(-100);
		System.out.println(p1.getLevel());
	}
}








