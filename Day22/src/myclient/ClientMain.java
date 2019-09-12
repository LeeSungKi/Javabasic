package myclient;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {
	
	Socket soc;
	
	public ClientMain() {
		
		try {
			// ���ε� 
			soc = new Socket("127.0.0.1", 3000);
			
			System.out.println("���� ���� ����!!");
			
			ClientReceiveThread rt = new ClientReceiveThread(soc); 
			ClientSendThread st = new ClientSendThread(soc);
			
			rt.start();
			st.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new ClientMain();
	}
}