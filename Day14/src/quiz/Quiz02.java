package quiz;

import java.util.TreeSet;

public class Quiz02 {
	public static void main(String[] args) {
		// �ζ� ������
		// 1 ~ 45 �� �ߺ����� 6���� ���ڸ� �̾ƺ���!
		// + �������� ����
		
		// Set ���, size() �޼��� ���
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		
		while(lotto.size() < 6) {
			int rand = (int)(Math.random()*45) + 1;
			System.out.println("���� �� : " + rand);
			lotto.add(rand);
		}
		System.out.println(lotto);
	}
}
