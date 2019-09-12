package myserver;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public ServerMain() {
		System.out.println("���� ����!!");
		
		ServerSocket sSoc = null;
		try {
			sSoc = new ServerSocket(3000);
			System.out.println("Ŭ���̾�Ʈ ��� ����..");
			Socket soc = sSoc.accept();
			System.out.println("Ŭ���̾�Ʈ ���� ����!!");
			ServerSendThread sst = new ServerSendThread(soc);
			ServerReceiveThread srt = new ServerReceiveThread(soc);
			
			// �������� �۽� ������ ����
			sst.start();
			
			// �������� ���� ������ ����
			srt.start();
		} catch(Exception e) {
			e.printStackTrace();
		} 
		System.out.println("���� ����!!");
	}
	
	
	public static void main(String[] args) {
		new ServerMain();
	}
}
