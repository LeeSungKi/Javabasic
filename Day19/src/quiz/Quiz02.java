package quiz;

import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Quiz02 {
	// Quiz01���� ������ log.txt�� ������ sysout���� ���
	
	// �� �Ͻ� �е��� Day18/Quiz01 �� ��ư1--> '��������' ��ư���� ����
	// ==> TextArea�� ������ 'YYYY/MM/dd_HH-mm-ss.txt'���·� ����
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\PC\\Desktop\\log.txt");
			Scanner sc = new Scanner(fr);
			StringBuffer log = new StringBuffer();
			while(sc.hasNext()) {
				log.append(sc.nextLine() + "\n");
			}
			JOptionPane.showMessageDialog(null, log);
			sc.close();
			fr.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
