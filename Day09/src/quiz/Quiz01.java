package quiz;

import javax.swing.JOptionPane;

/*
 * �޴�) 
 * 	1. ������ �߰� ==> �̸��� ���� �Է� ����
 *  2. �ڽ� ���� ==> ��ü �����ڵ��� ������
 *  3. �� ���� ���� ==> ��ü �����ڵ��� �� ����
 *  4. ��ü ������ ���� ==> �����ڵ��� �̸�, ����, ������ ���
 *  5. ������ ���� ==> �������� �̸��� �Է� �ް� �ش� ������ ���� (��ü ���굵 ����)
 *  0. ����
 */
class Traveller {
	static String destination = "����";

	String name;
	int budget;
	
	public Traveller(String name, int budget) {
		this.name = name;
		this.budget = budget;
	}
	
	public static int getTotalBudget(Traveller[] tArr) {
		int b = 0;
		for(int i = 0; tArr[i] != null; ++i) {
			b += tArr[i].budget;
		}
		return b;
	}
	
	public String getInfo() {
		return "�̸� : " + name + "\n"	
				+"���� ���� : " + budget;
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		String menu = "1. ������ �߰�\n"
					+ "2. �ڽ� ����\n"
					+ "3. �� ���꺸��\n"
					+ "4. ��ü ������ ����\n"
					+ "5. ������ ���� \n"
					+ "0. ����";
		Traveller[] t = new Traveller[10];
		int lastIndex = 0;
		menu : while(true) {
			switch(JOptionPane.showInputDialog(menu)) {
			case "1":
				String name = JOptionPane.showInputDialog("�̸�"); 
				int budget = Integer.parseInt(JOptionPane.showInputDialog("����"));
				if(lastIndex >= t.length) {
					Traveller[] t2 = new Traveller[t.length+10];
					for(int i = 0; i < t.length; ++i) {
						t2[i] = t[i];
					}
					t = t2;
				}
				t[lastIndex++] = new Traveller(name, budget);
				break;
			case "2":
				String tmp = JOptionPane.showInputDialog(
						"���� �������� " + Traveller.destination + "�Դϴ�.\n���� �����Ͻðڽ��ϱ�?");
				if(tmp != null) {
					Traveller.destination = tmp;
					JOptionPane.showMessageDialog(null, Traveller.destination + "(��)�� ����Ǿ����ϴ�.");
				} else {
					JOptionPane.showMessageDialog(null, "��ҵǾ����ϴ�.");
				}
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "�� ������ "+ Traveller.getTotalBudget(t) + "�Դϴ�.");
				break;
			case "4":
				String info = "===== ������ ��� =====\n������ : " + Traveller.destination + "\n";
				for(Traveller traveller : t) {
					if(traveller == null) { 
						break;
					}
					info += traveller.getInfo() + "\n";
				}
				JOptionPane.showMessageDialog(null, info);
				break;
			case "5":
				String removeName = JOptionPane.showInputDialog("������ ���ఴ�� �̸��� �Է��ϼ���.");
				int removeIndex = -1;
				for(int i = 0; t[i] != null; ++i) {
					if(removeName != null && removeName.equals(t[i].name)) {
						removeIndex = i;
						break;
					}
				}
				
				String msg;
				if(removeIndex > -1) {
					for(int i = removeIndex; t[i]!=null; ++i) {
						t[i] = t[i+1];
					}
					msg = "������ �Ϸ��Ͽ����ϴ�.";
					--lastIndex;
				} else {
					msg = "�̵�� ������";
				}
				JOptionPane.showMessageDialog(null, msg);
			
				break;
			case "0":
				JOptionPane.showMessageDialog(null, "���α׷� ����");
				break menu; // return;
			default:
				JOptionPane.showMessageDialog(null, "�߸��� �Է�");
			}
		}
	}
}







