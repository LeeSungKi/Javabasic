package basic;

import basic2.Pokemon; // import ����

// basic2�� ��� Ŭ���� import �ϱ�
//import basic2; // ����!
import basic2.*; 

public class Test05 {
	public static void main(String[] args) {
		// Pokemon p = new Pokemon(); // ����!
		
		// �ٸ� ��Ű���� Ŭ������ ����Ϸ���..
		// ���1. Ŭ������ Ǯ���� (��Ű����.Ŭ������)�� ���� ���
		basic2.Pokemon p1 = new basic2.Pokemon();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// ���2. import ���� ���
		// (�ҽ����� ��ܿ�) import ��Ű����.Ŭ������;
		Pokemon p2 = new Pokemon();
		
		// p2.name = "��ī��"; // ����!
	}
}
