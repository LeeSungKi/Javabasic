package quiz;

import javax.swing.JOptionPane;

public class Quiz06 {
	public static void main(String[] args) {
		/*
		 * 태어난 달을 입력 받고,
		 * 그 달의 최대 일수를 출력하세요.
		 * 또한 계절도 출력하세요.
		 * 
		 * < 출력 예 >
		 * 태어난 달 : 11
		 * 11월은 30일까지 있습니다!
		 * 겨울에 태어나셨네요!
		 * 
		 * 태어난 달 : 5
		 * 5월은 31일까지 있습니다!
		 * 봄에 태어나셨네요!
		 */
		int month = Integer.parseInt(JOptionPane.showInputDialog("태어난 달"));
		int maxDate = 0;
		String season = "";
		String message = "";
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			maxDate = 31; 
			break;
		case 2: 
			maxDate = 28;
			break;
		case 4: case 6: case 9: case 11:
			maxDate = 30;
			break;
		}
		
		switch(month) {
		case 3: case 4: case 5:
			season = "봄"; 
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
		}
		
		if(maxDate == 0) {
			message = "잘못된 입력입니다."; 
		}
		else {
			message = month + "월은 " + maxDate + "일까지 있습니다. \n"
					+ season + "에 태어나셨군요!";
		}
		JOptionPane.showMessageDialog(null, message);
		
	}
}









