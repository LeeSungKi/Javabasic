package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		String filePath = "\\\\192.168.2.101\\web_1400_lsr\\_01_java\\image.jpg";
		// image.jpg�� myImage.jpg�� ����
		
		FileInputStream fIn = null;
		FileOutputStream fOut = null;
		try {
			
			// ������ ����� input ��Ʈ��
			fIn = new FileInputStream(filePath);
			
			// ���纻�� ����� output ��Ʈ�� 
			fOut = new FileOutputStream("myImage.jpg");
			
			while(true) {
				int data = fIn.read(); // inputStream�� 1byte�� ������ int������ ��ȯ
									   // ���� �����Ͱ� ���̻� �������� ������(EOF) -1�� ��ȯ
				if(data == -1) { break; }
				fOut.write(data); // data�� fOut�� ��� 
			}
			System.out.println("���� �Ϸ�!!");
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
