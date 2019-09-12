package quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// Student �ν��Ͻ� 3�� ����
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		Scanner sc = new Scanner(System.in);
		
		// Scanner/ JOptionPane���� 3���� �̸�, ����, ��, ��, �� �Է�
		// ���, ����(ABCDF)�� �Է� ���� (�ڵ� ���)
		
		System.out.print("1�� �л� �̸� : ");
		s1.name=sc.next(); 
		System.out.print("���� : ");
		s1.kr = sc.nextInt();
		System.out.print("���� : ");
		s1.en = sc.nextInt();
		System.out.print("���� : ");
		s1.ma = sc.nextInt();
		System.out.print("����(��:0, ��:1) : ");
		s1.isMale = sc.nextInt() == 0; 
		
		s1.avg = (s1.kr + s1.en + s1.ma) / 3.0;
		if(s1.avg >= 90) { s1.grade = "A"; }
		else if(s1.avg >= 80) { s1.grade = "B"; }
		else if(s1.avg >= 70) { s1.grade = "C"; }
		else if(s1.avg >= 60) { s1.grade = "D"; }
		else { s1.grade = "F"; }
		
		System.out.print("2�� �л� �̸� : ");
		s2.name=sc.next(); 
		System.out.print("���� : ");
		s2.kr = sc.nextInt();
		System.out.print("���� : ");
		s2.en = sc.nextInt();
		System.out.print("���� : ");
		s2.ma = sc.nextInt();
		System.out.print("����(��:0, ��:1) : ");
		s2.isMale = sc.nextInt() == 0; 
		
		s2.avg = (s2.kr + s2.en + s2.ma) / 3.0;
		if(s2.avg >= 90) { s2.grade = "A"; }
		else if(s2.avg >= 80) { s2.grade = "B"; }
		else if(s2.avg >= 70) { s2.grade = "C"; }
		else if(s2.avg >= 60) { s2.grade = "D"; }
		else { s2.grade = "F"; }
		
		System.out.print("3�� �л� �̸� : ");
		s3.name=sc.next(); 
		System.out.print("���� : ");
		s3.kr = sc.nextInt();
		System.out.print("���� : ");
		s3.en = sc.nextInt();
		System.out.print("���� : ");
		s3.ma = sc.nextInt();
		System.out.print("����(��:0, ��:1) : ");
		s3.isMale = sc.nextInt() == 0; 
		
		s3.avg = (s3.kr + s3.en + s3.ma) / 3.0;
		if(s3.avg >= 90) { s3.grade = "A"; }
		else if(s3.avg >= 80) { s3.grade = "B"; }
		else if(s3.avg >= 70) { s3.grade = "C"; }
		else if(s3.avg >= 60) { s3.grade = "D"; }
		else { s3.grade = "F"; }
		
		// 3���� ��� ���� ��� 
		// (+ 1�� �л� �̸� ���)
		System.out.println(s1.name + ", " + (s1.isMale?"��, ":"��, ") + s1.avg + "��, " + s1.grade);
		System.out.println(s2.name + ", " + (s2.isMale?"��, ":"��, ") + s2.avg + "��, " + s2.grade);
		System.out.println(s3.name + ", " + (s3.isMale?"��, ":"��, ") + s3.avg + "��, " + s3.grade);
		
		Student s = s1;
		if(s.avg < s2.avg) { s = s2; }
		if(s.avg < s3.avg) { s = s3; }
		System.out.println("1�� �л� : " + s.name);
		
	}
}



