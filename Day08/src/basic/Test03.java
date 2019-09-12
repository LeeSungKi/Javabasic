package basic;
/*
 * < ���ȣ��(Recursive call) >
 * - �޼��� ���ο��� �޼��� �ڱ� �ڽ��� ȣ���ϴ� ��
 */
class Sample3 {
	void aa(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		aa(n-1); 
	}
	
	int fact(int n) { // n:5
		if(n == 1) {
			return 1;
		}
		return n * fact(n-1); 
	}
}

public class Test03 {
	public static void main(String[] args) {
		Sample3 s = new Sample3();
		s.aa(10);
		System.out.println(s.fact(5)); //120
	}
}




