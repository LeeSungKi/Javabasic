package quiz;

import javax.swing.JOptionPane;

public class Quiz01 {
	public static void main(String[] args) {
		Student2[] st = { new Student2(),
						  new Student2(), 
						  new Student2(), 
						  new Student2()
						};
		for(Student2 s : st) {
			String name = JOptionPane.showInputDialog("�̸�");
			int kr = Integer.parseInt(JOptionPane.showInputDialog("����"));
			int en = Integer.parseInt(JOptionPane.showInputDialog("����"));
			int ma = Integer.parseInt(JOptionPane.showInputDialog("����"));
			s.setData(name, kr, en, ma);		
		}
		String message = "< �л� ����Ʈ >\n";
		for(Student2 s : st) {
			//s.printData();
			message += s.getInfo();
		}
		JOptionPane.showMessageDialog(null, message);
		
	}
	
	
}
