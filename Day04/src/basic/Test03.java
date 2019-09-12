package basic;

public class Test03 {
	public static void main(String[] args) {
		/*
		 * < break >
		 * - �ڽ��� ���� switch, while, do-while, for���� �����Ѵ�.
		 * - ��ø ������ ���, ���� �����(���� ������) switch/�ݺ����� �����Ѵ�.
		 *   while(){
		 *  	while(){
		 *  		for(; ;){
		 *  			if( ) { break; } // for���� ����
		 *  		}
		 *  	}
		 *   }
		 * < continue >
		 * - �ڽ��� ���� while, do-while, for���� �����ִ� ���ӹ����� �ǳʶڴ�.
		 *  ==> �ݺ��� ������ 
		 * 
		 * < return >
		 * - �ڽ��� ���� �޼��带 �����Ѵ�.
		 *   (���θ޼����� return ==> ���α׷� ����)
		 */
		
		System.out.println("< break test >");
		for(int n = 10; n > 0; --n) {
			if(n % 4 == 0) {
				break;
			}
			System.out.println(n);
		}
		
		System.out.println("< continue test >");
		for(int n = 10; n > 0; --n) {
			if(n % 4 == 0) {
				continue;
			}
			System.out.println(n);
		}
		
//		System.out.println("< return test >");
//		for(int n = 10; n > 0; --n) {
//			if(n % 4 == 0) {
//				return;
//			}
//			System.out.println(n);
//		}

		
		// 1 ~ 100 ¦/Ȧ ���
		for(int n = 1; n <= 100; ++n) {
//			if(n % 2 == 0) {
//				System.out.println(n + " : ¦��");
//			}
//			else {
//				System.out.println(n + " : Ȧ��");
//			}
			
			if(n % 2 == 0) {
				System.out.println(n + " : ¦��");
				continue;
			}
			System.out.println(n + " : Ȧ��");
		}
		
	}
}











