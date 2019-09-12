package basic;
/*
 * < 예외처리 방법 2가지 >
 * 1. try-catch 
 *  : 즉석에서 예외에 대한 대처 코드를 작성
 *  
 * 2. 예외던지기 ( throws 선언 ) 
 *  : 이 메소드에서 try-catch하지 않고, 이 메소드를 호출할 다음 메서드에게 try-catch 작업을 위임
 *  : 메서드나 생성자에만 선언할 수 있음
 *  : 메인메서드에서는 하지 말자..
 */
public class Test04 {
	// unhandled Exception.. 에러가 뜨면 '반드시' 예외처리를 해야한다.
	public static void main(String[] args) throws InterruptedException {
		
		// 10초 카운트 다운 
		for(int i = 10; i > 0; --i) {
			System.out.println(i + "초");
			Thread.sleep(1000);// 1000 밀리초 동안 일시정지
//			try {
//				Thread.sleep(1000);// 1000 밀리초 동안 일시정지
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} 
		}
	}
}
