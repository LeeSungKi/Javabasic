package basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

// aa.txt의 모든 문장을 jop으로 출력

public class Test01 {
	public static void main(String[] args) {
		try {
			/* 방법 1
			// 1. 스트림 열기 
			FileReader fr = new FileReader("../Day18/aa.txt");
			
			// 2. 데이터 가져오기 
			char[] arr = new char[100];
			fr.read(arr);
			String s = new String(arr);
			JOptionPane.showMessageDialog(null, s);
			
			// 3. 스트림 닫기
			fr.close();
			*/
			FileReader fr = new FileReader("../Day18/aa.txt");
			Scanner sc = new Scanner(fr);
			String s = "";
			while(sc.hasNext()) {
				s += sc.nextLine() + "\n";
			}
			JOptionPane.showMessageDialog(null, s);
			
			sc.close();
			fr.close();
		} catch(FileNotFoundException e) {
			System.out.println("없는 파일 혹은 잘못된 디렉토리 경로..");
		} catch(IOException e) {
			System.out.println("스트림에 문제 발생!");
		}
	}
}
