package basic;

import java.io.FileWriter;
import java.io.IOException;

/*
 * < IO >
 * : input stream , output stream
 * : 프로그램과 외부(운영체제, file, 네트워크 등) 사이의 데이터 전송 통로 
 * 
 * < stream >
 * - 단방향 구조 
 *   나가는 : 출력
 *   들어오는 : 입력
 * - 선입선출 구조 (QUEUE 구조)
 *   먼저 들어온 데이터가 먼저 빠져나간다.
 * - 종류 
 *   1) Byte 기반 스트림 : 
 *   		단위 : byte형 (1byte짜리 정수형)
 *   		용도 : 텍스트를 제외한 모든 데이터 (그림, 영상, exe 등을 전송할 때)
 *   		루트 : InputStream, OutputStream
 *   				(java.io 패키지에 들어있음)
 *   
 *   2) Char 기반 스트림 :  
 *   		단위 : char형 (2byte짜리 문자형)
 *   		용도 : 텍스트 전송용 (메모장, 채팅, 메일, 웹)
 *   		루트 : Reader, Writer
 *   				(java.io 패키지) 
 * - 구현순서 
 *  1. 스트림 생성 (목적지와 연결)
 *  2. 데이터 보내기 혹은 받기
 *  3. 스트림 닫기
 *  
 */
public class Test01 {
	public static void main(String[] args) {
		// 피카츄, 라이츄, 파이리 3단어를 aa.txt에 저장
		FileWriter fw = null; 
		try {
			// 1. 스트림 생성
			fw = new FileWriter("C:\\Users\\PC\\Desktop\\aa.txt", true);
			// (1) 출력스트림은 '없는 파일'을 목적지로 잡으면
			// 동명의 새 파일을 생성한다.
			// (2) 파일의 이름만 썼을 경우 (앞에 경로가 없을 때), 자바 프로젝트가 기본 경로다.
			//  ( 워크스페이스 --> Day18 폴더 )
			// (3) 파일의 경로 : \\ 혹은 / 로 구분한다. 
			// 2. 데이터 보내기
			fw.write("피카츄\r\n");
			fw.write("라이츄\r\n");
			fw.write("파이리\r\n");
			// (1) 기본적으로 '덮어쓰기' 모드임
			// (2) '추가모드'로 편집하려면 생성자에 true 추가
			System.out.println("저장 완료!");
		} catch(IOException e) {
			System.out.println("스트림에 문제 발생!");
		} finally {
			try {
				// 3. 스트림 닫기
				if(fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}



