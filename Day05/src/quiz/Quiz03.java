package quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		int nums[] = new int[6];
		
//		1. Scanner를 사용하여 6개의 데이터를 입력 받고, 이들을 nums 배열에 저장
		Scanner sc = new Scanner(System.in); 
		for(int i = 0; i < nums.length; ++i) {
			System.out.print(i + "번 정수 : ");
			nums[i] = sc.nextInt();
		}
		System.out.println("----- 배열 ------");
		for(int i = 0; i < nums.length; ++i) {
			System.out.println("nums[" + i + "] : " + nums[i]);
		}
		
//		2. 입력 받은 값 중, 20 이상 100 이하인 원소만 출력
		System.out.println("----- 20 이상 100 이하 -----");
		for(int i = 0; i < nums.length; ++i) {
			if( nums[i] >= 20 && nums[i] <= 100) {
				System.out.println(nums[i]);
			}
		}
		
//		3. 입력 받은 값 중, 최댓값과 최솟값을 출력
		System.out.println("----- 최댓값과 최솟값 -----");
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
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		
//		4. 오름차순(작은->큰)으로 정렬하여 모든 원소를 출력
		int tmp; // 바꿔치기 할 때 사용할 임시 그릇
		for(int i = 0; i < nums.length; ++i) {
			for(int j = i+1; j < nums.length; ++j) {
				if(nums[j] < nums[i]  ) { // 더 작은 수를 발견했을 때
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






