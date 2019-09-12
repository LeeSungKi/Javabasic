package quiz;

public class Student2 {
	//�̸�, ��, ��, ��, ���, ���
	String name;
	int kr, en, ma;
	double avg;
	String grade;
	
	void setData(String n, int k, int e, int m){
		name = n;
		kr = k;
		en = e;
		ma = m;
		setMean();
		setGrade();
	}
	void setMean() {
		avg = (kr + en + ma) / 3.0;
	}
	
	void setGrade() {
		if(avg >= 90) { grade = "A"; }
		else if(avg >= 80) { grade = "B"; }
		else if(avg >= 70) { grade = "C"; }
		else if(avg >= 60) { grade = "D"; }
		else { grade = "F"; }
	}
	
	String getInfo() {
		return "�̸� : " + name + "\n"
				+ "���� : " + kr + "\n"
				+ "���� : " + en + "\n"
				+ "���� : " + ma + "\n"
				+ "��� : " + avg + "\n"
				+ "��� : " + grade + "\n";
	}
	
	void printData(){
		System.out.println(getInfo());
	}
	 /*  ���� Ŭ���� : Quiz03
	 *   4���� �л� ��ü�� �迭�� �����ϰ� 
	 *   �ݺ����� ����Ͽ� �л����� �̸�, ��, ��, ���� �Է� ����
	 *   �Է��� ������ ��� �л��� ������ ���
	 */
}
