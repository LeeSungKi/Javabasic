package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * < TCP ���� ��� ���α׷� >
 * - ����(socket)�̶�?
 *   ���� - Ŭ���̾�Ʈ ���� ���� ������ ��� ����
 *   ������ '��������'�� ����ΰ� Ŭ���̾�Ʈ ������ ���..
 *   Ŭ���̾�Ʈ�� ������ ���� '����'�� �����ϸ� ������ ���ε�(����)��  
 */
public class Test02 {
	public static void main(String[] args) {
		// 1. �������� ���� + Ŭ���̾�Ʈ ���� ��� 
		// 2. ���ε� �� ������ ��Ʈ���� ����
		// 3. Ŭ���̾�Ʈ�� ������ �۽��� ��ٸ�
		// 4. �۽��� �Ǹ� ���ŵ� �����͸� �ٽ� Ŭ���̾�Ʈ���� ����
		// 5. Ŭ���̾�Ʈ ������ ���� ������ �ݺ�
		ServerSocket sSoc = null; // ���� ���� 
		Socket cSoc = null; // ����� Ŭ���̾�Ʈ ���� ����
		
		BufferedWriter writer = null; // Ŭ���̾�Ʈ���� �����͸� ���� OutputStream
		BufferedReader reader = null; // Ŭ���̾�Ʈ�κ��� �����͸� ���� InputStream
		// Buffered.. Ŭ���� : ��Ʈ���� ���� �ӵ��� ����Ű�� '������Ʈ��'
		
		
		try {
			sSoc = new ServerSocket(3000); // 3000 : ��Ʈ ��ȣ
			cSoc = sSoc.accept(); // Ŭ���̾�Ʈ ���� ��� + ���ε� �Ϸ� �Ŀ��� Ŭ���̾�Ʈ ���� ������ return
			System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�! Ŭ���̾�Ʈ �� IP : " + cSoc.getInetAddress());
			
			// ��Ʈ�� ���� 
			reader = new BufferedReader(new InputStreamReader(cSoc.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(cSoc.getOutputStream()));
					
			
			while(true) {
				String s = reader.readLine(); // Ŭ���̾�Ʈ�κ��� ������ �ޱ�
											  // Ŭ���̾�Ʈ�� ������ ����� null�� ���ϵ�
				if(s == null) {
					break;
				}
				System.out.println("from client : " + s);
				
				Scanner sc = new Scanner(System.in); 
				String s2 = sc.next();
				writer.write(s2);			  // Ŭ���̾�Ʈ���� �����͸� ����
				writer.newLine();			  // �ٹٲ� ��ȣ �߰�
				writer.flush();				  // ��Ʈ���� �����͸� �ܿ������� ���� ��� ������
				System.out.println("echo �Ϸ�!");
			}
			System.out.println("Ŭ���̾�Ʈ�� ���� ����.. ������ �����մϴ�..");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( reader != null ) { reader.close(); }
				if( writer != null ) { writer.close(); }
				if( sSoc != null) { sSoc.close(); } 
			} catch(Exception e) { e.printStackTrace(); }
		}
		
	}
}





