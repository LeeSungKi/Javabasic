package myserver;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public ServerMain() {
		System.out.println("서버 가동!!");
		
		ServerSocket sSoc = null;
		try {
			sSoc = new ServerSocket(3000);
			System.out.println("클라이언트 대기 시작..");
			Socket soc = sSoc.accept();
			System.out.println("클라이언트 연결 성공!!");
			ServerSendThread sst = new ServerSendThread(soc);
			ServerReceiveThread srt = new ServerReceiveThread(soc);
			
			// 서버측의 송신 스레드 시작
			sst.start();
			
			// 서버측의 수신 스레드 시작
			srt.start();
		} catch(Exception e) {
			e.printStackTrace();
		} 
		System.out.println("서버 종료!!");
	}
	
	
	public static void main(String[] args) {
		new ServerMain();
	}
}
