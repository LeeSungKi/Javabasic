package quiz;


import javax.swing.JOptionPane;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * 1. 국, 영, 수 점수를 입력 받아
		 *    평균을 산출하여 A,B,C,D,F 학점을 판별하세요.
		 * 
		 *    A 학점 : 평균 90점 이상
		 *    B 학점 : 평균 80점 이상 ~ 90점 미만
		 *    C 학점 : 평균 70점 이상 ~ 80점 미만
		 *    D 학점 : 평균 60점 이상 ~ 70점 미만
		 *    F 학점 : 60점 미만
		 *    
		 * 2. 위에서 산출한 평균이 60.5 이상이면 "합격"을, 아니면 "불합격"을 출력하세요.
		 *    60, 61, 61 점일 경우 평균 60.666으로 "합격"이 나와야 합니다.
		 */
  		String sKr = JOptionPane.showInputDialog("국어");
  		String sEn = JOptionPane.showInputDialog("영어");
  		String sMa = JOptionPane.showInputDialog("수학");
  		
  		int kr = Integer.parseInt(sKr);
  		int en = Integer.parseInt(sEn);
  		int ma = Integer.parseInt(sMa);
  		
  		double avg = (kr + en + ma) / 3.0; // 소숫점 나오게 3.0
  		
  		String grade; 
  		if(avg >= 90) { grade = "A"; }
  		else if(avg >= 80) { grade = "B"; }
  		else if(avg >= 70) { grade = "C"; }
  		else if(avg >= 60) { grade = "D"; }
  		else { grade = "F"; }
  		
  		boolean pass = avg >= 60;
  		
  		String msg = "학점 : " + grade + "\n"
  					+ "결과 : " + (pass ? "합격" : "불합격"); 
  		JOptionPane.showMessageDialog(null, msg);

	}
}







