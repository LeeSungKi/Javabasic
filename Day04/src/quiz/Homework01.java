package quiz;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		// 1. 구구단 5단 
//		int n = 1;
//		while(n <= 9) {
//			System.out.println("5 X " + n + " = " + 5*n);
//			++n;
//		}
		
		// 2. 30 ~ 100 총합
//		int num = 30;
//		int sum = 0;
//		while(num <= 100) {
//			sum += num; // sum = sum + num
//			num++;
//		}
//		System.out.println(sum);
		
		// 3. 구구단
//		Scanner sc = new Scanner(System.in);
//		int count = 0; // 정답 개수 세는 용
//		int r1; 
//		int r2;
//		while(count < 5) { // 정답 수가 5개 미만일 동안 (정답 수가 5개가 아닐 동안)
//			r1 = (int)(Math.random()*8)+2; // 2 ~ 9 
//			r2 = (int)(Math.random()*9)+1; // 1 ~ 9
//			System.out.print(r1 + " X " + r2 + " = ");
//			// println() : 출력 후 줄바꿈(엔터)
//			// print()   : 출력 후 줄바꿈 안함
//			int answer = sc.nextInt();
//			if(answer == r1 * r2) {
//				System.out.println("정답!");
//				++count;
//			}
//			else {
//				System.out.println("땡..");
//			}
//		}
		
		// 참고) 변수의 스코프
//		int a = 10; // a : 메인이 끝나면 사라짐
//		int flag=0;
//		while(flag<10) {
//			System.out.println("a : " + a);
//			++a;
//			++flag;
//		}
//		
//		int flag2 = 0;
//		while(flag2 < 10) { 
//			int b = 10; // b : 반복 1회 수행 후 사라짐 ('생성->소멸'을 반복)
//			System.out.println("b : " + b);
//			++b;
//			++flag2;
//		}
		
//		문제 4. 피보나치 수열
//		int a = 0;
//		int b = 1;
//		int c;
//		System.out.println(a);
//		System.out.println(b);
//		while(a + b <= 500) {
//			c = a + b;
//			System.out.println(c);
//			a = b;
//			b = c;
//		}
	}
}










