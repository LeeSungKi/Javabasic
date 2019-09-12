package myserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ServerSendThread extends Thread{
	
	Socket clientSoc;
	
	public ServerSendThread(Socket soc) {
		clientSoc = soc; // ServerMain���� ����� Ŭ���̾�Ʈ ���� �ޱ�
	}
	
	@Override
	public void run() {
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
	
		try {
			// �۽� ��Ʈ�� ����
			bw = new BufferedWriter(new OutputStreamWriter(clientSoc.getOutputStream()));
			while(clientSoc != null) {
				System.out.print("���� : ");
				String toClient = sc.nextLine();
				
				bw.write(toClient);
				bw.newLine();
				bw.flush();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) { bw.close(); }
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}