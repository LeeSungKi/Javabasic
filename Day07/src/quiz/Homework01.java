package quiz;

import javax.swing.JOptionPane;

public class Homework01 {
	public static void main(String[] args) {
		// Student 3��¥�� �迭 1�� �����
		Student[] st = new Student[3]; // [ null, null, null ]
		for(int i = 0; i < st.length; ++i) {
			st[i] = new Student(); // ���� �߿�!
			
			st[i].name = JOptionPane.showInputDialog( (i+1) + "�� �л��� �̸�" );
			st[i].kr = Integer.parseInt( 
							JOptionPane.showInputDialog(st[i].name + "�� ���� ����"));
			st[i].en = Integer.parseInt( 
							JOptionPane.showInputDialog(st[i].name + "�� ���� ����"));
			st[i].ma = Integer.parseInt( 
							JOptionPane.showInputDialog(st[i].name + "�� ���� ����"));
			
			st[i].avg = (st[i].kr + st[i].en + st[i].ma) / 3.0;
			
			if(st[i].avg >= 90) { st[i].grade = "A"; }
			else if(st[i].avg >= 80) { st[i].grade = "B"; }
			else if(st[i].avg >= 70) { st[i].grade = "C"; }
			else if(st[i].avg >= 60) { st[i].grade = "D"; }
			else { st[i].grade = "F"; }
			int select = JOptionPane.showConfirmDialog(null, "�����Է�\n(��:��/��:�ƴϿ�)");
			if(select == JOptionPane.YES_OPTION) { // '��' ����
				st[i].isMale = true;
			}
			else if(select == JOptionPane.NO_OPTION) { // '�ƴϿ�' ����
				st[i].isMale = false;
			}
		} // for
		
		// �л� ���� ��� + 1���л� ã��
		Student maxSt = st[0];
		int n = 1;
		String message = "< �л� ���� >\n";
		for(Student s : st) {
			message += n++ + "��. " + s.name + "("+ (s.isMale ? "��":"��")+")" +"\n"
					+ "���� : " + s.kr + "�� \n"
					+ "���� : " + s.en + "�� \n"
					+ "���� : " + s.ma + "�� \n"
					+ "��� : " + s.avg + "�� \n"
					+ "���� : " + s.grade + "\n";
			if(maxSt.avg < s.avg) { 
				maxSt = s;
			}
		} // for
		
		JOptionPane.showMessageDialog(null, message + "1�� �л� : " + maxSt.name);
		
	} // main()
} // class





