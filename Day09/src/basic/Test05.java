package basic;

import basic2.Pokemon; // import 선언

// basic2의 모든 클래스 import 하기
//import basic2; // 에러!
import basic2.*; 

public class Test05 {
	public static void main(String[] args) {
		// Pokemon p = new Pokemon(); // 에러!
		
		// 다른 패키지의 클래스를 사용하려면..
		// 방법1. 클래스의 풀네임 (패키지명.클래스명)을 쓰는 방법
		basic2.Pokemon p1 = new basic2.Pokemon();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// 방법2. import 선언 방법
		// (소스파일 상단에) import 패키지명.클래스명;
		Pokemon p2 = new Pokemon();
		
		// p2.name = "피카츄"; // 에러!
	}
}
