package basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

// aa.txt�� ��� ������ jop���� ���

public class Test01 {
	public static void main(String[] args) {
		try {
			/* ��� 1
			// 1. ��Ʈ�� ���� 
			FileReader fr = new FileReader("../Day18/aa.txt");
			
			// 2. ������ �������� 
			char[] arr = new char[100];
			fr.read(arr);
			String s = new String(arr);
			JOptionPane.showMessageDialog(null, s);
			
			// 3. ��Ʈ�� �ݱ�
			fr.close();
			*/
			FileReader fr = new FileReader("../Day18/aa.txt");
			Scanner sc = new Scanner(fr);
			String s = "";
			while(sc.hasNext()) {
				s += sc.nextLine() + "\n";
			}
			JOptionPane.showMessageDialog(null, s);
			
			sc.close();
			fr.close();
		} catch(FileNotFoundException e) {
			System.out.println("���� ���� Ȥ�� �߸��� ���丮 ���..");
		} catch(IOException e) {
			System.out.println("��Ʈ���� ���� �߻�!");
		}
	}
}
