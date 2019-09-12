package myserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceiveThread extends Thread{
	Socket clientSoc;
	public ServerReceiveThread(Socket soc) {
		clientSoc = soc;
	}
	
	public void run() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(clientSoc.getInputStream()));
			
			while(clientSoc != null) {
				String s = br.readLine();
				if(s == null) { break; }
				System.out.println("from client : " + s);
				
			}
			System.out.println("서버측 수신 종료");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) { br.close(); }
			} catch(Exception e) { e.printStackTrace(); }
		}
	}
}
