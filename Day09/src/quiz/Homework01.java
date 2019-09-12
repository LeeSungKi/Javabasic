package quiz;

import java.util.Scanner;

/*
< 야구 게임 제작 > 
컴퓨터는 123 ~ 987 범위 내로 3자릿수의 정수를 뽑는다.
각 자리수의 정수는 서로 중복되면 안된다. ( 예. 113, 888 등은 안됨 )

 1) 나올 수 있는 모든 정수를 출력 ( 123, 124, 125, ... , 985, 986, 987 )
 2) 사용자에게 3자릿수의 정수를 입력 받고 strike : x / ball : x 를 출력
	같은 자리에 같은 수 : + 1 strike
 	다른 자리지만 수가 존재 : + 1 ball
  	예) 답 : 476
	  입력 : 684 --> 출력 : 0 strike 2 ball
	  입력 : 423 --> 출력 : 1 strike 0 ball
	  입력 : 123 --> 출력 : 0 strike 0 ball
	  입력 : 472 --> 출력 : 2 strike 0 ball
   사용자가 정답을 맞출 때까지 이를 반복하고 맞추기까지 총 시도횟수를 출력한다.
 */
public class Homework01 {
	public static void main(String[] args) {
		// 정답 생성
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
		//System.out.println("정답 : " + correct);
		
		
		Scanner sc = new Scanner(System.in);
		int count = 0; // 시도 횟수
		
		input : while(true) {
			// 사용자 답 입력 받기
			++count;
			System.out.print("답 : ");
			int user = sc.nextInt();
			
			// 배열로 만들기
			int[] userArr = new int[3];
			for(int i = userArr.length-1; i >= 0; --i) {
				userArr[i]=user%10;
				user/=10;
			}
			if(user > 0) {
				System.out.println("세자릿수를 입력하셔야 합니다.");
				continue;
			}
			for(int i = 0; i < userArr.length; ++i) {
				for(int j = 0; j < i; ++j) {
					if(userArr[i] == userArr[j]) {
						System.out.println("중복되는 숫자는 입력하실 수 없습니다.");
						--count;
						continue input;
					}
				}
			}
			
			
			// strike, ball 판별 
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
			
			// 결과 출력
			if(strike == 3) {
				System.out.println("정답!(시도 횟수 : " + count + "회)");
				return;
			} else {
				System.out.println(strike + " strike, " + ball + " ball");
			}
		}
	}
	
	
}
