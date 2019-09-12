package quiz;

import javax.swing.JOptionPane;

public class Quiz03 {
	public static void main(String[] args) {
		String menu = "1. �����ϱ� \n"
					+ "2. ��Ϻ��� \n"
					+ "3. ����";
		String records = "< ���� ���� >"; 
		int maxScore = 0; // �ִ� ����
		int index = 0; // ���� ���� Ƚ��
		
		menu: while(true) {
			
			String select = JOptionPane.showInputDialog(menu);
			// 1 --> "1"
			switch(select) {
			case "1":  // �����ϱ� 
				int correct = (int)(Math.random() * 100) + 1;
				int count;
				
				System.out.println("correct : " + correct);
				
				++index; // ���� ���� Ƚ�� �߰� (index�� ° ����)
				
				for(count = 0; count < 15; ++count) { // ���� ����
					int userInput = Integer.parseInt(JOptionPane.showInputDialog("1 ~ 100�� �Է��ϼ���.(" + (count+1) + "ȸ�� �õ�)"));
					
					if(userInput < 1 || userInput > 100) {
						JOptionPane.showMessageDialog(null, "1�̻� 100������ ������ �Է��ϼ���.");
						--count; // �̹� �õ��� ��ȿó��
						continue;
					}
					if(correct == userInput) {
						JOptionPane.showMessageDialog(null, "����!");
						break; 
					}
					if(correct > userInput) {
						JOptionPane.showMessageDialog(null, "Up");
						continue;
					}
					JOptionPane.showMessageDialog(null, "Down");
				
				}
				
				// ���� ���� 
				int userScore = (15 - count) * 100;
				if(userScore > maxScore) { // �ִ� ������� Ȯ��
					maxScore = userScore; // ��� ����
				}
				
				if(userScore == 0) {
					JOptionPane.showMessageDialog(null, "GAME OVER");
				}
				// ��� ����
				records += "\n" + index + ". " + userScore + "��";
				break; // switch�� ����
			
			case "2":  // ��Ϻ���
				if(index == 0) {
					JOptionPane.showMessageDialog(null, "��� ����");
				}
				else {
					JOptionPane.showMessageDialog(null, records + "\n�ִ� ���� : " + maxScore + "��");
				}
				break; // switch�� ����
			
			case "3":  // ����
				JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�.");
				// return; // �̰͵� �ǰ�
				break menu;
			
			default: // �߸��� �Է�
				JOptionPane.showMessageDialog(null, "�߸� �Է��ϼ̽��ϴ�.");
			
			}
		}
	}
}
