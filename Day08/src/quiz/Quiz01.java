package quiz;
class Person {
	String name;
	int age;
	String contact;
	
	// setData(이름)
	void setData(String n){
		setData(n, 0, null);
	}
	
	// setData(이름, 나이)
	void setData(String n, int a) {
		setData(n, a, null);
	}
	// setData(이름, 나이, 연락처)
	void setData(String n, int a, String c) {
		name = n == null ? "없음": n;
		age = a;
		contact = c == null ? "없음" : c;
	}
	// setData(나이)
	void setData(int a) {
		setData(null, a, null);
	}
	
	// getData() : 모든 정보를 String형으로 묶어서 리턴 
	String getData(){
		return "[" + name + ", " + age + "세, " + contact + "]";
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setData("김피카츄", 10, "010-1111-1111");
		System.out.println(p.getData()); // [김피카츄/10세/010-1111-1111]
		
		Person p2 = new Person();
		p2.setData(20);
		System.out.println(p2.getData());
		
		Person p3 = new Person();
		p3.setData("이푸린", 22);
		System.out.println(p3.getData());
	}
}






