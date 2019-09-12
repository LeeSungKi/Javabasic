package quiz;
class Student {
	private String name;
	private int kr, en, ma;
	private double avg;
	private boolean pass;
	private char grade;
	
	// 1. ������ (������ ������� ���� �� �����) 
	Student(){
		
	}
	Student(String name){
		this(name, 0, 0, 0); 
	}
	Student(String name, int kr, int en, int ma){
		setName(name); 
		setKr(kr);
		setEn(en); 
		setMa(ma);
		
	}
	// 2. getters (���Ŀ� �°�)
	public String getName() { return name; }
	public int getKr() { return kr;}
	public int getEn() { return en;}
	public int getMa() { return ma;}
	public double getAvg() { return avg; }
	public boolean isPass() { return pass; }
	public char getGrade() { return grade; }
	
	
	// 3. setters (��Ḧ ������ �˿��� ���� �ùٸ� �����͸� ��)
	//  0) name : �̸�
	public void setName(String n) {
		name = n;
	}
	//  1) kr, en, ma : 0 �� �̻� 100�� ���ϸ� ���� ����, �� �� 0�� 
	public void setKr(int k) {
		kr = k >= 0 && k <= 100 ? k : 0;
		setAvg();
	}
	public void setEn(int e) {
		en = e >= 0 && e <= 100 ? e : 0;
		setAvg();
	}
	public void setMa(int m) {
		ma = m >= 0 && m <= 100 ? m : 0; 
		setAvg();
	}
	//  2) avg : (���ڰ� ���� �ʰ�, kr, en, ma�� ������ ���ǵ���)
	private void setAvg() {
		avg = (kr + en + ma) / 3.0;
		setPass();
		setGrade();
	}
	//  3) pass : 60�� �̻��̸� true
	private void setPass() {
		pass = avg >= 60;
	}
	//  4) grade : ABCDF �� 1����
	private void setGrade() {
		if(avg >= 90) { grade = 'A';}
		else if(avg >= 80) { grade = 'B';}
		else if(avg >= 70) { grade = 'C';}
		else if(avg >= 60) { grade = 'D';}
		else { grade = 'F'; }
	}
	
}
public class Quiz01 {
	public static void main(String[] args) {
		// Student �׽�Ʈ (�������)
		Student s = new Student("����ī��", 100, 80, -10);
		System.out.println("���� ���� ���� ��");
		System.out.println(s.getName());
		System.out.println("���� : " + s.getKr());
		System.out.println("���� : " + s.getEn());
		System.out.println("���� : " + s.getMa());
		System.out.println("��� : " + s.getAvg());
		System.out.println("�հ� : " + (s.isPass()?"�հ�": "���հ�"));
		System.out.println("���� : " + s.getGrade());
		
		s.setMa(100);
//		s.setAvg();
//		s.setPass();
//		s.setGrade();
		System.out.println("���� ���� ���� ��");
		System.out.println(s.getName());
		System.out.println("���� : " + s.getKr());
		System.out.println("���� : " + s.getEn());
		System.out.println("���� : " + s.getMa());
		System.out.println("��� : " + s.getAvg());
		System.out.println("�հ� : " + (s.isPass()?"�հ�": "���հ�"));
		System.out.println("���� : " + s.getGrade());
		
		s.setMa(50);
		
	}
}





