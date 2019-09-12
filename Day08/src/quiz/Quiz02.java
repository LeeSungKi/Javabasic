package quiz;

import javax.swing.JOptionPane;

/*
 * Student Ŭ���� ����� 
 *  �ʵ� : �̸�, ��, ��, ��, ���, ���
 *  �޼ҵ� : 
 *   1. ������ 
 *   	1) �ƹ��͵� �ȳ־ ������ �� �ְ� 
 *   	2) �̸��� �ְ� ������ �� �ְ�
 *   	3) �̸�, ��, ��, ���� �ְ� ������ �� �ְ� => ���, ��� �ڵ� ���
 *   2. setAvg() - ��,��,���� ����� ����Ͽ� ��� �ʵ忡 ����
 *   3. setGrade() - ��� ������ A,B,C,D,F�� ����Ͽ� ��� �ʵ忡 ����
 *   4. printData() - �̸�, ���, ����� sysout
 *   5. getData() - �̸�, ��, ��, ��, ���, ����� String���� ��� return
 *  ** ����! ������ �ȿ����� �Ϲ� �޼ҵ� ȣ���� �� ����! 
 * 
 *  Quiz02 ���� Ŭ���� 
 *   �޴� : 
 *    1. 3�� �л� ���� �Է� 
 *    2. 3�� �л� ���� ����
 *    3. �����ϱ� 
 */
class Student {
	// �ʵ� : �̸�, ��, ��, ��, ���, ���
	String name;
	int kr, en, ma;
	double avg;
	String grade;
	
	// ������
	Student(){}
	Student(String name){
		this.name = name; // this(name, 0, 0, 0);
	}
	Student(String name, int kr, int en, int ma){
		this.name = name;
		this.kr = kr;
		this.en = en;
		this.ma = ma;
		setAvg();
		setGrade();
	}
	
	// setAvg()
	void setAvg() {
		this.avg = (this.kr + this.en + this.ma) / 3.0;
	}
	
	// setGrade()
	void setGrade() {
		switch( (int)avg / 10 ) {
		case 10: case 9:
			grade = "A"; 
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6: 
			grade = "D"; 
			break;
		default:
			grade = "F";
		}
	}
	
	// getData()
	String getData() {
		return "�̸� : " + name + "\n" + 
				"���� : " + kr + "\n" + 
				"���� : " + en + "\n" + 
				"���� : " + ma + "\n" + 
				"��� : " + avg + "\n" + 
				"���� : " + grade;
	}
	
	// printData()
	void printData() {
		System.out.println(this.getData());
	}
	
}
public class Quiz02 {
	public static void main(String[] args) {
		String sName;
		int tKr, tEn, tMa; 
		Student[] s = new Student[3]; // [null, null, null]
		
		for(int i = 0; i < s.length; ++i) {
			sName = JOptionPane.showInputDialog( (i+1) + "�� �л� �̸�");
			tKr = Integer.parseInt(JOptionPane.showInputDialog(sName + "�� ���� ����"));
			tEn = Integer.parseInt(JOptionPane.showInputDialog(sName + "�� ���� ����"));
			tMa = Integer.parseInt(JOptionPane.showInputDialog(sName + "�� ���� ����"));
			s[i] = new Student(sName, tKr, tEn, tMa);
		}
		
		String str = "--- �л� ����Ʈ ---\n"; 
		for(Student st : s) {
			str += st.getData() + "\n\n";
		}
		JOptionPane.showMessageDialog(null, str);
		
	}
}




