package basic;
// join() : 해당 쓰레드가 먼저 작업하도록 주스레드를 새치기
class ThreadTest03 implements Runnable{

	String name;
	public ThreadTest03(String n) {
		name = n;
	}
	@Override
	public void run() {
		for(int i = 0; i < 10; ++i) {
			System.out.println(name + " : " + i);
			
		}
		System.out.println("<<<" + name + " 완료! >>>");
	}
}
public class Test03 {
	public static void main(String[] args) {
		ThreadTest03 t1 = new ThreadTest03("1번 thread");
		ThreadTest03 t2 = new ThreadTest03("2번 thread");
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < 10; ++i) {
			System.out.println("메인 thread : " + i);
		}
		System.out.println("<<< 메인 thread 완료! >>> ");
	}
}
