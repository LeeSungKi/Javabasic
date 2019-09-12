package basic;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		
		switch(num) {
		case 1: // ':' ==> label (책갈피의 역할)
			System.out.println("1임");
			break; // switch문을 끝내라
		case 2:
			System.out.println("2다");
			break; // switch문을 끝내라
		case 3: case 4:
			System.out.println("3 혹은 4");
			break; // switch문을 끝내라
		default: 
			System.out.println("1 ~ 4 아님");
		}
	}
}


