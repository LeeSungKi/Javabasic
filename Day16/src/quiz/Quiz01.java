package quiz;

import javax.swing.JOptionPane;

class Timer implements Runnable {
	private int s;
	private boolean run = true;
	
	public int getSecond() {
		return s;
	}
	public void stop() {
		run = false;
	}
	
	@Override
	public void run() {
		while(run) {
			System.out.println(++s + "초");
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		// 구구단 5개 맞출 때 까지 ( JOP으로 문제 내기 )
		// sysout으로 초단위를 출력(1초.. 2초.. 3초..)
		// --> 5문제 모두 맞췄을 때 "총 XX소요!"를 출력
		
		Timer t = new Timer();
		Thread th = new Thread(t);
		th.setDaemon(true);
		th.start();
		int count = 0;
		while(count < 5) {
			try {
				int r1 = (int)(Math.random() * 8 ) + 2; // 2 ~ 9
				int r2 = (int)(Math.random() * 9 ) + 1; // 1 ~ 9
				int user = Integer.parseInt(JOptionPane.showInputDialog(r1 + "X" + r2));
				if(user == r1*r2) {
					++count;
					JOptionPane.showMessageDialog(null, "정답!");
				}
				else {
					JOptionPane.showMessageDialog(null, "땡!");
				}
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "정수를 입력하셔야 합니다.");
			}
		}
		t.stop();
		JOptionPane.showMessageDialog(null, "총 " + t.getSecond() + "초 소요!");
	}
}




