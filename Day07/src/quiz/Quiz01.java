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
			String name = JOptionPane.showInputDialog("이름");
			int kr = Integer.parseInt(JOptionPane.showInputDialog("국어"));
			int en = Integer.parseInt(JOptionPane.showInputDialog("영어"));
			int ma = Integer.parseInt(JOptionPane.showInputDialog("수학"));
			s.setData(name, kr, en, ma);		
		}
		String message = "< 학생 리스트 >\n";
		for(Student2 s : st) {
			//s.printData();
			message += s.getInfo();
		}
		JOptionPane.showMessageDialog(null, message);
		
	}
	
	
}
