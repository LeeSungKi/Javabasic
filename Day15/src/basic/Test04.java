package basic;
/*
 * < ����ó�� ��� 2���� >
 * 1. try-catch 
 *  : �Ｎ���� ���ܿ� ���� ��ó �ڵ带 �ۼ�
 *  
 * 2. ���ܴ����� ( throws ���� ) 
 *  : �� �޼ҵ忡�� try-catch���� �ʰ�, �� �޼ҵ带 ȣ���� ���� �޼��忡�� try-catch �۾��� ����
 *  : �޼��峪 �����ڿ��� ������ �� ����
 *  : ���θ޼��忡���� ���� ����..
 */
public class Test04 {
	// unhandled Exception.. ������ �߸� '�ݵ��' ����ó���� �ؾ��Ѵ�.
	public static void main(String[] args) throws InterruptedException {
		
		// 10�� ī��Ʈ �ٿ� 
		for(int i = 10; i > 0; --i) {
			System.out.println(i + "��");
			Thread.sleep(1000);// 1000 �и��� ���� �Ͻ�����
//			try {
//				Thread.sleep(1000);// 1000 �и��� ���� �Ͻ�����
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} 
		}
	}
}
