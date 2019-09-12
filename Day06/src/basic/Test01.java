package basic;

public class Test01 {
	public static void main(String[] args) {
		String[] names = { "피카츄", "라이츄", "파이리", "푸린" };
		
//		for(int i = 0; i < names.length; ++i) {
//			names[i] = "없음"; // 일반 for문은 원소 변경 가능
//		}
		
		for( String n : names ) { // for ( 임시변수 선언 : 배열명 )
			n = "없음"; // n은 임시변수(다른 변수)이기 때문에 여기에 값을 넣어도 소용없음
					   // 확장for문은 원소를 수정하지 않는 경우에만 사용함
					   // (읽기전용!) 
		}
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
	}
}
