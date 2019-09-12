package basic;

import javax.swing.JOptionPane;

public class Test03 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("나이를 입력하세요."); 
		int a = Integer.parseInt(age); // age를 int형으로 변경
		
		String message;
		if( a >= 20 ) {
			message = "성인입니다.";
		} 
		else { // 그렇지 않으면 ( 위에 짝꿍 if의 조건식이 false면 )
			message = "미성년입니다.";
		}
		JOptionPane.showMessageDialog(null, message);
		
		if(a <= 7) {
			message += "미취학아동입니다.";
		} 
		else if(a <= 13) {
			message += "초등학생입니다.";
		}
		else if(a <= 16) {
			message += "중학생입니다.";
		}
		else if(a <= 19) {
			message += "고등학생입니다.";
		}
		else {
			message += "성인(대학생)입니다.";
		}
		JOptionPane.showMessageDialog(null, message);
	}
}



