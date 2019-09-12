package quiz;

import java.util.Scanner;

/*
< �߱� ���� ���� > 
��ǻ�ʹ� 123 ~ 987 ���� ���� 3�ڸ����� ������ �̴´�.
�� �ڸ����� ������ ���� �ߺ��Ǹ� �ȵȴ�. ( ��. 113, 888 ���� �ȵ� )

 1) ���� �� �ִ� ��� ������ ��� ( 123, 124, 125, ... , 985, 986, 987 )
 2) ����ڿ��� 3�ڸ����� ������ �Է� �ް� strike : x / ball : x �� ���
	���� �ڸ��� ���� �� : + 1 strike
 	�ٸ� �ڸ����� ���� ���� : + 1 ball
  	��) �� : 476
	  �Է� : 684 --> ��� : 0 strike 2 ball
	  �Է� : 423 --> ��� : 1 strike 0 ball
	  �Է� : 123 --> ��� : 0 strike 0 ball
	  �Է� : 472 --> ��� : 2 strike 0 ball
   ����ڰ� ������ ���� ������ �̸� �ݺ��ϰ� ���߱���� �� �õ�Ƚ���� ����Ѵ�.
 */
public class Homework01 {
	public static void main(String[] args) {
		// ���� ����
		int[] arr = new int[3];
		for(int i = 0; i < arr.length; ++i) {
			arr[i] = (int)(Math.random() * 8) + 1;
			for(int j = 0; j < i; ++j) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		//int correct = arr[0]* 100 + arr[1] * 10 + arr[2];
		//System.out.println("���� : " + correct);
		
		
		Scanner sc = new Scanner(System.in);
		int count = 0; // �õ� Ƚ��
		
		input : while(true) {
			// ����� �� �Է� �ޱ�
			++count;
			System.out.print("�� : ");
			int user = sc.nextInt();
			
			// �迭�� �����
			int[] userArr = new int[3];
			for(int i = userArr.length-1; i >= 0; --i) {
				userArr[i]=user%10;
				user/=10;
			}
			if(user > 0) {
				System.out.println("���ڸ����� �Է��ϼž� �մϴ�.");
				continue;
			}
			for(int i = 0; i < userArr.length; ++i) {
				for(int j = 0; j < i; ++j) {
					if(userArr[i] == userArr[j]) {
						System.out.println("�ߺ��Ǵ� ���ڴ� �Է��Ͻ� �� �����ϴ�.");
						--count;
						continue input;
					}
				}
			}
			
			
			// strike, ball �Ǻ� 
			int strike = 0;
			int ball = 0;
			for(int i = 0; i < arr.length; ++i) {
				if(arr[i] == userArr[i]) {
					strike++;
					continue;
				}
				for(int j = 0; j < arr.length; ++j) {
					if(arr[i] == userArr[j]) {
						ball++;
					}
				}
			}
			
			// ��� ���
			if(strike == 3) {
				System.out.println("����!(�õ� Ƚ�� : " + count + "ȸ)");
				return;
			} else {
				System.out.println(strike + " strike, " + ball + " ball");
			}
		}
	}
	
	
}
