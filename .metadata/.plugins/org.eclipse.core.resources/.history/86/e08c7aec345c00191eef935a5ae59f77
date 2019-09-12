package day19.quiz.chatting.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.sound.sampled.ReverbType;

public class ClientReceiveThread extends Thread {
	private Socket c_socket; // 자신의 소켓
	private ClientMain main;
	// 생성자 
	public ClientReceiveThread(ClientMain main) {
		this.main = main;
		c_socket = main.cSoc; 
	}
	
	// run() 오버라이드
	@Override
	public void run() {
		BufferedReader br = null; // 클라이언트로부터 메시지를 받을 스트림
		
		try {
			br = new BufferedReader(new InputStreamReader(c_socket.getInputStream()));
			
			String receivedMessage;
			
			while(true) {
				receivedMessage = br.readLine();
				if(receivedMessage != null) {
					System.out.println("상대(서버) : " + receivedMessage);
					main.textArea.append("상대(서버) : " + receivedMessage + "\n");
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("클라이언트 종료.. ");
			try {
				if(br != null) { br.close(); }
			} catch(Exception e) { 
				e.printStackTrace();
			}
		}
	}
}
