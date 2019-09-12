package day19.quiz.chatting.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientSendThread extends Thread{
	private Socket c_socket; // 클라이언트 자신의 소켓
	private ClientMain main;
	String message;
	// 생성자 
	public ClientSendThread(ClientMain main) {
		this.main = main;
		c_socket = main.cSoc;
	}
	
	// run() 오버라이드
	@Override
	public void run() {
		BufferedReader br = null; // 클라이언트 사람이 입력할 Scanner 대용
		BufferedWriter bw = null; // c_socket 측에 보낼 때 쓸 스트림
		try {
			bw = new BufferedWriter(new OutputStreamWriter(c_socket.getOutputStream()));
			
			while(true) {
				try { Thread.sleep(1); } catch(Exception e) {e.printStackTrace();}
				if(message != null) {
					bw.write(message); // 클라이언트 소켓에 보내기
					bw.newLine();
					bw.flush();
					message = null;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("클라이언트 종료.. ");
			try {
				if(bw != null) { bw.close(); }
				if(br != null) { br.close(); }
			} catch(Exception e) { 
				e.printStackTrace();
			}
		}
	}
}
