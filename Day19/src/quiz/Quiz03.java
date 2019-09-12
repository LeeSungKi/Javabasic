package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 공유폴더의 Wildlife.wmv를 MyVideo.wmv에 복사하기 
 * + Timer Thread 로 1초.. 2초.. 3초.. 총 XX초 소요!를 sysout
 */
public class Quiz03 {
	
	int s;
	
	public Quiz03() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(s > -1) {
					System.out.println(s++ + "초");
					try { 
						Thread.sleep(1000);
					} catch(Exception e) {
						e.printStackTrace();
					}
					
				}
			}
		}).start();
		
		// 복사 시작 
		FileInputStream fIn = null;
		FileOutputStream fOut = null;
		
		try {
			fIn = new FileInputStream("\\\\192.168.2.101\\web_1400_lsr\\_01_java\\Wildlife.wmv");
			fOut = new FileOutputStream("MyVideo.wmv");
			
//			while(true) {
//				int data = fIn.read();
//				if(data == -1) {
//					
//					break;
//				}
//				fOut.write(data);
//			}
			// 빠른 복사 방법
			// 1. 파일의 크기만큼 byte형 배열을 만든다.
			File file = new File("\\\\192.168.2.101\\web_1400_lsr\\_01_java\\Wildlife.wmv");
			int size = (int)file.length();  // 바이트 수(파일 크기)를 얻어온다.
			byte[] arr = new byte[size]; // 파일의 크기만큼 배열 생성 
			
			// 2. 생성해둔 배열에 fIn에 들어있는 모든 byte를 복사한다.
			fIn.read(arr);
			
			
			// 3. 복사한 배열의 데이터를 fOut에 한꺼번에 보낸다.
			fOut.write(arr);
			
			System.out.println("복사 완료! 총 " + s + "초 소요!" );
			s = -2; // 타이머 종료 
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fIn!= null) { fIn.close(); }
				if(fOut != null) { fOut.close(); }
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new Quiz03();
	}
}
