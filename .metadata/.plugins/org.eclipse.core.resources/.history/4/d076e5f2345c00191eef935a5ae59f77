package day19.quiz.chatting.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerSendThread extends Thread {
	private Socket c_socket; // 상대 클라이언트의 소켓
	private ServerMain main;
	BufferedWriter bw;
	String message;

	// 생성자
	public ServerSendThread(ServerMain main) {
		this.main = main;
		c_socket = main.cSoc;
	}

	// run() 오버라이드
	@Override
	public void run() {
		try {
			bw = new BufferedWriter(new OutputStreamWriter(c_socket.getOutputStream()));
			while (true) {
				try { Thread.sleep(1); } catch(Exception e) {e.printStackTrace();}
				if(message != null) {
					System.out.println("클라이언트에게 메시지 보내기");
					bw.write(message); // 클라이언트 소켓에 보내기
					bw.newLine();
					bw.flush();
					message = null;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("서버 종료.. ");
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
