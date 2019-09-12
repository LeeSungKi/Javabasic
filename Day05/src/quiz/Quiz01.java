package quiz;

import java.util.Scanner;

/*
 * double형 4칸짜리 배열을 생성하고 
 * Scanner를 사용하여 각 원소를 입력 받음
 * 입력 후 모든 원소를 출력
 */
public class Quiz01 {
	public static void main(String[] args) {
		double[] arr = new double[4]; 
		Scanner sc = new Scanner(System.in); 
		
		for(int i = 0; i < arr.length; ++i ) {
			System.out.print( i + "번 실수 : ");
			arr[i] = sc.nextDouble();
		}
	
		for(int i = 0; i < arr.length; ++i ) {
			System.out.println(arr[i]);
		}
	
	}
}




