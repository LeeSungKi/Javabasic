package basic;
/*
 * < Wrapper Classes(����Ŭ����) >
 * - �����ڷ��� �����͸� ��üȭ �� �� ����ϴ� 8���� Ŭ����
 * - int ==> Integer
 * 	 byte(Byte), short(Short), long
 *   double, float, boolean, char(Character)
 */
public class Test03 {
	public static void main(String[] args) {
		Object[] arr = {1, 3.14, "ABC", '��', false }; 
		
		System.out.println((Integer)arr[0] + 10);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		Integer num = new Integer("200"); // 10�� Integer�� ��ü�� boxing
		System.out.println(num + 100);
		
		System.out.println(Integer.MIN_VALUE);
	}
}







