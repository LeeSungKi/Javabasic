package basic;
/*
 * < 자바의 기본 패키지와 클래스 >
 * 1. java.lang 패키지 
 *  --> System, String, Object, Integer, Double, Math..
 *  --> 자바 개발에 필수적으로 사용되는 API 클래스가 들어있음
 *  --> 기본으로 import되는 패키지 
 * 
 * 2. java.util 패키지
 *  --> Scanner, Date, Calendar, Collection, Arrays... 
 *  --> 자바 개발할 때 사용하면 편리한 클래스들
 * 
 * 3. java.io 패키지 
 *  --> 입출력 스트림에 관한 클래스 
 *  
 * 4. java.awt
 *    javax.swing 
 *  --> GUI 프로그래밍 
 * 
 * 5. java.net 
 *  --> 네트워크 관련 
 *  
 * < java.lang.Object 클래스 >
 * - 모든 클래스들의 root 클래스 (Object를 상속 받는다.)  
 * - Object형의 참조변수에는 모든 타입의 레퍼런스를 저장할 수 있다.
 */
import java.lang.*;
import java.lang.reflect.Field;
import java.util.Scanner;
class Pokemon implements Cloneable{
	String name;
	int level;
	int num;
	
	// num이 같으면 중복 포켓몬 
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Pokemon) {
			Pokemon another = (Pokemon)o;
			return another.num == this.num;
		}
		return false;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return name + "/lv." + level + "/no." + num;
	}
}
public class Test02 {
	public static void main(String[] args) {
		Object o =  1;
		Object o2 = 3.14;
		Object o3 = true; 
		Object[] oArr = {"ABC", 1, true, new Pokemon() };
		for(Object obj : oArr) {
			System.out.println(obj);
		}
		
		// < Object클래스의 주요 메서드 >
		// 1. boolean equals(Object another)
		// --> another 와 이 객체의 레퍼런스가 같은지?
		// --> 오버라이드 하기를 권장 (동등성 비교 용도)
		Pokemon p1 = new Pokemon();
		Pokemon p2 = new Pokemon();
		boolean result = p1.equals(p2);
		System.out.println(result); // false
		
		String s1 = new String("ABC"); // "ABC"
		String s2 = new String("ABC");
		result = s1.equals(s2);
		System.out.println(result); // true
		
		/*Scanner sc = new Scanner(System.in); 
		System.out.print("이름 : ");
		p1.name = sc.next();
		System.out.print("고유번호 : ");
		p1.num = sc.nextInt();
		
		System.out.print("두번째 포켓몬 이름 : ");
		p2.name = sc.next();
		System.out.println("두번째 포켓몬 고유번호 : ");
		p2.num = sc.nextInt();
		
		if(p1.equals(p2)) {
			System.out.println("고유번호는 중복되면 안됩니다.");
		}
		else {
			System.out.println("등록을 완료하였습니다.");
		}*/
		
		// 2. int hashCode() : 이 객체의 해쉬코드(고유번호)를 int형으로 알려줘
		// --> 동일성 비교를 위한 내용으로 오버라이드 하기를 권장
		// --> equals() 오버라이드했다면 hashCode()도 오버라이드 하기
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		Integer num = new Integer(100); 
		System.out.println(num.hashCode());
		
		System.out.println("ABC".hashCode());
		String s = new String("ABC");
		System.out.println(s.hashCode());
		
		// 3. java.lang.Class getClass()
		Class cls = p1.getClass();
		System.out.println(cls.getSimpleName());
		System.out.println(cls.getName());
		
		java.lang.reflect.Field[] fields = cls.getDeclaredFields();
		for(Field f : fields) {
			System.out.println("필드의 자료형 : " + f.getType());
			System.out.println("필드의 이름 : " + f.getName());
		}
		
		Pokemon p3 = p1; // 얕은복사
		p3.name = "피카츄"; 
		System.out.println(p3.name);
		System.out.println(p1.name);
		
		try {
			p3 = (Pokemon)p1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		p1.name = "라이츄"; 
		p3.name = "푸린"; 
		
		System.out.println(p1.name);
		System.out.println(p3.name);
		
		System.out.println("p1: " + p1);
		System.out.println("p1.toString() : " + p1.toString());
		/*
		 * String toString() : 이 객체를 표현하는 한마디!
		 *  참조변수가 출력(sysout, jop) 될 때 자동으로 toString()이 호출된다.
		 */
		String str = p1 + "";
		 //        = p1.toString();
		System.out.println("str : " + str);
	}
}













