package basic;
/*
 * < 배열(Array) >
 * - '같은 자료형' 데이터를 '여러 개' 저장할 수 있는 서랍장 같은 메모리
 * - 변수 : 서랍 1칸
 *   배열 : 서랍장
 * - 배열의 각 데이터(칸)는 index를 사용하여 접근 (0번부터 센다)
 *   index : ~~번 째 
 * 
 * - 20명의 이름들을 저장?
 *   방법1. 변수를 20개 선언 ---> 반복문 X
 *   방법2. 20칸짜리 배열 1개 선언 ---> 반복문 O (인덱스 사용)
 *   
 */
public class Test01 {
	public static void main(String[] args) {
		// 이름 5개를 저장할 String형 배열 선언
		
		/*
		 *  int[] , double[], 자료형[] 
		 *                    ------
		 *                    	배열의 주소(레퍼런스)를 의미하는 자료형
		 *                    
		 *  String[] s;
		 *  -------- -
		 *   자료형     변수명 ===> 변수 선언 
		 *   뜻 : String형 배열의 주소를 저장할 변수 s
		 *   
		 *  int[] arr;
		 *   뜻 : int형 배열의 주소를 저장할 변수 arr
		 *  
		 *  ==> '배열명' 역할을 함
		 *  
		 *   int[] n; 
		 *   int n[];
		 *   ( 둘은 같은 의미 )
		 * 
		 * ** 참고) 배열은 Heap 이라는 메모리 영역에 만들어진다. 
		 *         이때, Heap은 주소로만 접근 가능
		 *         배열의 주솟값을 보관해놔야 배열을 사용할 수 있다. 
		 *         --------------
		 *         	   배열의 참조변수(=주소를 저장하는 변수)
		 *         
		 *  < 배열의 생성 >
		 *  1. new 자료형[칸의 개수]
		 *  
		 *  2. new 자료형[] { 원소1, 원소2, 원소 3, .. }
		 *  
		 *  3. { 원소1, 원소2, 원소3, ... } 
		 *  
		 *   ==> 해당 배열이 생성되면 자동으로 코드 자리에 배열의 시작주소가 반환됨 
		 *   
		 */
		
		// 방법1.
		String[] names1;
		names1 = new String[5]; 
		names1[0] = "홍길동"; 
		names1[1] = "고길동"; 
		names1[2] = "이푸린"; 
		names1[3] = "김피카츄"; 
		names1[4] = "박라이츄"; 
		
		
		
		System.out.println(names1);
//		System.out.println(names1[0]);
//		System.out.println(names1[1]);
//		System.out.println(names1[2]);
//		System.out.println(names1[3]);
//		System.out.println(names1[4]);
//		** 배열명.length : 배열의 전체 칸 개수 (int형)
		for(int i = 0; i < names1.length; ++i) {
			System.out.println(names1[i]);
		}
		
		// 방법2.
		String[] names2;
		names2 = new String[] {"AA", "BB", "CC", "DD", "EE"};
		
		// 방법3.
//		String[] names3;
//		names3 = { "가", "나", "다", "라", "마"}; // 에러!
		
	}
}










