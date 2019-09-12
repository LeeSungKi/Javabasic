package basic;
/*
 * < java.lang.System >
 * 필드 : 
 *  System.out : 표준 출력 스트림(cmd와 연결된 출력스트림)
 *  System.in : 표준 입력 스트림(cmd와 연결된 입력스트림)
 *  System.err : 표준 출력 스트림(cmd와 연결된 출력스트림)
 */
public class Test04 {
	public static void main(String[] args) {
		System.out.println("ㅋㅋㅋㅋ");
		System.err.println("ㅎㅎㅎㅎ");
		
		long millis = System.currentTimeMillis();
		System.out.println("1970.1.1 09시 ~ 지금까지 경과한 밀리초 : " + millis);
		
		long start = System.currentTimeMillis(); 
		for(int i = 0; i < 1000000; ++i) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start + "밀리초 소요!");
		
		System.exit(0);
	}
}






