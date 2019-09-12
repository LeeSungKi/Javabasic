package basic;

public class Test02 {
	public static void main(String[] args) {
		int a = 124;
		int n[] = new int[3];
//		while(a != 0) {
//			System.out.println(a);
//			System.out.println(a % 10);
//			a /= 10;
//		}
		for(int i = 2; i >= 0; --i) {
			n[i] = a % 10;
			a /= 10;
		}
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
	}
}
