package basic;
// Thread �켱����
class ThreadTest01 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 5; ++i) {
			System.out.println(Thread.currentThread().getName());
			// Thread.currentThread() : ���� �ý����� ���� ���� �����尡 ����?
			for(int j = 0; j < 1000; ++j) {
				// Thread.sleep() ���
			}
		}
	}
}
public class Test01 {
	public static void main(String[] args) {
		Thread th1 = new Thread(new ThreadTest01(), "1�� ������");
		Thread th2 = new Thread(new ThreadTest01(), "2�� ������");
		Thread th3 = new Thread(new ThreadTest01(), "3�� ������");
		
		th1.setPriority(1);
		th2.setPriority(10);
		//th3.setPriority(5);
		
		System.out.println(th1.getName() + "�� �켱���� : " + th1.getPriority());
		System.out.println(th2.getName() + "�� �켱���� : " + th2.getPriority());
		System.out.println(th3.getName() + "�� �켱���� : " + th3.getPriority());
		
		th1.start();
		th2.start();
		th3.start();
		
	}
}
