package basic;

import javax.swing.JOptionPane;

public class Test03 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("���̸� �Է��ϼ���."); 
		int a = Integer.parseInt(age); // age�� int������ ����
		
		String message;
		if( a >= 20 ) {
			message = "�����Դϴ�.";
		} 
		else { // �׷��� ������ ( ���� ¦�� if�� ���ǽ��� false�� )
			message = "�̼����Դϴ�.";
		}
		JOptionPane.showMessageDialog(null, message);
		
		if(a <= 7) {
			message += "�����оƵ��Դϴ�.";
		} 
		else if(a <= 13) {
			message += "�ʵ��л��Դϴ�.";
		}
		else if(a <= 16) {
			message += "���л��Դϴ�.";
		}
		else if(a <= 19) {
			message += "����л��Դϴ�.";
		}
		else {
			message += "����(���л�)�Դϴ�.";
		}
		JOptionPane.showMessageDialog(null, message);
	}
}



