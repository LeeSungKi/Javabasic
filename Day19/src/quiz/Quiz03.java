package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * ���������� Wildlife.wmv�� MyVideo.wmv�� �����ϱ� 
 * + Timer Thread �� 1��.. 2��.. 3��.. �� XX�� �ҿ�!�� sysout
 */
public class Quiz03 {
	
	int s;
	
	public Quiz03() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(s > -1) {
					System.out.println(s++ + "��");
					try { 
						Thread.sleep(1000);
					} catch(Exception e) {
						e.printStackTrace();
					}
					
				}
			}
		}).start();
		
		// ���� ���� 
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
			// ���� ���� ���
			// 1. ������ ũ�⸸ŭ byte�� �迭�� �����.
			File file = new File("\\\\192.168.2.101\\web_1400_lsr\\_01_java\\Wildlife.wmv");
			int size = (int)file.length();  // ����Ʈ ��(���� ũ��)�� ���´�.
			byte[] arr = new byte[size]; // ������ ũ�⸸ŭ �迭 ���� 
			
			// 2. �����ص� �迭�� fIn�� ����ִ� ��� byte�� �����Ѵ�.
			fIn.read(arr);
			
			
			// 3. ������ �迭�� �����͸� fOut�� �Ѳ����� ������.
			fOut.write(arr);
			
			System.out.println("���� �Ϸ�! �� " + s + "�� �ҿ�!" );
			s = -2; // Ÿ�̸� ���� 
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
