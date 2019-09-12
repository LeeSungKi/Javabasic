package myclient;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClientSendThread extends Thread {
	
	Socket soc;
	public ClientSendThread(Socket s) {
		soc = s;
	}
	
	
	@Override
	public void run() {
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		try {
			// �۽� ��Ʈ�� ����
			bw = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
			System.out.println("����� exit�� �Է��ϼ���.");
			while(soc != null) {
				System.out.print("Ŭ���̾�Ʈ : ");
				String toServer = sc.nextLine();
				if(toServer.equals("exit")) {
					break;
				}
				bw.write("from Client : " + toServer);
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






