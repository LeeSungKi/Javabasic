package basic;

import javax.swing.JOptionPane;

public class Test06 {
	public static void main(String[] args) {
		System.out.println("���ν����� ����!");
		
		Thread t = new Thread(new Timer2());
		t.setDaemon(true); // t �����带 ���ν������� ����(daemon)������� ����
						   // ���ν����尡 ���� �Ǹ� �ڵ����� ���� ���� ��.
						   // start() �ϱ� ���� �����ؾ� ��!
		t.start(); // Ÿ�̸� ����
		
		JOptionPane.showMessageDialog(null, "Ȯ�� ������ ���α׷� ����");
		
		System.out.println("���ν����� ��!");
	}
}
