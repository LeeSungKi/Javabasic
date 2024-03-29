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
			// 송신 스트림 생성
			bw = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
			System.out.println("종료는 exit를 입력하세요.");
			while(soc != null) {
				System.out.print("클라이언트 : ");
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







