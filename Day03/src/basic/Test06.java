package basic;

public class Test06 {
	public static void main(String[] args) {
		int r = 1;
		
		while(r <= 10) { 
			System.out.println(r++);
		}
		System.out.println("������ r : " + r); // 11
		
		///////////////////////////////
		// 300 ���� ���� 3�� ��� ���
		int n = 3;
		while(true) {
			System.out.println(n);
			n += 3;
			if(n >= 300) {
				break; // while�� ����
			}
		}
	}
}




