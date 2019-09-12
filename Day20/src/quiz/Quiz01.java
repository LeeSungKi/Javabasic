package quiz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Quiz01 {
	/*
	 * �޴� )
	 *   1. �л����
	 *   2. �����ϱ�
	 *   �л���� : �л��� �̸�, �������, ����(������)�� �Է� �޴´�.
	 *   		  ��������� 6�ڸ��� �Է� �ް� year, month,date�� ���� ����
	 *           ����, ���, ����, ��ȣ �ڵ� ���Ǿ� ����
	 *           * ��ȣ : 1������ ���������� �Ű���
	 *   �����ϱ� : YYYY_MM_DD_HH_mm_students.dat �� ��� �л����� ������ �� ����
	 */
	
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("YYYY_MM_dd_HH_mm");
	private static final String FILE_SUFFIX = "_student.dat";
	public static final String DIRECTORY = "student_data";
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		String menu = "1. �л� ���\n2. �����ϱ�"; 
		menu: while(true) {
			switch (JOptionPane.showInputDialog(null, menu)) {
			case "1":
				String name = JOptionPane.showInputDialog("�� �л� �̸�").trim();
				String birth = JOptionPane.showInputDialog("�������(YYMMDD)").trim();
				int kr = Integer.parseInt(JOptionPane.showInputDialog("��������").trim());
				int en = Integer.parseInt(JOptionPane.showInputDialog("��������").trim());
				int ma = Integer.parseInt(JOptionPane.showInputDialog("��������").trim());
				list.add(new Student(name, birth, kr, en, ma));
				JOptionPane.showMessageDialog(null, "��� �Ϸ�!");
				break;
			case "2":
				break menu;
			default:
				JOptionPane.showMessageDialog(null, "�߸��� �Է�");
				break;
			}
		}
		
		// ���� ����
		String fileName = DATE_FORMAT.format(System.currentTimeMillis()) + FILE_SUFFIX;
		ObjectOutputStream oOut = null;
		try {
			
			File directory = new File(DIRECTORY);
			if(!directory.exists()) {
				directory.mkdir();
			}
			
			oOut = new ObjectOutputStream(new FileOutputStream(DIRECTORY + "/" + fileName));
			oOut.writeObject(list);
			JOptionPane.showMessageDialog(null, "���� ���� �Ϸ�! \n���ϸ� : " + fileName);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oOut != null) { oOut.close();}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}





