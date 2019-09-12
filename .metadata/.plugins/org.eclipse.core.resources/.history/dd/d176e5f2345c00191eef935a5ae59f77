package day19.quiz.chatting.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerReceiveThread extends Thread {
	
	private ServerMain main;
	
	private Socket c_socket; // 상대 클라이언트의 소켓

	// 생성자
	public ServerReceiveThread(ServerMain main) {
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

			while (true) {
				receivedMessage = br.readLine();
				if (receivedMessage == null) {
					main.textArea.append("상대(클라이언트)가 접속을 종료하였습니다.\n");
					break;
				}
				main.textArea.append("상대(클라이언트) : " + receivedMessage + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("서버 종료.. ");
			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
