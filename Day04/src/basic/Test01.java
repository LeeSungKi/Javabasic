package basic;

public class Test01 {
	public static void main(String[] args) {
		int n = 1;
		do {
			System.out.println(n);
			++n;
		} while( n <= 10);
		
		int a = 10;
		while( a > 100) { // ó������ false
			System.out.println("while�� ����!");
		}
		
		do {
			System.out.println("do-while�� ����!");
		} while( a > 100);  // ó������ false
		
		// do-while ���� ���ǽ� ������� ������ �ּ� 1ȸ�� �����
		
		/*
		
		while(���ǽ�){
			���ӹ���
		}
		���� : () -> true -> {} -> () -> true -> ...
		
		do {
			���ӹ���
		} while(���ǽ�);
		���� : {} -> () -> true -> {} -> () -> true -> {}..
		
		*/
	}
}



