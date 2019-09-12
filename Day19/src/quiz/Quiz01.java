package quiz;

import java.io.File;
import java.io.FileWriter;

import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

public class Quiz01 {
	public static void main(String[] args) {
		// ������ 5���� + ����� �� + ���俩��(true/false)�� ����� 
		// ����ȭ���� log.txt�� ����
		String s;
		StringBuffer log = new StringBuffer();
		int rand1, rand2;
		int user;
		boolean result;
		for(int i = 0; i < 5; ++i) {
			rand1 = (int)(Math.random() * 8) + 2;
			rand2 = (int)(Math.random() * 8) + 2;
			s = rand1 + "X" + rand2; 
			try {
				user = Integer.parseInt(JOptionPane.showInputDialog(s));
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "������ �Է��ϼ���.");
				--i;
				continue;
			}
			result = user == rand1 * rand2;
			if(result) {
				JOptionPane.showMessageDialog(null, "����!");
			}
			else {
				JOptionPane.showMessageDialog(null, "��..");
			}
			log.append(s + "�Է� : " + user + " / " + result + "\r\n");
		}
		
		try {
			
			
			FileSystemView filesys = FileSystemView.getFileSystemView();
			File desktop = filesys.getHomeDirectory();
			System.out.println("����ȭ�� ��� : " + desktop.getCanonicalPath());
			FileWriter fw = new FileWriter(desktop.getCanonicalPath() + "/log.txt");
			fw.write(log.toString());
			fw.close();
			JOptionPane.showMessageDialog(null, "���� �Ϸ�!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
