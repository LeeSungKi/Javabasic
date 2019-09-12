package basic;

import java.io.File;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) {
		// java.io.File 
		// => 파일이나 폴더(디렉토리) 관련 클래스 
		//    파일/디렉토리 새로 생성, 삭제, 정보 얻어오기 등의 기능 수행
		
		File f1 = new File("/"); // 현재 파일 시스템의 root('/') 디렉토리를 얻어옴
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		System.out.println(f1.getPath());
		System.out.println(f1.getAbsolutePath());
		
		File f2 = new File("/myDirectory");
		if(!f2.exists()) { // 없는 디렉토리라면
			System.out.println("디렉토리 없음! 새로 생성합니다..");
			f2.mkdir();
		}
		else {
			System.out.println("디렉토리 있음! 디렉토리를 삭제합니다..");
			f2.delete();
			// delete()하는 대상은 내용이 없어야 한다.
			// file 이라면 : 데이터 없어야 함
			// directory 라면 : 내부 파일/디렉토리가 없어야 함  
		}
		
		// 루트 디렉토리의 모든 파일/디렉토리 이름 가져오기 
		File[] files = f1.listFiles();
		for(File f : files) {
			System.out.println((f.isFile() ? "파일" : "디렉토리") + " : " + f.getName());
			System.out.println(f.length() + "byte");
		}
		
		
		// 상대경로 : 현재 위치에서 시작하는 경로 
		// 절대경로 : 루트에서 시작하는 경로
		// aa.txt     : 현재 위치(디렉토리)의 aa.txt
		// /aa.txt    : 루트 위치(D:)의 aa.txt
		// ./aa.txt   : 현재 위치(디렉토리)의 aa.txt
		// ../aa.txt  : 상위 위치(현재 디렉토리의 상위 디렉토리)의 aa.txt
		
		File f3 = new File("src/../src/quiz/Quiz01.java");
		System.out.println(f3.getPath());
		System.out.println(f3.getAbsolutePath());
		try {
			System.out.println(f3.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
















