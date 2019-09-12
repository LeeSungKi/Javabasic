package basic;
/*
 * < 상속 (Inheritance) >
 * - 확장 
 * - 기존클래스(원본)를 '확장'하여 새 클래스로 만드는 작업
 * 원본 : 부모클래스, 슈퍼클래스, 상위클래스 
 * 확장 : 자식클래스, 서브클래스, 하위클래스
 * 
 */
class Person { // 부모클래스
	String name;
	int age;
	void printPerson() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
	}
}
class Student extends Person {
	String grade;
	int num;
}
class Teacher extends Person {
	String subject;
	int salary;
}
class Employee extends Person {
	String department; // 부서
}
public class Test01 {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name = "홍길동";
		t.age = 30;
		t.subject = "국사"; 
		t.printPerson();
	}
}
