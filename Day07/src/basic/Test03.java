package basic;

import javax.swing.JOptionPane;

public class Test03 {
	public static void main(String[] args) {
		Person p1, p2, p3;
		p1 = new Person();
		p2 = new Person();
		p3 = new Person();
		
		p1.setInfo("ȫ�浿", 12);
		p2.setInfo("��浿", 25);
		p3.setInfo("����ī��", 30);
		
		p1.introduce();
		p2.introduce();
		p3.introduce();
		
		String message = p1.getInfo() + "\n"
						+ p2.getInfo() + "\n"
						+ p3.getInfo() + "\n";
		JOptionPane.showMessageDialog(null, message);
		
	}
}
