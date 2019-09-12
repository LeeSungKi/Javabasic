package basic;

import javax.swing.JOptionPane;

/*
 * < ��Ƽ ������ ���α׷� >
 * - thread��?
 *   1���� ���μ����� ó���ϴ� �۾��� ����
 *   
 *   ���� thread : ������ 1��. ���� �츮�� �ߴ� ���α׷�
 *   ��Ƽ thread : ������ ���� ��. 
 *   	-> ���� �����带 �ϳ��� ���μ����� ���� ó���ϴ� ��
 * 
 * < ������ �߰� ��� > 
 * 1. Thread�� extend �ϱ�
 *  1) Thread�� ��ӹ��� Ŭ������ 1�� �����.
 *  2) run() �������̵� �ϱ�
 *    => �ؾ� �� ���� �ۼ��Ѵ�.
 *  3) �� �����带 ������ ������ ��ü ���� (new) �ϰ� start() ȣ�� 
 *   
 * 2. Runnable�� implement �ϱ�
 *  1) Runnable�� �����ϴ� Ŭ������ 1�� �����.
 *  2) run() �������̵� 
 *    => �ؾ� �� ���� �ۼ��Ѵ�. 
 *  3) �� �����带 ������ ������ ��ü ���� �Ѵ�. 
 *    Thread th = new Thread(���� ���� ��ü); 
 *    th.start();
 */
class Timer extends Thread {
	
	public void run() {
		try {
			for(int i = 10; i > 0; --i) {
				System.out.println(i + "��");
				Thread.sleep(1000);
			}
		} catch(Exception e) {}
	}
}
class Timer2 implements Runnable {
	public void run() {
		try {
			for(int i = 10; i > 0; --i) {
				System.out.println(i + "��");
				Thread.sleep(1000);
			}
		} catch(Exception e) {}
	}
}
public class Test05 {
	public static void main(String[] args) {
		// 10�� ī��Ʈ �ٿ� + jop �Է�/�Է°� �ٽ� ���
		Timer t = new Timer();
		t.start();
		
		Timer2 t2 = new Timer2();
		Thread th = new Thread(t2);
		th.start();
 		
		String input = JOptionPane.showInputDialog("�ƹ��ų�.."); 
		JOptionPane.showMessageDialog(null, input);
		
	}
}





