package quiz;


import javax.swing.JOptionPane;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * 1. ��, ��, �� ������ �Է� �޾�
		 *    ����� �����Ͽ� A,B,C,D,F ������ �Ǻ��ϼ���.
		 * 
		 *    A ���� : ��� 90�� �̻�
		 *    B ���� : ��� 80�� �̻� ~ 90�� �̸�
		 *    C ���� : ��� 70�� �̻� ~ 80�� �̸�
		 *    D ���� : ��� 60�� �̻� ~ 70�� �̸�
		 *    F ���� : 60�� �̸�
		 *    
		 * 2. ������ ������ ����� 60.5 �̻��̸� "�հ�"��, �ƴϸ� "���հ�"�� ����ϼ���.
		 *    60, 61, 61 ���� ��� ��� 60.666���� "�հ�"�� ���;� �մϴ�.
		 */
  		String sKr = JOptionPane.showInputDialog("����");
  		String sEn = JOptionPane.showInputDialog("����");
  		String sMa = JOptionPane.showInputDialog("����");
  		
  		int kr = Integer.parseInt(sKr);
  		int en = Integer.parseInt(sEn);
  		int ma = Integer.parseInt(sMa);
  		
  		double avg = (kr + en + ma) / 3.0; // �Ҽ��� ������ 3.0
  		
  		String grade; 
  		if(avg >= 90) { grade = "A"; }
  		else if(avg >= 80) { grade = "B"; }
  		else if(avg >= 70) { grade = "C"; }
  		else if(avg >= 60) { grade = "D"; }
  		else { grade = "F"; }
  		
  		boolean pass = avg >= 60;
  		
  		String msg = "���� : " + grade + "\n"
  					+ "��� : " + (pass ? "�հ�" : "���հ�"); 
  		JOptionPane.showMessageDialog(null, msg);

	}
}







