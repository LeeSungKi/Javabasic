package basic;

import javax.swing.JOptionPane;

public class Test02 {
	public static void main(String[] args) {
		// 'jop' + ctrl + sp + enter : JOptionPane
		
		// .showin ===> showInputDialog : �Է� â
		// .showm  ===> showMessageDialog : ��� â
		String s = JOptionPane.showInputDialog("���̸� �Է��ϼ���.");
		
		System.out.println("����� ���̴� " + s + "���Դϴ�.");
		
		int age = Integer.parseInt(s); 
		
		System.out.println( age >= 20 ? "�����Դϴ�." : "�̼����Դϴ�." );
		
		String message = "����� ���̴� " + age + "����, \n"
						+ ( age >= 20 ? "�����Դϴ�." : "�̼����Դϴ�.");
		
		JOptionPane.showMessageDialog(null, message);
		
	}
}






