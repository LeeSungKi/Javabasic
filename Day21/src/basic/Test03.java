package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JOptionPane;


// Ŭ���̾�Ʈ �� ���α׷�
public class Test03 {
	public static void main(String[] args) {
		Socket soc = null;
		BufferedWriter writer = null; // �������� �����͸� ���� OutputStream
		BufferedReader reader = null; // �����κ��� �����͸� ���� InputStream
		try {
			soc = new Socket("192.168.2.101", 3000); // ������ IP, ��Ʈ��ȣ 
			// ���� ���� == ������ ���ε�
			// : ������ �����Ǹ� ����Ư�� accept() �޼��尡 ���� �Ϸ��
			
			// ��Ʈ�� ����
			reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
					
			while(true) {
				String s = JOptionPane.showInputDialog("�������� ���� �޽���(����� exit)");
				if(s.equals("exit")) {
					break;
				}
				writer.write(s);
				writer.newLine();
				writer.flush();
				
				String fromServer = reader.readLine();
				JOptionPane.showMessageDialog(null, "�������� ���� �޽��� : " + fromServer);
			}
			
		} catch(Exception e) { 
			e.printStackTrace();
		} finally {
			try { 
				if(reader != null) { reader.close(); }
				if(writer != null) { writer.close(); }
				if(soc != null) { soc.close(); }
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}