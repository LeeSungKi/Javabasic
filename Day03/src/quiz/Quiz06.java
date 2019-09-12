package quiz;

import javax.swing.JOptionPane;

public class Quiz06 {
	public static void main(String[] args) {
		/*
		 * �¾ ���� �Է� �ް�,
		 * �� ���� �ִ� �ϼ��� ����ϼ���.
		 * ���� ������ ����ϼ���.
		 * 
		 * < ��� �� >
		 * �¾ �� : 11
		 * 11���� 30�ϱ��� �ֽ��ϴ�!
		 * �ܿ￡ �¾�̳׿�!
		 * 
		 * �¾ �� : 5
		 * 5���� 31�ϱ��� �ֽ��ϴ�!
		 * ���� �¾�̳׿�!
		 */
		int month = Integer.parseInt(JOptionPane.showInputDialog("�¾ ��"));
		int maxDate = 0;
		String season = "";
		String message = "";
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			maxDate = 31; 
			break;
		case 2: 
			maxDate = 28;
			break;
		case 4: case 6: case 9: case 11:
			maxDate = 30;
			break;
		}
		
		switch(month) {
		case 3: case 4: case 5:
			season = "��"; 
			break;
		case 6: case 7: case 8:
			season = "����";
			break;
		case 9: case 10: case 11:
			season = "����";
			break;
		case 12: case 1: case 2:
			season = "�ܿ�";
		}
		
		if(maxDate == 0) {
			message = "�߸��� �Է��Դϴ�."; 
		}
		else {
			message = month + "���� " + maxDate + "�ϱ��� �ֽ��ϴ�. \n"
					+ season + "�� �¾�̱���!";
		}
		JOptionPane.showMessageDialog(null, message);
		
	}
}









