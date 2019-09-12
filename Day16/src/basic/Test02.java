package basic;
// Thread yield()
//  다른 쓰레드들에게 해당 시간 만큼 양보하기(실행 대기)
class ThreadTest02 implements Runnable{
	static int count;
	boolean yield = false;
	
	@Override
	public void run() {
		for(int i = 0; i < 30; ++i) {
			System.out.println(++count + ". " + Thread.currentThread().getName());
			if(yield) {
				Thread.yield();
			}
		}
	}
}

public class Test02 {
	public static void main(String[] args) {
		ThreadTest02 r1 = new ThreadTest02();
		ThreadTest02 r2 = new ThreadTest02();
		ThreadTest02 r3 = new ThreadTest02();
		
		Thread th1 = new Thread(r1, "1번 쓰레드");
		Thread th2 = new Thread(r2, "2번 쓰레드");
		Thread th3 = new Thread(r3, "3번 쓰레드");
		
		r1.yield = true;
		
		th1.start();
		th2.start();
		th3.start();
	}
}
