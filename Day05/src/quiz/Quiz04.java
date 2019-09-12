package quiz;

import java.util.Arrays;

/*
	�ζ� ������ ���� 
	1. 1 ~ 45 ������ ���� ���� 6���� ���ڸ� �̴´�.
	2. �ߺ��� ���� ������ �ȵȴ�.
	(3. ������������ ���Ҹ� ���ġ �Ѵ�.)--> ���û���
	4. 6���� ���ڸ� ��� ����Ѵ�.
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











