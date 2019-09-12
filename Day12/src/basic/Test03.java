package basic;
/*
 * < Wrapper Classes(포장클래스) >
 * - 원시자료형 데이터를 객체화 할 때 사용하는 8가지 클래스
 * - int ==> Integer
 * 	 byte(Byte), short(Short), long
 *   double, float, boolean, char(Character)
 */
public class Test03 {
	public static void main(String[] args) {
		Object[] arr = {1, 3.14, "ABC", '가', false }; 
		
		System.out.println((Integer)arr[0] + 10);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		Integer num = new Integer("200"); // 10을 Integer형 객체로 boxing
		System.out.println(num + 100);
		
		System.out.println(Integer.MIN_VALUE);
	}
}







