package basic;
/*
 * 자식 클래스가 객체화될 때 부모모양 객체가 먼저 만들어진 후 자식의 나머지 필드가 생성된다.
 * ==> 자식 생성자가 호출될 때 부모 생성자가 먼저 호출된다. 
 * 부모생성자에 '기본생성자'가 없을 경우 자식은 에러가 난다. 
 *  해결방법1. 부모클래스에 기본생성자 정의 
 *  해결방법2. 자식클래스의 생성자를 정의한 후, 
 *  		 super()에 부모생성자 형식에 맞는 인자값을 넣는다. 
 *  
 */
class Book {
	String title;
	int price;
//	Book(){
//		System.out.println("부모 생성자 실행");
//	}
	Book(String t, int p){
		title = t;
		price = p;
	}
}
class ComicBook extends Book {
	String hero;
	public ComicBook() {
		super("제목없음", 0);
	}
}
public class Test03 {
	public static void main(String[] args) {
		ComicBook b = new ComicBook();
		System.out.println(b.title);
	}
}
