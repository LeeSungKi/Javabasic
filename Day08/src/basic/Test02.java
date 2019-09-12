package basic;
/*
 * < ���� ���� >
 *  -> ���ڰ��� ������ �������� �޼���
 * ���� : (�Ű����� �ڸ���) �ڷ���... ������
 * ����! 
 * 	1. �迭 ���·� ���´�. 
 *  2. �Ű����� ������� ���� �������� �����Ѵ�. 
 */
class Sample2 {
	void aa(String... s) {
		for(int i = 0; i < s.length; ++i) {
			System.out.println("���ڰ� : " + s[i]);
		}
	}
	
	void bb(String str, int... nums) {
		System.out.println("bb() ����");
		System.out.println(str);
		for(int i = 0; i < nums.length; ++i) {
			System.out.println(nums[i]);
		}
	}
	void cc(int[] nums) {
		System.out.println("cc() ����");
		for(int i = 0; i < nums.length;++i) {
			System.out.println(nums[i]);
		}
	}
}
public class Test02 {
	public static void main(String[] args) {
		Sample2 s = new Sample2();
		s.aa("a");
		s.aa("a", "b", "c");
		
		s.bb("������", 1, 2, 3, 4, 5, 6, 7, 8, 9,10);
		
		int[] arr = {10, 20, 30, 40};
		s.bb("������", arr);
		
		s.cc(arr);
		// s.cc(1,2,3,4); // ����!
	}
}







