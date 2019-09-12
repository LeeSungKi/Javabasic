package basic;

public class Test01 {
	public static void main(String[] args) {
		int n = 1;
		do {
			System.out.println(n);
			++n;
		} while( n <= 10);
		
		int a = 10;
		while( a > 100) { // 처음부터 false
			System.out.println("while문 실행!");
		}
		
		do {
			System.out.println("do-while문 실행!");
		} while( a > 100);  // 처음부터 false
		
		// do-while 문은 조건식 상관없이 무조건 최소 1회는 실행됨
		
		/*
		
		while(조건식){
			종속문장
		}
		순서 : () -> true -> {} -> () -> true -> ...
		
		do {
			종속문장
		} while(조건식);
		순서 : {} -> () -> true -> {} -> () -> true -> {}..
		
		*/
	}
}



