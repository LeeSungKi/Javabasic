package basic;
/*
 * < this >
 * - 객체 자신의 레퍼런스
 * - this. : 클래스의 멤버(변수/메서드)
 * 			 --> 나의 
 * - 클래스 내부에서 자신의 멤버변수, 멤버메서드를 지칭하는 경우
 *   자동으로 'this.'이 붙는다.
 *   
 * < this 생성자 >
 * - 생성자 내부에서 다른 생성자를 호출하는 것
 *   (생성자가 여러 개로 오버로드 됐을 경우 사용)
 * - 형식 : this();
 * - 생성자 정의부에 this 생성자의 호출은 가장 첫 째 줄에 호출해야 한다.
 *  
 */
class Pokemon {
	String name;
	int level;
	
	Pokemon(){ }
	Pokemon(String name, int level){
		this.name = name;
		this.level = level;
		printInfo();
	}
	Pokemon(String name2){
		// this.name = name2;
		this(name2, 0);
	}
	Pokemon(int level2){
		//this.level = level2;
		this(null, level2);
	}
	
	String getInfo() {
		return this.name + ", lv." + this.level;
	}
	void printInfo() {
		System.out.println(this.getInfo());
	}
}
public class Test05 {

}
