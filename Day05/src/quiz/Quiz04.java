package quiz;

import java.util.Arrays;

/*
	로또 생성기 제작 
	1. 1 ~ 45 까지의 범위 내로 6개의 숫자를 뽑는다.
	2. 중복된 수가 나오면 안된다.
	(3. 오름차순으로 원소를 재배치 한다.)--> 선택사항
	4. 6개의 숫자를 모두 출력한다.
 */
public class Quiz04 {
	public static void main(String[] args) {
		int[] lotto = new int[6]; 
		for(int i = 0; i < lotto.length; ++i) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; ++j) {
				if(lotto[i] == lotto[j]) {
					--i;
					break; 
				}
			}
		}
		
		Arrays.sort(lotto);
		for(int n : lotto) {
			System.out.println(n);
		}
		
	}
}











