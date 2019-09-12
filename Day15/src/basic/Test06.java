package basic;

import javax.swing.JOptionPane;

public class Test06 {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작!");
		
		Thread t = new Thread(new Timer2());
		t.setDaemon(true); // t 스레드를 메인스레드의 보조(daemon)스레드로 설정
						   // 메인스레드가 종료 되면 자동으로 같이 종료 됨.
						   // start() 하기 전에 설정해야 함!
		t.start(); // 타이머 실행
		
		JOptionPane.showMessageDialog(null, "확인 누르면 프로그램 종료");
		
		System.out.println("메인스레드 끝!");
	}
}
