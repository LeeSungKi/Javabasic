package basic;
/*
 * < 인터페이스 >
 * - 껍데기! 추상화의 극강! 
 * - 규약, 약속 
 * - 사용자 정의 상수와 추상메서드를 구상할 때 정의한다.
 * - 인터페이스에서 선언할 수 있는 대상 
 *  	1) 상수 ( public static final )
 *  	2) 추상 메서드 ( public abstract ) 
 *  	3) default 메서드 ( default )
 *  	4) static 메서드 ( static )
 *   ==> 일반 멤버변수, 일반 멤버메서드 선언 불가
 *  
 */
public interface Item {
	/*public static final */int DEFAULT_PRICE = 10000;
	/*public abstract*/ String info();
	/*public abstract*/ void adjust();
	default void aa() { }
	static void bb() { }
}





