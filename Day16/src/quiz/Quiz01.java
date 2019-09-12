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
			System.out.println(++s + "��");
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		// ������ 5�� ���� �� ���� ( JOP���� ���� ���� )
		// sysout���� �ʴ����� ���(1��.. 2��.. 3��..)
		// --> 5���� ��� ������ �� "�� XX�ҿ�!"�� ���
		
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
					JOptionPane.showMessageDialog(null, "����!");
				}
				else {
					JOptionPane.showMessageDialog(null, "��!");
				}
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "������ �Է��ϼž� �մϴ�.");
			}
		}
		t.stop();
		JOptionPane.showMessageDialog(null, "�� " + t.getSecond() + "�� �ҿ�!");
	}
}




