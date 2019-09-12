package basic;
/*
 * < 가변 인자 >
 *  -> 인자값의 개수가 유동적인 메서드
 * 형식 : (매개변수 자리에) 자료형... 변수명
 * 주의! 
 * 	1. 배열 형태로 들어온다. 
 *  2. 매개변수 선언부의 가장 마지막에 선언한다. 
 */
class Sample2 {
	void aa(String... s) {
		for(int i = 0; i < s.length; ++i) {
			System.out.println("인자값 : " + s[i]);
		}
	}
	
	void bb(String str, int... nums) {
		System.out.println("bb() 실행");
		System.out.println(str);
		for(int i = 0; i < nums.length; ++i) {
			System.out.println(nums[i]);
		}
	}
	void cc(int[] nums) {
		System.out.println("cc() 실행");
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
		
		s.bb("ㅋㅋㅋ", 1, 2, 3, 4, 5, 6, 7, 8, 9,10);
		
		int[] arr = {10, 20, 30, 40};
		s.bb("ㅎㅎㅎ", arr);
		
		s.cc(arr);
		// s.cc(1,2,3,4); // 에러!
	}
}







