package basic;
// Thread 우선순위
class ThreadTest01 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 5; ++i) {
			System.out.println(Thread.currentThread().getName());
			// Thread.currentThread() : 현재 시스템이 실행 중인 쓰레드가 뭐니?
			for(int j = 0; j < 1000; ++j) {
				// Thread.sleep() 대용
			}
		}
	}
}
public class Test01 {
	public static void main(String[] args) {
		Thread th1 = new Thread(new ThreadTest01(), "1번 쓰레드");
		Thread th2 = new Thread(new ThreadTest01(), "2번 쓰레드");
		Thread th3 = new Thread(new ThreadTest01(), "3번 쓰레드");
		
		th1.setPriority(1);
		th2.setPriority(10);
		//th3.setPriority(5);
		
		System.out.println(th1.getName() + "의 우선순위 : " + th1.getPriority());
		System.out.println(th2.getName() + "의 우선순위 : " + th2.getPriority());
		System.out.println(th3.getName() + "의 우선순위 : " + th3.getPriority());
		
		th1.start();
		th2.start();
		th3.start();
		
	}
}
