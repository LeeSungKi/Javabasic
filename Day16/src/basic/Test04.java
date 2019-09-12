package basic;
class ThreadTest04 implements Runnable{
	@Override
	public void run() {
		Test04.aa();
	}
}
public class Test04 {
	static int n = 10;
	synchronized static void aa(){
		while(n > 0) {
			System.out.println(Thread.currentThread().getName() + " : " + n--);
			try { Thread.sleep(1000); } catch(Exception e) {}
		}
		n = 10;
	}
	public static void main(String[] args) {
		new Thread(new ThreadTest04(), "Thread 1").start();
		new Thread(new ThreadTest04(), "Thread 2").start();
		
	}
}
