package quiz;

import java.util.Scanner;

/*
 * double�� 4ĭ¥�� �迭�� �����ϰ� 
 * Scanner�� ����Ͽ� �� ���Ҹ� �Է� ����
 * �Է� �� ��� ���Ҹ� ���
 */
public class Quiz01 {
	public static void main(String[] args) {
		double[] arr = new double[4]; 
		Scanner sc = new Scanner(System.in); 
		
		for(int i = 0; i < arr.length; ++i ) {
			System.out.print( i + "�� �Ǽ� : ");
			arr[i] = sc.nextDouble();
		}
	
		for(int i = 0; i < arr.length; ++i ) {
			System.out.println(arr[i]);
		}
	
	}
}




