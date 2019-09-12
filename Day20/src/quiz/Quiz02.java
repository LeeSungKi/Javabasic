package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Quiz02 {
	public static void main(String[] args) {
		// Quiz01���� ����� ������ ����� �� ����ϰ� 
		// ���� 1�� ���� �޾� (���� �Է�, X�� ����) �ش� �л����� ������ JOP���� ���
		File dir= new File(Quiz01.DIRECTORY);
		File[] files = dir.listFiles();
		StringBuffer menu = new StringBuffer();
		int index = 0;
		for(File f : files) {
			menu.append(index++ + "��. " + f.getName() + "\n");
		}
		menu.append("�����ϼ���.");
		index = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		
		ArrayList<Student> list = null;
		ObjectInputStream oIn = null;
		try {
			oIn = new ObjectInputStream(new FileInputStream(files[index]));
			list = (ArrayList<Student>)oIn.readObject();
			StringBuffer message = new StringBuffer("==================== �л� ���� ===================\n");
			for(Student s : list) {
				message.append("��ȣ : " + s.getNum() + "��\n");
				message.append("�̸� : " + s.getName() + "\n");
				message.append("���� : " + s.getAge() + " ��\n");
				message.append("���� : " + s.getMonth() + "�� " + s.getDate() + "��\n");
				message.append("���� : " + s.getKr() + "\n");
				message.append("���� : " + s.getEn() + "\n");
				message.append("���� : " + s.getMa() + "\n");
				message.append("��� : " + String.format("%.2f", s.getAvg()) + "��\n");
				message.append("��� : " + s.getGrade() + " ���\n");
				message.append("================================================\n");
			}
			JOptionPane.showMessageDialog(null, message);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oIn != null) { oIn.close(); }
			} catch(Exception e) { e.printStackTrace();}
		}
		
	}
}