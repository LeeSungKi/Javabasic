package basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * < 네트워크 프로그래밍 >
 * - java.net 패키지
 * - TCP 통신 : 신뢰성 프로토콜 
 * 		--> 호스트 간의 패킷수신을 확인한 뒤 다음 패킷을 전송하는 형태
 * 		--> 안정적인 송수신
 * 		--> 예) 웹
 *   UDP 통신 : 비신뢰성 프로토콜
 *   	--> 수신 여부 확인 작업 없이 무작정 패킷을 계속 전송하는 형태 
 *   	--> 불안정하지만 빠른 송수신
 *   	--> 예) 통화
 *   IP 통신 ( Internet Protocol ) 
 *   	--> v4 , v6
 *  	--> v4의 사설 IP, 공인 IP 
 *  		공인 IP : 대외용 IP	
 *  				 하나의 소규모 네트워크(학교, 학원, 가정)가 외부 네트워크로 나갈때는
 *  				 하나의 공인 IP를 사용
 *  
 *  		사설 IP : 내부 구분용 IP 
 *  				 소규모 네트워크에서 호스트간을 구별하기 위한 IP
 */
public class Test01 {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			
			System.out.println("내 컴퓨터 IP : " + addr.getHostAddress());
			System.out.println("내 컴퓨터 이름 : " + addr.getHostName());
			
			InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
			for(InetAddress a : naver) {
				System.out.println("네이버 IP : " + a.getHostAddress());
			}
		} catch(UnknownHostException e) {
			System.out.println("호스트 알 수 없음!");
		}
	}
}






