package quiz;

import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Quiz02 {
	// Quiz01에서 저장한 log.txt의 내용을 sysout으로 출력
	
	// 다 하신 분들은 Day18/Quiz01 의 버튼1--> '파일저장' 버튼으로 구현
	// ==> TextArea의 내용을 'YYYY/MM/dd_HH-mm-ss.txt'형태로 저장
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\PC\\Desktop\\log.txt");
			Scanner sc = new Scanner(fr);
			StringBuffer log = new StringBuffer();
			while(sc.hasNext()) {
				log.append(sc.nextLine() + "\n");
			}
			JOptionPane.showMessageDialog(null, log);
			sc.close();
			fr.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
