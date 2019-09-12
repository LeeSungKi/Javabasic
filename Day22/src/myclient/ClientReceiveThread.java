package myclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceiveThread extends Thread{
	Socket soc;
	
	public ClientReceiveThread(Socket s) {
		soc = s;
	}
	
	@Override
	public void run() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			
			while(soc != null) {
				String s = br.readLine();
				if(s == null) { break; }
				System.out.println("from Server : " + s);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) { br.close(); }
			} catch(Exception e) { e.printStackTrace(); }
		}
	}
}
