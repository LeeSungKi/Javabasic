package basic;

import javax.swing.JOptionPane;

class Team {
	String name;
	static boolean isWin = true; 
	
	// static �ʱ�ȭ �� ( ==> {} )
	// ==> static ����� �ʱ�ȭ �ؾ� �� �� ���
	static {
		String s = JOptionPane.showInputDialog("isWin �ʱⰪ �����ϼ���.");
		isWin = Boolean.parseBoolean(s);
		JOptionPane.showMessageDialog(null, "isWin �ʱⰪ : " + isWin);
	}
}
public class Test03 {
	public static void main(String[] args) {
		
		Team t1 = new Team();
		t1.name = "��ī��"; 
		
		Team t2 = new Team();
		t2.name = "������"; 
		
		Team t3 = new Team();
		t3.name = "Ǫ��"; 
		
		System.out.println("===���� ��===");
		System.out.println(t1.isWin);
		System.out.println(t2.isWin);
		System.out.println(t3.isWin);
		
		Team.isWin = true;
		
		System.out.println("===���� ��===");
		System.out.println(t1.isWin);
		System.out.println(t2.isWin);
		System.out.println(t3.isWin);
	}
}




