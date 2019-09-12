package basic;

public class Test02 {
	public static void main(String[] args) {
		// MyMethod에 정의한 메서드들을 실행해보기 (=메서드 호출)
		
		// 메서드를 사용하려면 객체 생성 해야 함 
		MyMethod my = new MyMethod();
		
		double d = my.getCircleArea(10); 
		System.out.println(d);
		
		System.out.println( my.getCircleArea(100) );
		
		System.out.println("랜덤값 : " + my.getRandom());
		System.out.println("랜덤값 : " + my.getRandom());
		System.out.println("랜덤값 : " + my.getRandom());
		
		my.printInfo("피카츄", 10);
		my.printInfo("홍길동", 25);
		
		//////////////////////////////////////////////
		int data = my.getSum(10, 1);
		System.out.println(data);
		//System.out.println(my.getSum(10, 1));
		
		double data2 = my.calc(10, 3, '*');
		System.out.println(data2);
		
		System.out.println(my.getRandomName());
	}
}












