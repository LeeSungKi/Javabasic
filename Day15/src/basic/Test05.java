package basic;

import javax.swing.JOptionPane;

/*
 * < 멀티 스레드 프로그램 >
 * - thread란?
 *   1개의 프로세스가 처리하는 작업의 단위
 *   
 *   단일 thread : 스레드 1개. 여태 우리가 했던 프로그램
 *   멀티 thread : 스레드 여러 개. 
 *   	-> 여러 스레드를 하나의 프로세스가 병렬 처리하는 것
 * 
 * < 스레드 추가 방법 > 
 * 1. Thread를 extend 하기
 *  1) Thread를 상속받은 클래스를 1개 만든다.
 *  2) run() 오버라이드 하기
 *    => 해야 할 일을 작성한다.
 *  3) 이 쓰레드를 실행할 시점에 객체 생성 (new) 하고 start() 호출 
 *   
 * 2. Runnable를 implement 하기
 *  1) Runnable을 구현하는 클래스를 1개 만든다.
 *  2) run() 오버라이드 
 *    => 해야 할 일을 작성한다. 
 *  3) 이 쓰레드를 실행할 시점에 객체 생성 한다. 
 *    Thread th = new Thread(내가 만든 객체); 
 *    th.start();
 */
class Timer extends Thread {
	
	public void run() {
		try {
			for(int i = 10; i > 0; --i) {
				System.out.println(i + "초");
				Thread.sleep(1000);
			}
		} catch(Exception e) {}
	}
}
class Timer2 implements Runnable {
	public void run() {
		try {
			for(int i = 10; i > 0; --i) {
				System.out.println(i + "초");
				Thread.sleep(1000);
			}
		} catch(Exception e) {}
	}
}
public class Test05 {
	public static void main(String[] args) {
		// 10초 카운트 다운 + jop 입력/입력값 다시 출력
		Timer t = new Timer();
		t.start();
		
		Timer2 t2 = new Timer2();
		Thread th = new Thread(t2);
		th.start();
 		
		String input = JOptionPane.showInputDialog("아무거나.."); 
		JOptionPane.showMessageDialog(null, input);
		
	}
}





