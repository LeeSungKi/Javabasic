package basic;

public class Person {
	String name;
	int age;
	
	void setInfo(String n, int a) {
		name = n;
		age = a;
		System.out.println("정보 저장 완료!");
	}
	
	void introduce() {
		System.out.println("저는 " + name + "이고, " + age + "살입니다.");
	}
	
	String getInfo() {
		return "[" + name + "/" + age + "세]";
	}
}





