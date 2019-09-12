package basic;

import javax.swing.JOptionPane;

public class Test02 {
	public static void main(String[] args) {
		// 'jop' + ctrl + sp + enter : JOptionPane
		
		// .showin ===> showInputDialog : 입력 창
		// .showm  ===> showMessageDialog : 출력 창
		String s = JOptionPane.showInputDialog("나이를 입력하세요.");
		
		System.out.println("당신의 나이는 " + s + "세입니다.");
		
		int age = Integer.parseInt(s); 
		
		System.out.println( age >= 20 ? "성인입니다." : "미성년입니다." );
		
		String message = "당신의 나이는 " + age + "세로, \n"
						+ ( age >= 20 ? "성인입니다." : "미성년입니다.");
		
		JOptionPane.showMessageDialog(null, message);
		
	}
}






