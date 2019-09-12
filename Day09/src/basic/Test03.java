package basic;

import javax.swing.JOptionPane;

class Team {
	String name;
	static boolean isWin = true; 
	
	// static 초기화 블럭 ( ==> {} )
	// ==> static 멤버를 초기화 해야 할 때 사용
	static {
		String s = JOptionPane.showInputDialog("isWin 초기값 지정하세요.");
		isWin = Boolean.parseBoolean(s);
		JOptionPane.showMessageDialog(null, "isWin 초기값 : " + isWin);
	}
}
public class Test03 {
	public static void main(String[] args) {
		
		Team t1 = new Team();
		t1.name = "피카츄"; 
		
		Team t2 = new Team();
		t2.name = "라이츄"; 
		
		Team t3 = new Team();
		t3.name = "푸린"; 
		
		System.out.println("===수정 전===");
		System.out.println(t1.isWin);
		System.out.println(t2.isWin);
		System.out.println(t3.isWin);
		
		Team.isWin = true;
		
		System.out.println("===수정 후===");
		System.out.println(t1.isWin);
		System.out.println(t2.isWin);
		System.out.println(t3.isWin);
	}
}




