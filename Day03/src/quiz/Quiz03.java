package quiz;

import javax.swing.JOptionPane;

public class Quiz03 {
	/*
	 * ���� 1���� �Է� �ް�,
	 * �Է� ���� ������ 5�� ������� �Ǻ��ϼ���.
	 */
	public static void main(String[] args) {
		int a =Integer.parseInt( JOptionPane.showInputDialog("���� 1��") ); 
		if( a % 5 == 0) {
			JOptionPane.showMessageDialog(null, "5�� ���");
		} else {
			JOptionPane.showMessageDialog(null, "5�� ��� �ƴ�");
		}
	}
}
