package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * < TCP 소켓 통신 프로그램 >
 * - 소켓(socket)이란?
 *   서버 - 클라이언트 간의 연결 정보를 담고 있음
 *   서버는 '서버소켓'을 열어두고 클라이언트 접속을 대기..
 *   클라이언트가 서버를 향한 '소켓'을 생성하면 서버와 바인딩(연결)됨  
 */
public class Test02 {
	public static void main(String[] args) {
		// 1. 서버소켓 생성 + 클라이언트 접속 대기 
		// 2. 바인딩 후 생성된 스트림을 얻어옴
		// 3. 클라이언트의 데이터 송신을 기다림
		// 4. 송신이 되면 수신된 데이터를 다시 클라이언트에게 보냄
		// 5. 클라이언트 접속이 끊길 때까지 반복
		ServerSocket sSoc = null; // 서버 소켓 
		Socket cSoc = null; // 연결된 클라이언트 측의 소켓
		
		BufferedWriter writer = null; // 클라이언트에게 데이터를 보낼 OutputStream
		BufferedReader reader = null; // 클라이언트로부터 데이터를 받을 InputStream
		// Buffered.. 클래스 : 스트림의 전송 속도를 향상시키는 '보조스트림'
		
		
		try {
			sSoc = new ServerSocket(3000); // 3000 : 포트 번호
			cSoc = sSoc.accept(); // 클라이언트 접속 대기 + 바인딩 완료 후에는 클라이언트 측의 소켓을 return
			System.out.println("클라이언트 접속 완료! 클라이언트 측 IP : " + cSoc.getInetAddress());
			
			// 스트림 연결 
			reader = new BufferedReader(new InputStreamReader(cSoc.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(cSoc.getOutputStream()));
					
			
			while(true) {
				String s = reader.readLine(); // 클라이언트로부터 데이터 받기
											  // 클라이언트의 연결이 끊기면 null이 리턴됨
				if(s == null) {
					break;
				}
				System.out.println("from client : " + s);
				
				Scanner sc = new Scanner(System.in); 
				String s2 = sc.next();
				writer.write(s2);			  // 클라이언트에게 데이터를 보냄
				writer.newLine();			  // 줄바꿈 기호 추가
				writer.flush();				  // 스트림의 데이터를 잔여데이터 없이 모두 전송함
				System.out.println("echo 완료!");
			}
			System.out.println("클라이언트의 접속 종료.. 서버를 종료합니다..");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( reader != null ) { reader.close(); }
				if( writer != null ) { writer.close(); }
				if( sSoc != null) { sSoc.close(); } 
			} catch(Exception e) { e.printStackTrace(); }
		}
		
	}
}






