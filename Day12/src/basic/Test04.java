package basic;
/*
 * < java.lang.System >
 * �ʵ� : 
 *  System.out : ǥ�� ��� ��Ʈ��(cmd�� ����� ��½�Ʈ��)
 *  System.in : ǥ�� �Է� ��Ʈ��(cmd�� ����� �Է½�Ʈ��)
 *  System.err : ǥ�� ��� ��Ʈ��(cmd�� ����� ��½�Ʈ��)
 */
public class Test04 {
	public static void main(String[] args) {
		System.out.println("��������");
		System.err.println("��������");
		
		long millis = System.currentTimeMillis();
		System.out.println("1970.1.1 09�� ~ ���ݱ��� ����� �и��� : " + millis);
		
		long start = System.currentTimeMillis(); 
		for(int i = 0; i < 1000000; ++i) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start + "�и��� �ҿ�!");
		
		System.exit(0);
	}
}






