package quiz;

import javax.swing.JOptionPane;

public class Quiz04 {
	/*
	 * Math.random()�� ����Ͽ� ������ ��� �����ϰ� ����,
	 * ���� �Է� ���� �� ������ "����!", Ʋ���� "��!"�� ����ϼ���.
	 * (�����ϰ� 2�� ���� �̾ƾ� �մϴ�.) 
	 */
	public static void main(String[] args) {
		int rand1, rand2;
		int answer;
		
		rand1 = (int)(Math.random() * 8) + 2; // 2 ~ 9
		rand2 = (int)(Math.random() * 9) + 1; // 1 ~ 9
		
		String sAns = JOptionPane.showInputDialog(rand1 +"X"+ rand2);
		answer = Integer.parseInt(sAns);
		
		if(answer == rand1 * rand2) {
			JOptionPane.showMessageDialog(null, "����!");
		}
		else {
			JOptionPane.showMessageDialog(null, "��..");
		}
	}
}







