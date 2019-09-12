package quiz;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/*
 * < ���� ���� ���α׷� >
 * �޴�) 
 * 1. ���� ��� ( ������, ������, �α����� ��� )
 * 2. ��� ���� ���� 
 * 3. ���� �˻� ( �������� �Է� �ް� ������ ���� ���� ���, ������ "�̵�� ����" ) 
 * 4. ���� ���� ( �ε��� �Է� �ް�, �ش� ���� ���� )
 * 0. ���� �ϱ�  
 */
class Nation {
	String nation;
	String capital;
	int population;
	Nation(String n, String c, int p){
		nation = n;
		capital = c;
		population = p;
	}
	public String toString() {
		return nation + " / " + capital + " / �� " + population + "��";
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		String menu = "1. ���� ��� \n"
					+ "2. ��� ���� ���� \n"
					+ "3. ���� �˻� \n"
					+ "4. ���� ���� \n"
					+ "0. ����";
		String select;
		String message;
		String tNation;
		String tCapital;
		int tPopulation;
		int tIndex;
		ArrayList<Nation> list = new ArrayList<Nation>();
		
		while(true) {
			select = JOptionPane.showInputDialog(menu);
			switch (select) {
			case "0":
				JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�.");
				return;
			case "1":
				tNation = JOptionPane.showInputDialog("�� ������"); 
				tCapital = JOptionPane.showInputDialog(tNation + "�� ����");
				tPopulation = Integer.parseInt(JOptionPane.showInputDialog(tNation + "�� �α���"));
//				Nation tmp = new Nation(tNation, tCapital, tPopulation);
//				list.add(tmp);
				list.add(new Nation(tNation, tCapital, tPopulation));
				JOptionPane.showMessageDialog(null, "��� �Ϸ�!");
				break;
			case "2":
				if(list.isEmpty()) {
					JOptionPane.showMessageDialog(null, "��ϵ� ������ �����ϴ�.");
					continue;
				}
				message = "<���� ���>\n";
				for(Nation n : list) {
					message += n.toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				if(list.isEmpty()) {
					JOptionPane.showMessageDialog(null, "��ϵ� ������ �����ϴ�.");
					continue;
				}
				tNation = JOptionPane.showInputDialog("ã���� ������"); 
				message = "�̵�� ����";
				if(tNation == null || tNation.isEmpty()) {
					JOptionPane.showMessageDialog(null, "������ �Է��ϼž��մϴ�.");
					continue;
				}
				for(Nation n : list) {
					if(tNation.equals(n.nation)) {
						message = "ã�ҽ��ϴ�!\n" + n.toString();
					}
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "4":
				if(list.isEmpty()) {
					JOptionPane.showMessageDialog(null, "��ϵ� ������ �����ϴ�.");
					continue;
				}
				message = "< ���� ��� >\n";
				tIndex = 1;
				for(Nation n : list) {
					message += tIndex++ + ". " + n.nation + '\n';
				}
				message += "������ ������ ��ȣ�� �Է��ϼ���.";
				tIndex = Integer.parseInt(JOptionPane.showInputDialog(message));
				if(tIndex < 1 || tIndex > list.size()) {
					JOptionPane.showMessageDialog(null, "�߸��� �Է��Դϴ�.");
					continue;
				}
				Nation n = list.remove(tIndex-1);
				JOptionPane.showMessageDialog(null, n.nation + "(��)�� �����Ͽ����ϴ�.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "�ٽ� �Է��ϼ���.");
			}
		}
	}
}
