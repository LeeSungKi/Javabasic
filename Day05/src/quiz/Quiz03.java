package quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		int nums[] = new int[6];
		
//		1. Scanner�� ����Ͽ� 6���� �����͸� �Է� �ް�, �̵��� nums �迭�� ����
		Scanner sc = new Scanner(System.in); 
		for(int i = 0; i < nums.length; ++i) {
			System.out.print(i + "�� ���� : ");
			nums[i] = sc.nextInt();
		}
		System.out.println("----- �迭 ------");
		for(int i = 0; i < nums.length; ++i) {
			System.out.println("nums[" + i + "] : " + nums[i]);
		}
		
//		2. �Է� ���� �� ��, 20 �̻� 100 ������ ���Ҹ� ���
		System.out.println("----- 20 �̻� 100 ���� -----");
		for(int i = 0; i < nums.length; ++i) {
			if( nums[i] >= 20 && nums[i] <= 100) {
				System.out.println(nums[i]);
			}
		}
		
//		3. �Է� ���� �� ��, �ִ񰪰� �ּڰ��� ���
		System.out.println("----- �ִ񰪰� �ּڰ� -----");
		int max = nums[0];
		int min = nums[0];
		for(int i = 1; i < nums.length; ++i) {
			if(max < nums[i]) {
				max = nums[i];
			}
			if(min > nums[i]) {
				min = nums[i];
			}
		}
		System.out.println("�ִ� : " + max);
		System.out.println("�ּڰ� : " + min);
		
//		4. ��������(����->ū)���� �����Ͽ� ��� ���Ҹ� ���
		int tmp; // �ٲ�ġ�� �� �� ����� �ӽ� �׸�
		for(int i = 0; i < nums.length; ++i) {
			for(int j = i+1; j < nums.length; ++j) {
				if(nums[j] < nums[i]  ) { // �� ���� ���� �߰����� ��
					tmp = nums[i]; 
					nums[i] = nums[j]; 
					nums[j] = tmp;
				}
			}
		}
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		System.out.println(nums[5]);
		
	}
}






