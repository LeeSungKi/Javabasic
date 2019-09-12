package quiz;

import javax.swing.JOptionPane;

public class Quiz04 {
	/*
	 * Math.random()을 사용하여 구구단 퀴즈를 랜덤하게 내고,
	 * 답을 입력 받은 후 맞으면 "정답!", 틀리면 "땡!"을 출력하세요.
	 * (랜덤하게 2개 수를 뽑아야 합니다.) 
	 */
	public static void main(String[] args) {
		int rand1, rand2;
		int answer;
		
		rand1 = (int)(Math.random() * 8) + 2; // 2 ~ 9
		rand2 = (int)(Math.random() * 9) + 1; // 1 ~ 9
		
		String sAns = JOptionPane.showInputDialog(rand1 +"X"+ rand2);
		answer = Integer.parseInt(sAns);
		
		if(answer == rand1 * rand2) {
			JOptionPane.showMessageDialog(null, "정답!");
		}
		else {
			JOptionPane.showMessageDialog(null, "땡..");
		}
	}
}







