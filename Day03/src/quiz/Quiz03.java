package quiz;

import javax.swing.JOptionPane;

public class Quiz03 {
	/*
	 * 정수 1개를 입력 받고,
	 * 입력 받은 정수가 5의 배수인지 판별하세요.
	 */
	public static void main(String[] args) {
		int a =Integer.parseInt( JOptionPane.showInputDialog("정수 1개") ); 
		if( a % 5 == 0) {
			JOptionPane.showMessageDialog(null, "5의 배수");
		} else {
			JOptionPane.showMessageDialog(null, "5의 배수 아님");
		}
	}
}
