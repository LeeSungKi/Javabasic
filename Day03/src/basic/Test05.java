package basic;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		
		switch(num) {
		case 1: // ':' ==> label (å������ ����)
			System.out.println("1��");
			break; // switch���� ������
		case 2:
			System.out.println("2��");
			break; // switch���� ������
		case 3: case 4:
			System.out.println("3 Ȥ�� 4");
			break; // switch���� ������
		default: 
			System.out.println("1 ~ 4 �ƴ�");
		}
	}
}


