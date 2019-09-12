package quiz;

import java.util.TreeSet;

public class Quiz02 {
	public static void main(String[] args) {
		// 로또 생성기
		// 1 ~ 45 중 중복없이 6개의 숫자를 뽑아보자!
		// + 오름차순 정렬
		
		// Set 사용, size() 메서드 사용
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		
		while(lotto.size() < 6) {
			int rand = (int)(Math.random()*45) + 1;
			System.out.println("뽑힌 수 : " + rand);
			lotto.add(rand);
		}
		System.out.println(lotto);
	}
}
