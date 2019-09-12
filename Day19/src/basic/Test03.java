package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		String filePath = "\\\\192.168.2.101\\web_1400_lsr\\_01_java\\image.jpg";
		// image.jpg를 myImage.jpg로 복사
		
		FileInputStream fIn = null;
		FileOutputStream fOut = null;
		try {
			
			// 원본과 연결된 input 스트림
			fIn = new FileInputStream(filePath);
			
			// 복사본과 연결된 output 스트림 
			fOut = new FileOutputStream("myImage.jpg");
			
			while(true) {
				int data = fIn.read(); // inputStream의 1byte를 꺼내어 int형으로 반환
									   // 꺼낼 데이터가 더이상 남아있지 않으면(EOF) -1을 반환
				if(data == -1) { break; }
				fOut.write(data); // data를 fOut에 써라 
			}
			System.out.println("복사 완료!!");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fIn != null) { fIn.close(); }
				if(fOut != null) { fOut.close(); }
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
