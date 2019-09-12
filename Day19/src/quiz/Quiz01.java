package quiz;

import java.io.File;
import java.io.FileWriter;

import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

public class Quiz01 {
	public static void main(String[] args) {
		// 구구단 5문제 + 사용자 답 + 정답여부(true/false)의 결과를 
		// 바탕화면의 log.txt에 저장
		String s;
		StringBuffer log = new StringBuffer();
		int rand1, rand2;
		int user;
		boolean result;
		for(int i = 0; i < 5; ++i) {
			rand1 = (int)(Math.random() * 8) + 2;
			rand2 = (int)(Math.random() * 8) + 2;
			s = rand1 + "X" + rand2; 
			try {
				user = Integer.parseInt(JOptionPane.showInputDialog(s));
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "정수를 입력하세요.");
				--i;
				continue;
			}
			result = user == rand1 * rand2;
			if(result) {
				JOptionPane.showMessageDialog(null, "정답!");
			}
			else {
				JOptionPane.showMessageDialog(null, "땡..");
			}
			log.append(s + "입력 : " + user + " / " + result + "\r\n");
		}
		
		try {
			
			
			FileSystemView filesys = FileSystemView.getFileSystemView();
			File desktop = filesys.getHomeDirectory();
			System.out.println("바탕화면 경로 : " + desktop.getCanonicalPath());
			FileWriter fw = new FileWriter(desktop.getCanonicalPath() + "/log.txt");
			fw.write(log.toString());
			fw.close();
			JOptionPane.showMessageDialog(null, "저장 완료!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
